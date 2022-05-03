package DAL.DataAcessObject;

import DAL.DataModels.GiamGiaSP;
import java.util.List;


public class GiamGiaSPDAO extends AbtractAccessDatabase<GiamGiaSP> implements ISimpleAccess<GiamGiaSP, Integer>{
    
    {
        setClazz(GiamGiaSP.class);
    }

    @Override
    public boolean insert(GiamGiaSP giamGiaSP) {
        return executeUpdate("INSERT INTO GIAMGIASP(SOPHIEU, NGAYBD, NGAYKT, PTGIAM, MASP, IS_DELETED) VALUES(?,?,?,?,?,?)",giamGiaSP.getSoPhieu(),
                giamGiaSP.getNgayBD(), giamGiaSP.getNgayKT(), giamGiaSP.getPtGiam(), giamGiaSP.getMaSP(), giamGiaSP.IsDeleted());
    }

    @Override
    public boolean delete(Integer soPhieu) {
        return executeUpdate("UPDATE GIAMGIASP SET IS_DELETED = 1 WHERE SOPHIEU = ?", soPhieu);
    }

    @Override
    public boolean update(Integer soPhieu, GiamGiaSP giamGiaSP) {
        return executeUpdate("UPDATE GIAMGIASP SET NGAYBD = ?, NGAYKT = ?, PTGIAM = ?, MASP = ?, IS_DELETED = ? WHERE SOPHIEU = ?",
                giamGiaSP.getNgayBD(), giamGiaSP.getNgayKT(), giamGiaSP.getPtGiam(), giamGiaSP.getMaSP(), giamGiaSP.IsDeleted(), soPhieu);
    }

    @Override
    public GiamGiaSP select(Integer soPhieu) {
        return executeQuery("SELECT * FROM GIAMGIASP WHERE SOPHIEU = ? AND IS_DELETED = 0", soPhieu);
    }

    @Override
    public List<GiamGiaSP> selectAll() {
        return executeQueryList("SELECT * FROM GIAMGIASP WHERE IS_DELETED = 0");
    }
    
    public GiamGiaSP selectByMaSP(Integer maSP){
        return executeQuery("SELECT * FROM GIAMGIASP WHERE MASP = ? AND IS_DELETED = 0", maSP);
    }

    
}
