package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDAO {

    private Connection con;
    
    public LoginDAO(){
        con = new ConnectionFactory().getConnection();
    }

    public boolean validaLogin(String login) {
        ResultSet rs;
        boolean log = false;
        String sql = "select * from login where login = ?;";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, login);
            rs = stmt.executeQuery();
            if (rs.first()) {
                log = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return log;
    }

    public boolean logar(String login, String senha) {
        boolean result = false;
        ResultSet rs = null;
        String sql = "select * from login where login = ? and senha = MD5('" + senha + "');";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, login);
            rs = stmt.executeQuery();
            
            if (rs.first()) {
                result = true;
            } 
            
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public void add(String login, String senha, float matr) {
        String sql = "insert into login(login,senha,matrFun) values('?',MD5('" + senha + "'),'?');";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, login);
            stmt.setFloat(2, matr);
            stmt.execute();
            stmt.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
