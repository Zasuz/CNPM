package DAL.DataAcessObject;

import DAL.DataModels.ChucVu;

import java.util.List;

public class ChucVuDAO extends AbtractAccessDatabase<ChucVu> implements ISimpleAccess<ChucVu,Integer> {

    {
        setClazz(ChucVu.class);
    }

    @Override
    public boolean insert(ChucVu chucVu) {
        return executeUpdate("INSERT INTO CHUCVU(TENCHUCVU,MOTA,IS_DELETED) VALUES(?,?,?)",
                chucVu.getTenChucVu(),chucVu.getMoTa(),chucVu.isDeleted());
    }

    @Override
    public boolean delete(Integer maChucVu) {
        return executeUpdate("UPDATE CHUCVU SET IS_DELETED = 1 WHERE MACHUCVU = ?",maChucVu);
    }

    @Override
    public boolean update(Integer maChucVu, ChucVu chucVu) {
        return executeUpdate("UPDATE CHUCVU SET TENCHUCVU = ?, MOTA = ? WHERE MACHUCVU = ?",
                chucVu.getTenChucVu(),chucVu.getMoTa(),maChucVu);
    }

    @Override
    public ChucVu select(Integer maChucVu) {
        return executeQuery("SELECT * FROM CHUCVU WHERE MACHUCVU = ? AND IS_DELETED = 0",maChucVu);
    }

    @Override
    public List<ChucVu> selectAll() {
        return executeQueryList("SELECT * FROM CHUCVU WHERE IS_DELETED = 0");
    }
}
