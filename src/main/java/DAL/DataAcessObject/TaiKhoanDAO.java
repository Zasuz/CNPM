package DAL.DataAcessObject;

import DAL.DataModels.TaiKhoan;

import java.util.List;

public class TaiKhoanDAO extends AbtractAccessDatabase<TaiKhoan> implements ISimpleAccess<TaiKhoan,Integer> {
    {
        setClazz(TaiKhoan.class);
    }

    @Override
    public boolean insert(TaiKhoan taiKhoan) {
        return executeUpdate("INSERT INTO TAIKHOAN(TENTK,MATKHAU,MANV,SOLANSAI,NGAYTAO,IS_DELETED) VALUES(?,?,?,?,?,?)",
                taiKhoan.getTenTK(),taiKhoan.getMatKhau(),taiKhoan.getMaNV(),taiKhoan.getSoLanSai(),taiKhoan.getNgayTao(),taiKhoan.isDeleted());
    }

    @Override
    public boolean delete(Integer soTaiKhoan) {
        return executeUpdate("UPDATE TAIKHOAN SET IS_DELETED = 1 WHERE SOTK = ?",soTaiKhoan);
    }

    @Override
    public boolean update(Integer soTaiKhoan, TaiKhoan taiKhoan) {
        return executeUpdate("UPDATE TAIKHOAN SET TENTK = ?, MATKHAU = ?, MANV = ?, SOLANSAI = ?, NGAYTAO = ?, IS_DELETED = ? WHERE SOTK = ?",
                taiKhoan.getTenTK(),taiKhoan.getMatKhau(),taiKhoan.getMaNV(),taiKhoan.getSoLanSai(),taiKhoan.getNgayTao(),taiKhoan.isDeleted(),soTaiKhoan);
    }

    @Override
    public TaiKhoan select(Integer soTaiKhoan) {
        return executeQuery("SELECT * FROM TAIKHOAN WHERE SOTK = ? AND IS_DELETED = 0",soTaiKhoan);
    }

    @Override
    public List<TaiKhoan> selectAll() {
        return executeQueryList("SELECT * FROM TAIKHOAN WHERE IS_DELETED = 0");
    }

    public TaiKhoan selectByTenTK(String username){
        return executeQuery("SELECT * FROM TAIKHOAN WHERE TENTK = ? AND IS_DELETED = 0",username);
    }
}
