package DAL.DataAcessObject;

import DAL.DataModels.PhieuHuy;

import java.util.List;

public class PhieuHuyDAO extends AbtractAccessDatabase<PhieuHuy> implements ISimpleAccess<PhieuHuy,Integer> {
    {
        setClazz(PhieuHuy.class);
    }

    @Override
    public boolean insert(PhieuHuy PhieuHuy) {
        return executeUpdate("INSERT INTO PhieuHuy(NGAYLAP,MANV,IS_DELETED) VALUES(?,?,?)",
                PhieuHuy.getNgayLap(),PhieuHuy.getMaNV(),PhieuHuy.isDeleted());
    }

    @Override
    public boolean delete(Integer maPhieuHuy) {
        return executeUpdate("UPDATE PhieuHuy SET IS_DELETED = 1 WHERE MAPHIEU = ?",maPhieuHuy);
    }

    @Override
    public boolean update(Integer maPhieuHuy, PhieuHuy PhieuHuy) {
        return executeUpdate("UPDATE PhieuHuy SET NGAYLAP = ?, MANV = ?, IS_DELETED = ? WHERE MAPHIEU = ?",
                PhieuHuy.getNgayLap(),PhieuHuy.getMaNV(),PhieuHuy.isDeleted(),maPhieuHuy);
    }

    @Override
    public PhieuHuy select(Integer maPhieuHuy) {
        return executeQuery("SELECT * FROM PhieuHuy WHERE MAPHIEU = ? AND IS_DELETED = 0",maPhieuHuy);
    }

    @Override
    public List<PhieuHuy> selectAll() {
        return executeQueryList("SELECT * FROM PhieuHuy WHERE IS_DELETED = 0");
    }
}
