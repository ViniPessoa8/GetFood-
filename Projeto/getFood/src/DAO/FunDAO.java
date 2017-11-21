package DAO;

import Classes.Funcionario;
import DAO.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class FunDAO {

    private Connection con;
    private String sql;
    private PreparedStatement pstm;
    private ResultSet rs;
    private boolean retorno;

    public FunDAO() {
        this.con = new ConnectionFactory().getConnection();
    }

    public boolean validarMatr(Funcionario fun) {
        retorno = false;
        sql = "SELECT * FROM funcionario WHERE matricula = ?";
        try {
            pstm = con.prepareStatement(sql);
            pstm.setString(1, fun.getMatricula());
            rs = pstm.executeQuery();
            if (rs.first()) {
                System.out.println(rs.getStatement());
                retorno = true;

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return retorno;
    }

    public void addFuncionario(Funcionario fun) {

        sql = "INSERT INTO funcionario(matricula,nome,cargo) VALUES (?,?,?)";
        try {
            pstm = con.prepareStatement(sql);
            pstm.setString(1, fun.getMatricula());

            pstm.setString(2, fun.getNome());
            pstm.setString(3, fun.getCargo());
            pstm.execute();
            pstm.close();
        } catch (SQLException e) {
            e.printStackTrace();

        }
    }

    public Funcionario getFuncionarioMatricula(String matricula) {
        Funcionario fun = new Funcionario();
        sql = "SELECT * FROM funcionario WHERE matricula = ?";
        try {
            pstm = con.prepareStatement(sql);
            pstm.setString(1, matricula);
            rs = pstm.executeQuery();
            rs.next();

            fun.setMatricula(rs.getString("matricula"));
            fun.setCargo(rs.getString("cargo"));
            fun.setNome(rs.getString("nome"));
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return fun;
    }

    public ArrayList<Funcionario> getListaFuncionarioCargo(String cargo) {
        ArrayList<Funcionario> lista = new ArrayList();
        Funcionario fun;
        sql = "SELECT * FROM funcionario WHERE cargo = ?";
        try {
            
            pstm = con.prepareStatement(sql);
            pstm.setString(1, cargo);
            rs = pstm.executeQuery();
            while (rs.next()) {
                
                fun = new Funcionario();
                
                fun.setMatricula(rs.getString("matricula"));
                fun.setCargo(rs.getString("cargo"));
                fun.setNome(rs.getString("nome"));

                lista.add(fun);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }
    
    public ArrayList<Funcionario> getListaFuncionarioNome(String nome) {
        ArrayList<Funcionario> lista = new ArrayList();
        Funcionario fun;
        sql = "SELECT * FROM funcionario WHERE nome LIKE '%"+nome+"%'";
        try {
            pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery();
            while (rs.next()) {
                
                fun = new Funcionario();
                
                fun.setMatricula(rs.getString("matricula"));
                fun.setCargo(rs.getString("cargo"));
                fun.setNome(rs.getString("nome"));

                lista.add(fun);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }
    
    public boolean rmFuncionarioMatricula (String matricula){
        boolean retorno = false;
        Funcionario fun = new Funcionario();
        
        sql = "DELETRO FROM funcionario WHERE matricula = ?";
        
        try{
            pstm = con.prepareStatement(sql);
            pstm.setString(1, matricula);
            pstm.execute();
            pstm.close();
            retorno = true;
        }catch (SQLException e){
            e.printStackTrace();

        }
        
        return retorno;
    }
    
    public boolean validaSenhaAdm(String senha){
        sql = "SELECT * FROM login WHERE senha = MD5(?) and login = 'admin'";
        try{
            pstm = con.prepareStatement(sql);
            pstm.setString(1,senha);
            rs = pstm.executeQuery();
            if(rs.first()){
                retorno = true;
            } else {
                retorno = false;
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return retorno;
    }
    
    public boolean verificaBD(){
        sql = "SELECT * FROM funcionario WHERE matricula <> 0";
        
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
