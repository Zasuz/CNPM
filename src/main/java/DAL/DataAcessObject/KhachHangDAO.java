package DAL.DataAcessObject;

import DAL.DataModels.KhachHang;

import java.util.List;

public class KhachHangDAO extends AbtractAccessDatabase<KhachHang> implements ISimpleAccess<KhachHang,Integer> {
    {
        setClazz(KhachHang.class);
    }

    @Override
    public boolean insert(KhachHang khachHang) {
        return executeUpdate("INSERT INTO KHACHHANG(TENKH,GIOITINH,SODIENTHOAI,DIACHI,EMAIL,DIEMTHUONG,IS_DELETED) VALUES(?,?,?,?,?,?,?)",
                khachHang.getTenKH(),khachHang.isGioiTinh(),khachHang.getSoDienThoai(),khachHang.getDiaChi(),khachHang.getEmail(),khachHang.getDiemThuong(),khachHang.isDeleted());
    }

    @Override
    public boolean delete(Integer maKhachHang) {
        return executeUpdate("UPDATE KHACHHANG SET IS_DELETED = 1 WHERE MAKH = ?",maKhachHang);
    }

    @Override
    public boolean update(Integer maKhachHang, KhachHang khachHang) {
        return executeUpdate("UPDATE KHACHHANG SET TENKH = ?, GIOITINH = ?, SODIENTHOAI = ?, DIACHI = ?, EMAIL = ?, DIEMTHUONG = ?, IS_DELETED = ? WHERE MAKH = ?",
                khachHang.getTenKH(),khachHang.isGioiTinh(),khachHang.getSoDienThoai(),khachHang.getDiaChi(),khachHang.getEmail(),khachHang.getDiemThuong(),khachHang.isDeleted(),maKhachHang);
    }

    @Override
    public KhachHang select(Integer maKhachHang) {
        return executeQuery("SELECT * FROM KHACHHANG WHERE MAKH = ? AND IS_DELETED = 0",maKhachHang);
    }

    @Override
    public List<KhachHang> selectAll() {
        return executeQueryList("SELECT * FROM KHACHHANG WHERE IS_DELETED = 0");
    }
}
