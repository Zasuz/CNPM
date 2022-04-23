package DAL.DataAcessObject;

import DAL.DataModels.Voucher;

import java.util.List;

public class VoucherDAO extends AbtractAccessDatabase<Voucher> implements ISimpleAccess<Voucher,String> {
    {
        setClazz(Voucher.class);
    }

    @Override
    public boolean insert(Voucher vouvher) {
        return executeUpdate("INSERT INTO VOUCHER(MAVOUCHER,MOTA,NGAYBD,NGAYKT,GIATRITOITHIEU,KMTOIDA,PTGIAM,SOLUOTSD,IS_DELETED) VALUES(?,?,?,?,?,?,?,?,?)",
                vouvher.getMaVoucher(),vouvher.getMoTa(),vouvher.getNgayBD(),vouvher.getNgayKT(),vouvher.getGiaTriToiThieu(),vouvher.getGiaTriToiThieu(),vouvher.getKmToiDa(),vouvher.getPtGiam(),vouvher.getSoLuotSD(),vouvher.isDeleted());
    }

    @Override
    public boolean delete(String maVoucher) {
        return executeUpdate("UPDATE VOUCHER SET IS_DELETED = 1 WHERE MAVOUCHER = ?",maVoucher);
    }

    @Override
    public boolean update(String maVoucher, Voucher voucher) {
        return executeUpdate("UPDATE VOUCHER SET MOTA = ?, NGAYBD = ?, NGAYKT = ?, GIATRITOITHIEU = ?, KMTOIDA = ?, PTGIAM = ?, SOLUOTSD = ?, IS_DELETED = ? WHERE MAVOUCHER = ?",
               voucher.getMoTa(),voucher.getNgayBD(),voucher.getNgayKT(),voucher.getGiaTriToiThieu(),voucher.getKmToiDa(),voucher.getPtGiam(),voucher.getSoLuotSD(),voucher.isDeleted(),maVoucher);
    }

    @Override
    public Voucher select(String maVoucher) {
        return executeQuery("SELECT * FROM VOUCHER WHERE MAVOUCHER = ? AND IS_DELETED = 0",maVoucher);
    }

    @Override
    public List<Voucher> selectAll() {
        return executeQueryList("SELECT * FROM VOUCHER WHERE IS_DELETED = 0");
    }
}
