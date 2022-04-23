package DAL.DataAcessObject;

import DAL.DataModels.LoaiSanPham;

import java.util.List;

public class LoaiSanPhamDAO extends AbtractAccessDatabase<LoaiSanPham> implements ISimpleAccess<LoaiSanPham, Integer> {

    {
        setClazz(LoaiSanPham.class);
    }

    @Override
    public boolean insert(LoaiSanPham loaiSanPham) {
        return executeUpdate("INSERT INTO LOAISANPHAM(TENLOAI,MOTA,IS_DELETED) VALUES(?,?,?)",
                loaiSanPham.getTenLoai(),loaiSanPham.getMoTa(),loaiSanPham.isDeleted());
    }

    @Override
    public boolean delete(Integer maLoaiSanPham) {
        return executeUpdate("UPDATE LOAISANPHAM SET IS_DELETED = 1 WHERE MALOAI = ?", maLoaiSanPham);
    }

    @Override
    public boolean update(Integer maLoaiSanPham, LoaiSanPham loaiSanPham) {
        return executeUpdate("UPDATE LOAISANPHAM SET TENLOAI = ?, MOTA = ?, IS_DELETED = ? WHERE MALOAI = ?",
                loaiSanPham.getTenLoai(),loaiSanPham.getMoTa(),loaiSanPham.isDeleted(),maLoaiSanPham);
    }

    @Override
    public LoaiSanPham select(Integer maLoaiSanPham) {
        return executeQuery("SELECT * FROM LOAISANPHAM WHERE MALOAI = ? AND IS_DELETED = 0", maLoaiSanPham);
    }

    @Override
    public List<LoaiSanPham> selectAll() {
        return executeQueryList("SELECT * FROM LOAISANPHAM WHERE IS_DELETED = 0");
    }
}
