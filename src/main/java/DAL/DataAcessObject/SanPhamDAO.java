package DAL.DataAcessObject;

import DAL.DataModels.SanPham;

import java.util.List;

public class SanPhamDAO extends AbtractAccessDatabase<SanPham> implements ISimpleAccess<SanPham, Integer> {

    {
        setClazz(SanPham.class);
    }

    @Override
    public boolean insert(SanPham sanPham) {
        return executeUpdate("INSERT INTO SanPham(TENSP, MOTA, SOLUONG, HINHANH, GIATIEN, MALOAI, MANCC, IS_DELETED) VALUES(?,?,?,?,?,?,?,?)",
                sanPham.getTenSP(), sanPham.getMoTa(), sanPham.getSoLuong(), sanPham.getHinhAnh(), sanPham.getGiaTien(), sanPham.getMaLoai(), sanPham.getMaNCC(), sanPham.isDeleted());

    }

    @Override
    public boolean delete(Integer maSanPham) {
        return executeUpdate("UPDATE SanPham SET IS_DELETED = 1 WHERE MASP = ?", maSanPham);
    }

    @Override
    public boolean update(Integer maSanPham, SanPham sanPham) {
        return executeUpdate("UPDATE SanPham SET TENSP = ?, MOTA = ?, SOLUONG = ?, HINHANH = ?, GIATIEN = ?, MALOAI = ?, MANCC = ?, IS_DELETED = ? WHERE MASP = ?",
                sanPham.getTenSP(), sanPham.getMoTa(), sanPham.getSoLuong(), sanPham.getHinhAnh(), sanPham.getGiaTien(), sanPham.getMaLoai(), sanPham.getMaNCC(), sanPham.isDeleted(), maSanPham);
    }

    @Override
    public SanPham select(Integer maSanPham) {
        return executeQuery("SELECT * FROM SanPham WHERE MASP = ? AND IS_DELETED = 0", maSanPham);
    }

    @Override
    public List<SanPham> selectAll() {
        return executeQueryList("SELECT * FROM SanPham WHERE IS_DELETED = 0");
    }
}
