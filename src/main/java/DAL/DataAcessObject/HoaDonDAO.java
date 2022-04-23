package DAL.DataAcessObject;

import DAL.DataModels.HoaDon;

import java.util.List;

public class HoaDonDAO extends AbtractAccessDatabase<HoaDon> implements ISimpleAccess<HoaDon,Integer> {

    {
        setClazz(HoaDon.class);
    }

    @Override
    public boolean insert(HoaDon hoaDon) {
        return executeUpdate("INSERT INTO HOADON(NGAYHD,HINHTHUC,TONGTIEN,TIENGIAM,MANV,MAKH,SOVOUCHER,IS_DELETED) VALUES(?,?,?,?,?,?,?,?)",
                hoaDon.getNgayHD(),hoaDon.getHinhThuc(),hoaDon.getTongTien(),hoaDon.getTienGiam(),hoaDon.getMaNV(),hoaDon.getMaKH(),hoaDon.getSoVoucher(),hoaDon.isDeleted());
    }

    @Override
    public boolean delete(Integer maHoaDon) {
        return executeUpdate("UPDATE HOADON SET IS_DELETED = 1 WHERE MAHD = ?",maHoaDon);
    }

    @Override
    public boolean update(Integer maHoaDon, HoaDon hoaDon) {
        return executeUpdate("UPDATE HOADON SET NGAYHD = ?,HINHTHUC = ?,TONGTIEN = ?,TIENGIAM = ?,MANV = ?,MAKH = ?,SOVOUCHER = ?,IS_DELETED = ? WHERE MAHD = ?",
                hoaDon.getNgayHD(),hoaDon.getHinhThuc(),hoaDon.getTongTien(),hoaDon.getTienGiam(),hoaDon.getMaNV(),hoaDon.getMaKH(),hoaDon.getSoVoucher(),hoaDon.isDeleted(),maHoaDon);
    }

    @Override
    public HoaDon select(Integer maHoaDon) {
        return executeQuery("SELECT * FROM HOADON WHERE MAHD = ? AND IS_DELETED = 0",maHoaDon);
    }

    @Override
    public List<HoaDon> selectAll() {
        return executeQueryList("SELECT * FROM HOADON WHERE IS_DELETED = 0");
    }
}
