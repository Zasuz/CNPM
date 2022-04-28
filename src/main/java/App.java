
import BUS.AccountServices.LoginAction;
import com.formdev.flatlaf.FlatLightLaf;

public class App {
    public static void main(String[] args) {
        FlatLightLaf.setup();
        LoginAction login = new LoginAction();
        login.initLogin();
    }
}
