package BUS.AccountServices;

import DAL.DataAcessObject.LoginDetailDAO;
import DAL.DataModels.LoginDetail;
import java.sql.Timestamp;

public class LogoutAction {
    public static void logout() {
        LoginFile loginFile = new LoginFile(null);
        loginFile.writeToFile();
    }
    
    //Hàm này được gọi để update logout Time của 1 login Detail
    public static void storeLogoutTime(LoginDetail loginDetail){
        LoginDetailDAO lgDAO = new LoginDetailDAO();
        loginDetail.setLogoutTime(new Timestamp(System.currentTimeMillis()));
        lgDAO.update(loginDetail.getLoginId(), loginDetail);
    }
}
