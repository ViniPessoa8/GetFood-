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
    private boolean retorno;

    public boolean validaLogin(String login) {
        retorno = false;
        sql = "SELECT * FROM login WHERE login = ?";
        try {
            pstm = con.prepareStatement(sql);
            pstm.setString(1, login);
            rs = pstm.executeQuery();
            if (rs.first()) {
                retorno = true;

            }

            pstm.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        
        return retorno;
    }

    public boolean logar(String login, String senha) {
        sql = "SELECT * FROM login WHERE login = ? AND senha = MD5('" + senha + "')";
        try {
            pstm = con.prepareStatement(sql);
            System.out.println("eae men");
            pstm.setString(1, login);
            pstm.setString(2, senha);
            rs = pstm.executeQuery();
            if (rs.first()) {
                System.out.println("ACHOU");
                retorno = true;
            } else {
                System.out.println("vc falhou como smp se fode ai");
            }
            pstm.close();
        } catch (SQLException e) {

            e.printStackTrace();
        }
        return retorno;
    }

    public void add(String login, String senha, String matr) {
        sql = "INSERT INTO login(login,senha,matrFun) values(?, MD5('" + senha + "'), ?);";

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

    public boolean rmLogin(String login) {
        retorno = false;
        sql = "DELETE FROM login WHERE login = ?";

        try {
            pstm = con.prepareStatement(sql);
            pstm.setString(1, login);
            pstm.execute();
            pstm.close();
            retorno = true;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return retorno;
    }
}
