package DAL.DataAcessObject;

import DAL.DataModels.ChiTietHoaDon;

import java.util.List;

public class ChiTietHoaDonDAO extends AbtractAccessDatabase<ChiTietHoaDon> implements ISimpleAccessDetail<ChiTietHoaDon,Integer,Integer> {

    {
        setClazz(ChiTietHoaDon.class);
    }

    @Override
    public ChiTietHoaDon select(Integer maHoaDon, Integer maSanPham) {
        return executeQuery("SELECT * FROM CTHOADON WHERE MAHD = ? AND MASP = ?",maHoaDon,maSanPham);
    }

    @Override
    public boolean insert(ChiTietHoaDon chiTietHoaDon) {
        return executeUpdate("INSERT INTO CTHOADON(MAHD,MASP,SOLUONG,GIATIEN) VALUES(?,?,?,?)",chiTietHoaDon.getMaHD(),chiTietHoaDon.getMaSP(),chiTietHoaDon.getSoLuong(),chiTietHoaDon.getGiaTien());
    }

    @Override
    public boolean update(Integer maHoaDon, Integer maSanPham, ChiTietHoaDon chiTietHoaDon) {
        return executeUpdate("UPDATE CTHOADON SET SOLUONG = ?, GIATIEN = ? WHERE MAHD = ? AND MASP = ?",chiTietHoaDon.getSoLuong(),chiTietHoaDon.getGiaTien(),maHoaDon,maSanPham);
    }

    @Override
    public boolean delete(Integer maHoaDon, Integer maSanPham) {
        return executeUpdate("DELETE FROM CTHOADON WHERE MAHD = ? AND MASP = ?",maHoaDon,maSanPham);
    }

    @Override
    public List<ChiTietHoaDon> selectAllById1(Integer maHoaDon) {
        return executeQueryList("SELECT * FROM CTHOADON WHERE MAHD = ?",maHoaDon);
    }

    @Override
    public List<ChiTietHoaDon> selectAllById2(Integer maSanPham) {
        return executeQueryList("SELECT * FROM CTHOADON WHERE MASP = ?",maSanPham);
    }

    @Override
    public List<ChiTietHoaDon> selectAll() {
        return executeQueryList("SELECT * FROM CTHOADON");
    }
}
