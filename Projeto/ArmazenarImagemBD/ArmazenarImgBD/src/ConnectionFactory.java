
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Vinicius
 */
public class ConnectionFactory {

    private String bd, login, senha, driver;

    public Connection getConnection() {
        
        driver = "com.mysql.jdbc.Driver";
        bd = "jdbc:mysql://localhost:3306/imgbd";
        login = "root";
        senha = "root";
        
        try {
            Class.forName(driver);
            return DriverManager.getConnection(bd, login, senha);
        } catch (SQLException|ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
