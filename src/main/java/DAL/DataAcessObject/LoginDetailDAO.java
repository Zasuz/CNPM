package DAL.DataAcessObject;

import DAL.DataModels.LoginDetail;

import java.util.List;

public class LoginDetailDAO extends AbtractAccessDatabase<LoginDetail> implements ISimpleAccess<LoginDetail,Integer> {
    {
        setClazz(LoginDetail.class);
    }

    @Override
    public boolean insert(LoginDetail loginDetail) {
        return executeUpdate("INSERT INTO LOGIN_DETAIL(AUTH_KEY,IP_ADDRESS,MAC_ADDRESS,LOGIN_TIME,LOGOUT_TIME,SOTK) VALUES(?,?,?,?,?,?)",
                loginDetail.getAuthKey(),loginDetail.getIpAddress(),loginDetail.getMacAddress(),loginDetail.getLoginTime(),loginDetail.getLogoutTime(),loginDetail.getSoTK());
    }

    @Override
    public boolean delete(Integer loginId) {
        return executeUpdate("DELETE FROM LOGIN_DETAIL WHERE LOGIN_ID = ?",loginId);
    }

    @Override
    public boolean update(Integer loginId, LoginDetail loginDetail) {
        return executeUpdate("UPDATE LOGIN_DETAIL SET AUTH_KEY = ?,IP_ADDRESS = ?,MAC_ADDRESS = ?,LOGIN_TIME = ?,LOGOUT_TIME = ?,SOTK = ? WHERE LOGIN_ID = ?",
                loginDetail.getAuthKey(),loginDetail.getIpAddress(),loginDetail.getMacAddress(),loginDetail.getLoginTime(),loginDetail.getLogoutTime(),loginDetail.getSoTK(),loginId);
    }

    @Override
    public LoginDetail select(Integer loginId) {
        return executeQuery("SELECT * FROM LOGIN_DETAIL WHERE LOGIN_ID = ?",loginId);
    }

    @Override
    public List<LoginDetail> selectAll() {
        return executeQueryList("SELECT * FROM LOGIN_DETAIL");
    }

    public LoginDetail selectByNewestSoTK(int soTK) {
        return executeQuery("SELECT * FROM LOGIN_DETAIL WHERE SOTK = ? ORDER BY LOGOUT_TIME DESC LIMIT 1",soTK);
    }

    public LoginDetail selectByAuthKey(String authKey) {
        return executeQuery("SELECT * FROM LOGIN_DETAIL WHERE AUTH_KEY = ? AND LOGOUT_TIME>=NOW()",authKey);
    }
}
