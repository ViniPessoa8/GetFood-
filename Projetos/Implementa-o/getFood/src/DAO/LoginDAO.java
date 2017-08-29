package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDAO {

    private String sql;
    private PreparedStatement pstm;
    private Connection con;
    private ResultSet rs;
    
    public LoginDAO(){
        con = new ConnectionFactory().getConnection();
        rs = null;
        pstm = null;
        sql = null;
    }

    public boolean validaLogin(String login) {
        boolean log = false;
        sql = "select * from login where login = ?;";
        
        try {
            pstm = con.prepareStatement(sql);
            pstm.setString(1, login);
            rs = pstm.executeQuery();
            if (rs.first()) {
                log = true;
            }
            
            pstm.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return log;
    }

    public boolean logar(String login, String senha) {
        boolean result = false;
        sql = "select * from login where login = ? and senha = MD5('" + senha + "');";
        
        try {
            pstm = con.prepareStatement(sql);
            pstm.setString(1, login);
            rs = pstm.executeQuery();
            
            if (rs.first()) {
                result = true;
            } 
            
            pstm.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public void add(String login, String senha,String matr) {
        sql = "insert into login(login,senha,matrFun) values('?',MD5('" + senha + "'),'?');";
        
        try {
            pstm = con.prepareStatement(sql);
            pstm.setString(1, login);
            pstm.setString(2, matr);
            pstm.execute();
            pstm.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public boolean rmLogin(String login){
        boolean retorno = false;
        sql = "DELETE FROM login WHERE login = ?";
        
        try{
            pstm = con.prepareStatement(sql);
            pstm.setString(1, login);
            pstm.execute();
            pstm.close();
            retorno = true;
        }catch(SQLException e){
            e.printStackTrace();
        } 
        
        return retorno;
    }
}
