package BUS.AccountServices;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Base64;
import java.util.Properties;

public class LoginFile {
    private String authKey;
    private final String directory = System.getenv("APPDATA");
    private final String fileName = "login.properties";

    public LoginFile(){
    }

    public LoginFile(String authKey) {
        this.authKey = authKey;
    }

    public String getAuthKey() {
        return authKey;
    }

    public void setAuthKey(String authKey) {
        this.authKey = authKey;
    }

    public void writeToFile(){
        //Mã hóa base 64
        byte[] encodedBytes = Base64.getEncoder().encode(authKey.getBytes());
        String encodeStr = new String(encodedBytes);
        //Tạo file properties
        Properties props = new Properties();
        props.put("authKey", encodeStr);
        String path = directory + "\\" + fileName;
        try {
            props.store(new java.io.FileOutputStream(path), "Authentication key for login");
        } catch (IOException e) {
//            e.printStackTrace();
            System.out.println("Không thể thao tác file "+path);
        }
    }

    public String readFromFile(){
        //Đọc file properties
        Properties props = new Properties();
        String path = directory + "\\" + fileName;
        try {
            props.load(new java.io.FileInputStream(path));
            String authKey = props.getProperty("authKey");
            //Giải mã base 64
            byte[] decodedBytes = Base64.getDecoder().decode(authKey.getBytes());
            return new String(decodedBytes);
        } catch (IOException e) {
//            e.printStackTrace();
            System.out.println("Không tìm thấy file "+path);
        }
        return null;
    }

    public String createAuthKey(int length){
        StringBuilder sb = new StringBuilder();
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        for (int i = 0; i < length; i++) {
            int index = (int) (Math.random() * characters.length());
            sb.append(characters.charAt(index));
        }
        return sb.toString();
    }
}
