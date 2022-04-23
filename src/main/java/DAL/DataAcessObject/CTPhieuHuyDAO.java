package DAL.DataAcessObject;

import DAL.DataModels.ChiTietPhieuHuy;

import java.util.List;

public class CTPhieuHuyDAO extends AbtractAccessDatabase<ChiTietPhieuHuy> implements ISimpleAccessDetail<ChiTietPhieuHuy, Integer, Integer> {
    {
        setClazz(ChiTietPhieuHuy.class);
    }

    @Override
    public ChiTietPhieuHuy select(Integer maPhieu, Integer maSP) {
        return executeQuery("SELECT * FROM CTPhieuHuy WHERE MAPHIEU = ? AND MASP = ?", maPhieu,maSP);
    }

    @Override
    public boolean insert(ChiTietPhieuHuy chiTietPhieuHuy) {
        return executeUpdate("INSERT INTO CTPhieuHuy(MAPHIEU,MASP,SOLUONG) VALUES(?,?,?)",
                chiTietPhieuHuy.getMaPhieu(),chiTietPhieuHuy.getMaSP(),chiTietPhieuHuy.getSoLuong());
    }

    @Override
    public boolean update(Integer maPhieu, Integer maSP, ChiTietPhieuHuy chiTietPhieuHuy) {
        return executeUpdate("UPDATE CTPhieuHuy SET MAPHIEU = ?, MASP = ?, SOLUONG = ? WHERE MAPHIEU = ? AND MASP = ?",
                chiTietPhieuHuy.getMaPhieu(),chiTietPhieuHuy.getMaSP(),chiTietPhieuHuy.getSoLuong(),maPhieu,maSP);
    }

    @Override
    public boolean delete(Integer maPhieu, Integer maSP) {
        return executeUpdate("DELETE FROM CTPhieuHuy WHERE MAPHIEU = ? AND MASP = ?", maPhieu,maSP);
    }

    @Override
    public List<ChiTietPhieuHuy> selectAllById1(Integer maPhieu) {
        return executeQueryList("SELECT * FROM CTPhieuHuy WHERE MAPHIEU = ?", maPhieu);
    }

    @Override
    public List<ChiTietPhieuHuy> selectAllById2(Integer maSP) {
        return executeQueryList("SELECT * FROM CTPhieuHuy WHERE MASP = ?", maSP);
    }

    @Override
    public List<ChiTietPhieuHuy> selectAll() {
        return executeQueryList("SELECT * FROM CTPhieuHuy");
    }
}
