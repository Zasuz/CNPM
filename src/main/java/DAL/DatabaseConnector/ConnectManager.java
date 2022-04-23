package DAL.DatabaseConnector;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import org.apache.commons.dbutils.DbUtils;

public class ConnectManager {
    private Connection connect;
    private String url;
    private String username;
    private String password;
    private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";

    public ConnectManager() {
        DbUtils.loadDriver(JDBC_DRIVER);
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("src/main/java/DAL/DatabaseConnector/dbconfig.properties"));
            this.url = properties.getProperty("url");
            this.username = properties.getProperty("username");
            this.password = properties.getProperty("password");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connect;
    }

    public void openConnection(){
        try {
            this.connect = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void closeConnection() {
        try {
            DbUtils.close(connect);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
