package DAL.DataAcessObject;

import DAL.DataModels.PhieuNhap;

import java.util.List;

public class PhieuNhapDAO extends AbtractAccessDatabase<PhieuNhap> implements ISimpleAccess<PhieuNhap,Integer> {
    {
        setClazz(PhieuNhap.class);
    }

    @Override
    public boolean insert(PhieuNhap phieuNhap) {
        return executeUpdate("INSERT INTO PHIEUNHAP(NGAYLAP,MANV,IS_DELETED) VALUES(?,?,?)",
                phieuNhap.getNgayLap(),phieuNhap.getMaNV(),phieuNhap.isDeleted());
    }

    @Override
    public boolean delete(Integer maPhieuNhap) {
        return executeUpdate("UPDATE PHIEUNHAP SET IS_DELETED = 1 WHERE MAPHIEU = ?",maPhieuNhap);
    }

    @Override
    public boolean update(Integer maPhieuNhap, PhieuNhap phieuNhap) {
        return executeUpdate("UPDATE PHIEUNHAP SET NGAYLAP = ?, MANV = ?, IS_DELETED = ? WHERE MAPHIEU = ?",
                phieuNhap.getNgayLap(),phieuNhap.getMaNV(),phieuNhap.isDeleted(),maPhieuNhap);
    }

    @Override
    public PhieuNhap select(Integer maPhieuNhap) {
        return executeQuery("SELECT * FROM PHIEUNHAP WHERE MAPHIEU = ? AND IS_DELETED = 0",maPhieuNhap);
    }

    @Override
    public List<PhieuNhap> selectAll() {
        return executeQueryList("SELECT * FROM PHIEUNHAP WHERE IS_DELETED = 0");
    }
}
