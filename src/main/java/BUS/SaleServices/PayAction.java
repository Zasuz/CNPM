/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS.SaleServices;

import DAL.DataAcessObject.ChiTietHoaDonDAO;
import DAL.DataAcessObject.GiamGiaSPDAO;
import DAL.DataAcessObject.HoaDonDAO;
import DAL.DataAcessObject.SanPhamDAO;
import DAL.DataAcessObject.VoucherDAO;
import DAL.DataModels.ChiTietHoaDon;
import DAL.DataModels.GiamGiaSP;
import DAL.DataModels.HoaDon;
import DAL.DataModels.SanPham;
import DAL.DataModels.Voucher;
import GUI.SaleGroup.SellerGUI.Component.MenuItem;
import java.awt.Component;
import java.sql.Timestamp;
import javax.swing.JPanel;

/**
 *
 * @author TuanMinh
 */
public class PayAction {
    private final GiamGiaSPDAO giamGiaDAO = new GiamGiaSPDAO();
    private final SanPhamDAO sanPhamDAO = new SanPhamDAO();
    private final HoaDonDAO hoaDonDAO = new HoaDonDAO();
    private final ChiTietHoaDonDAO CTHoaDonDAO = new ChiTietHoaDonDAO();
    private final VoucherDAO voucherDAO = new VoucherDAO();
    private final CheckInfoSale check = new CheckInfoSale();
    
    private HoaDon hoaDon;
    private ChiTietHoaDon CTHoaDon;
    private int maHD;
    private int maKH, maNV, soVoucher;
    private long total;

//    public int getMaHD() {
//        return maHD;
//    }

    public void setMaHD() {
        this.maHD = hoaDonDAO.selectNewestBill().getMaHD();
    }

//    public int getMaKH() {
//        return maKH;
//    }

    public void setMaKH(int maKH) {
        this.maKH = maKH;
    }

//    public int getMaNV() {
//        return maNV;
//    }

    public void setMaNV(int maNV) {
        this.maNV = maNV;
    }

//    public int getSoVoucher() {
//        return soVoucher;
//    }

    public void setSoVoucher(String maVoucher) {
        this.soVoucher = voucherDAO.select(maVoucher).getSoVoucher();
    }
            
    
    
    
    //Hàm tính giá trị giảm của sản phẩm
    public double discountProduct(int maSP){
        GiamGiaSP giamGiaSP = giamGiaDAO.selectByMaSP(maSP);
        SanPham sanPham = sanPhamDAO.select(maSP);
        return (giamGiaSP == null) ? 0 : ((giamGiaSP.getPtGiam() * sanPham.getGiaTien())*1.0 / 100);
    }
    
    //Hàm tính tổng giá trị hóa đơn
    public double totalBill(JPanel PaymentPanel){
        //tạm thời để không lỗi
        double sum  = 0;
        for(Component c : PaymentPanel.getComponents()){
            if(c instanceof MenuItem menuItem){
                c = menuItem;
//                sanPham = sanPhamDAO.select(c.getMaSP);
//                sum += sanPham.getGiaTien()*c.getSoLuong();
            }
        }
        total = (long)sum;
        return sum;
    }
    
    //Hàm tính giá trị giảm của voucher
    public long discountBill(String maVoucher){
        Voucher voucher = voucherDAO.select(maVoucher);
        if(check.hasVoucher(maVoucher))
            if(total >= voucher.getGiaTriToiThieu())
                return (long) voucher.getKmToiDa() > (voucher.getPtGiam()*total) ? (voucher.getPtGiam()*total) : voucher.getKmToiDa();
        return 0;
    }
    
    //Lưu hóa đơn
    public boolean storeBill(String hinhthuc, String maVoucher){
        hoaDon = new HoaDon(0,new Timestamp(System.currentTimeMillis()),hinhthuc,
                total, discountBill(maVoucher), this.maNV, this.maKH, this.soVoucher,false);
        if(hoaDonDAO.insert(hoaDon)){
            this.setMaHD();
            return true;
        }
        return false;
    }
    
    //Lưu danh sách sản phẩm vào chi tiết hóa đơn
    public boolean storeBillDetail(JPanel PaymentPanel,int maHD){
        //cờ kiểm tra xem có lưu được dữ liệu không
        boolean flag = true;
        long giaSP, giaGiamSP;
        int maSP;
        for( Component c : PaymentPanel.getComponents()){
            if(c instanceof MenuItem){
                
                MenuItem menuItem = (MenuItem) c;
                maSP = menuItem.getMaSP();
                giaGiamSP = (long) discountProduct(maSP);
                giaSP = sanPhamDAO.select(maSP).getGiaTien();
                
                //CTHoaDon = new ChiTietHoaDon(maSP,maHD,menuItem.getSoLuong(),(giaSP - giaGiamSP));
                flag = CTHoaDonDAO.insert(CTHoaDon);
            }
        }
        return flag;
    }
}
