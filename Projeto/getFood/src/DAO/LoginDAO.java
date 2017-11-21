package DAO;

import Classes.Funcionario;
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

    public LoginDAO() {
        this.con = new ConnectionFactory().getConnection();
    }

    public Funcionario getFuncionarioLogin(String login) {
        Funcionario fun = new Funcionario();

        sql = "SELECT F.matricula, F.nome, F.cargo FROM login as L, funcionario as F WHERE L.login = ? and L.matrFun = F.matricula";
        try {
            pstm = con.prepareStatement(sql);
            pstm.setString(1, login);
            rs = pstm.executeQuery();
            if (rs.first()) {
                fun.setMatricula(rs.getString("matricula"));
                fun.setNome(rs.getString("nome"));
                fun.setCargo(rs.getString("cargo"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return fun;
    }

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
            pstm.setString(1, login);
            // pstm.setString(2, senha);
            rs = pstm.executeQuery();
            if (rs.first()) {
                retorno = true;
            } else {
                retorno = false;
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
    
    public boolean verificaBD(){
        sql = "SELECT * FROM login";
        
        try{
            pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery();
            if(rs.first()){
                retorno = true;
            } else {
                retorno = false;
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return retorno;
    }
}
