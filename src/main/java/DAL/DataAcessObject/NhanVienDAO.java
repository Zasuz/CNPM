package DAL.DataAcessObject;

import DAL.DataModels.NhanVien;

import java.util.List;

public class NhanVienDAO extends AbtractAccessDatabase<NhanVien> implements ISimpleAccess<NhanVien,Integer>{
    {
        setClazz(NhanVien.class);
    }

    @Override
    public boolean insert(NhanVien nhanVien) {
        return executeUpdate("INSERT INTO NHANVIEN(TENNV,GIOITINH,CMND,NGAYSINH,SODIENTHOAI,EMAIL,DIACHI,NGAYTHAMGIA,MACHUCVU,IS_DELETED) VALUES(?,?,?,?,?,?,?,?,?,?)",
                nhanVien.getTenNV(),nhanVien.isGioiTinh(),nhanVien.getCmnd(),nhanVien.getNgaySinh(),nhanVien.getSoDienThoai(),nhanVien.getEmail(),nhanVien.getDiaChi(),nhanVien.getNgayThamGia(),nhanVien.getMaChucVu(),nhanVien.isDeleted());
    }

    @Override
    public boolean delete(Integer maNhanVien) {
        return executeUpdate("UPDATE NHANVIEN SET IS_DELETED = 1 WHERE MANV = ?",maNhanVien);
    }

    @Override
    public boolean update(Integer maNhanVien, NhanVien nhanVien) {
        return executeUpdate("UPDATE NHANVIEN SET TENNV = ?, GIOITINH = ?, CMND = ?, NGAYSINH = ?, SODIENTHOAI = ?, EMAIL = ?, DIACHI = ?, NGAYTHAMGIA = ?, MACHUCVU = ?, IS_DELETED = ? WHERE MANV = ?",
                nhanVien.getTenNV(),nhanVien.isGioiTinh(),nhanVien.getCmnd(),nhanVien.getNgaySinh(),nhanVien.getSoDienThoai(),nhanVien.getEmail(),nhanVien.getDiaChi(),nhanVien.getNgayThamGia(),nhanVien.getMaChucVu(),nhanVien.isDeleted(),maNhanVien);
    }

    @Override
    public NhanVien select(Integer maNhanVien) {
        return executeQuery("SELECT * FROM NHANVIEN WHERE MANV = ? AND IS_DELETED = 0",maNhanVien);
    }

    @Override
    public List<NhanVien> selectAll() {
        return null;
    }
}
