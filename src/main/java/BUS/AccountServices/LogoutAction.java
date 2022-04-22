package BUS.AccountServices;

public class LogoutAction {
    public static void logout() {
        LoginFile loginFile = new LoginFile("NULL");
        loginFile.writeToFile();
    }
}
