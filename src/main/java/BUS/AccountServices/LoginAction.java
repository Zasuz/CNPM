package BUS.AccountServices;

import DAL.DataAcessObject.LoginDetailDAO;
import DAL.DataAcessObject.NhanVienDAO;
import DAL.DataAcessObject.TaiKhoanDAO;
import DAL.DataModels.ChucVu;
import DAL.DataModels.LoginDetail;
import DAL.DataModels.NhanVien;
import DAL.DataModels.TaiKhoan;
import GUI.SaleGroup.LoginGui.LoginFrame.LoginGui;
import com.formdev.flatlaf.FlatLightLaf;

import java.sql.Timestamp;
import javax.swing.JOptionPane;

public class LoginAction{
    private final TaiKhoanDAO taiKhoanDAO;
    private final LoginDetailDAO loginDetailDAO;
    private final NhanVienDAO nhanVienDAO;
    private final int AUTH_KEY_EXPIRE_TIME = 1000*60*60*2; // 2 hours
    private int soTK;

    public LoginAction() {
        taiKhoanDAO = new TaiKhoanDAO();
        loginDetailDAO = new LoginDetailDAO();
        nhanVienDAO = new NhanVienDAO();
    }

    //Hàm này sẽ được gọi khi click đăng nhập ở form đăng nhập
    public boolean loginInput(String username, String password, boolean rememberMe){
        TaiKhoan tk = taiKhoanDAO.selectByTenTK(username);
        if (tk == null)
            return false;
        if (!tk.getMatKhau().equals(password)){
            setWrongPasswordTime(tk.getSoTK(),tk,tk.getSoLanSai()+1);
            return false;
        }
        soTK = tk.getSoTK();
        setWrongPasswordTime(tk.getSoTK(),tk,0);
        if (rememberMe){
            storeLoginAuth();
        }
        showFrame();
        return true;
    }

    //Kiểm tra file lưu auth key có tồn tại hay không và trả về kết quả kiểm tra
    public boolean checkAuthKey(){
        LoginFile loginFile = new LoginFile();
        String authKey = loginFile.readFromFile();
        if (authKey == null)
            return false;
        LoginDetail loginDetail = loginDetailDAO.selectByAuthKey(authKey);
        if (loginDetail == null)
            return false;
        soTK = loginDetail.getSoTK();
        return true;
    }

    //Lấy chức vụ ng dùng từ số tài khoản
    public int getChucVuNguoiDung(int soTK) {
        TaiKhoan taiKhoan = taiKhoanDAO.select(soTK);
        NhanVien nhanVien = nhanVienDAO.select(taiKhoan.getMaNV());
        return nhanVien.getMaChucVu();
    }

    //Khởi tạo frame khi login thành công
    protected void showFrame(){
        int maChucVu = getChucVuNguoiDung(soTK);
        if (maChucVu == ChucVu.NHANVIENBANHANG){
            System.out.println("Khoi tao frame nhan vien ban hang");
            JOptionPane.showMessageDialog(null,"Hien thi form nhan vien ban hang","Auto login success",JOptionPane.CLOSED_OPTION);
            //            new NhanVienBanHangFrame(soTK);
        }

            
        else if (maChucVu == ChucVu.NHANVIENQUANLY){
            System.out.println("Khoi tao frame nhan vien quan ly");
            JOptionPane.showMessageDialog(null, "Hien thi form nhan vien ban hang", "Auto login success", JOptionPane.CLOSED_OPTION);
            //            new NhanVienQuanLyFrame(soTK);
        }

    }

    protected void storeLoginAuth(){
        //Generate auth key and store it to file
        LoginFile loginFile = new LoginFile();
        String authKey = loginFile.createAuthKey(50);
        loginFile.setAuthKey(authKey);
        loginFile.writeToFile();
        //Store to database
        LoginDetail loginDetail = new LoginDetail(0,authKey,"192.168.1.1","None_MAC", new Timestamp(System.currentTimeMillis()), new Timestamp(System.currentTimeMillis()+AUTH_KEY_EXPIRE_TIME),soTK);
        loginDetailDAO.insert(loginDetail);
    }

    public void initLogin(){
        if (checkAuthKey())
            showFrame();
        else{
            System.out.println("Hien thi form dang nhap!");
//            loginInput("duy","duy",true);
            //Initalize login form
            //new login form here: new LoginForm();
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new LoginGui().setVisible(true);
                }
            });
        }

    }

    public int getSoTK() {
        return soTK;
    }

    public void setSoTK(int soTK) {
        this.soTK = soTK;
    }
    
    //Tang so lan password nhap sai
    public void setWrongPasswordTime(int soTK, TaiKhoan tk,int times){
        tk.setSoLanSai(times);
        taiKhoanDAO.update(soTK, tk);
    }

//    public static void main(String[] args){
//        LoginFile loginFile = new LoginFile("DUYHECKER");
//        loginFile.writeToFile();
//        LoginAction loginAction = new LoginAction();
//        loginAction.initLogin();
//    }
}
