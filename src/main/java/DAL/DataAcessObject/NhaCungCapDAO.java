package DAL.DataAcessObject;

import DAL.DataModels.NhaCungCap;

import java.util.List;

public class NhaCungCapDAO extends AbtractAccessDatabase<NhaCungCap> implements ISimpleAccess<NhaCungCap,Integer> {

    //Set class for DAO action
    {
        setClazz(NhaCungCap.class);
    }

    @Override
    public boolean insert(NhaCungCap nhaCungCap) {
        return executeUpdate("INSERT INTO nhacungcap(TENNCC,DIACHI,SDT,EMAIL,IS_DELETED) VALUES(?,?,?,?,?)",
                nhaCungCap.getTenNCC(),nhaCungCap.getDiaChi(),nhaCungCap.getSdt(),nhaCungCap.getEmail(),nhaCungCap.getIsDeleted());
    }

    @Override
    public boolean delete(Integer maNhaCungCap) {
        return executeUpdate("UPDATE nhacungcap SET IS_DELETED = 1 WHERE MANCC = ?",maNhaCungCap);
    }

    @Override
    public boolean update(Integer maNhaCungCap, NhaCungCap nhaCungCap) {
        return executeUpdate("UPDATE nhacungcap SET TENNCC = ?, DIACHI = ?, SDT = ?, EMAIL = ?, IS_DELETED = ? WHERE MANCC = ?",
                nhaCungCap.getTenNCC(),nhaCungCap.getDiaChi(),nhaCungCap.getSdt(),nhaCungCap.getEmail(),nhaCungCap.getIsDeleted(),maNhaCungCap);
    }

    @Override
    public NhaCungCap select(Integer integer) {
        return executeQuery("SELECT * FROM nhacungcap WHERE MANCC = ? AND IS_DELETED = 0",integer);
    }

    @Override
    public List<NhaCungCap> selectAll() {
        return executeQueryList("SELECT * FROM nhacungcap WHERE IS_DELETED = 0");
    }
}
