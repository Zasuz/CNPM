package DAL.DataAcessObject;

import DAL.DataModels.ChiTietPhieuNhap;

import java.util.List;

public class CTPhieuNhapDAO extends AbtractAccessDatabase<ChiTietPhieuNhap> implements ISimpleAccessDetail<ChiTietPhieuNhap, Integer, Integer> {
    {
        setClazz(ChiTietPhieuNhap.class);
    }

    @Override
    public ChiTietPhieuNhap select(Integer maPhieu, Integer maSP) {
        return executeQuery("SELECT * FROM CTPHIEUNHAP WHERE MAPHIEU = ? AND MASP = ?", maPhieu,maSP);
    }

    @Override
    public boolean insert(ChiTietPhieuNhap chiTietPhieuNhap) {
        return executeUpdate("INSERT INTO CTPHIEUNHAP(MAPHIEU,MASP,SOLUONG) VALUES(?,?,?)",
                chiTietPhieuNhap.getMaPhieu(),chiTietPhieuNhap.getMaSP(),chiTietPhieuNhap.getSoLuong());
    }

    @Override
    public boolean update(Integer maPhieu, Integer maSP, ChiTietPhieuNhap chiTietPhieuNhap) {
        return executeUpdate("UPDATE CTPHIEUNHAP SET MAPHIEU = ?, MASP = ?, SOLUONG = ? WHERE MAPHIEU = ? AND MASP = ?",
                chiTietPhieuNhap.getMaPhieu(),chiTietPhieuNhap.getMaSP(),chiTietPhieuNhap.getSoLuong(),maPhieu,maSP);
    }

    @Override
    public boolean delete(Integer maPhieu, Integer maSP) {
        return executeUpdate("DELETE FROM CTPHIEUNHAP WHERE MAPHIEU = ? AND MASP = ?", maPhieu,maSP);
    }

    @Override
    public List<ChiTietPhieuNhap> selectAllById1(Integer maPhieu) {
        return executeQueryList("SELECT * FROM CTPHIEUNHAP WHERE MAPHIEU = ?", maPhieu);
    }

    @Override
    public List<ChiTietPhieuNhap> selectAllById2(Integer maSP) {
        return executeQueryList("SELECT * FROM CTPHIEUNHAP WHERE MASP = ?", maSP);
    }

    @Override
    public List<ChiTietPhieuNhap> selectAll() {
        return executeQueryList("SELECT * FROM CTPHIEUNHAP");
    }
}
