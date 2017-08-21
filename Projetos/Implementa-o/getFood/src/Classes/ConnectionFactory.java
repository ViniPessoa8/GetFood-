package Classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public Connection getConnection() {
        try {
             String url = "jdbc:mysql://localhost/getFood";
             Class.forName("com.mysql.jdbc.Driver");
             return DriverManager.getConnection(url, "root", "rockdesaia");
             // return DriverManager.getConnection(url, "root", "root");
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
