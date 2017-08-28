package DAO;

import Classes.Funcionario;
import DAO.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FunDAO {

    private Connection con;
    String sql;
    ResultSet rs;
    PreparedStatement pstm;
    
    public FunDAO() {
        this.con = new ConnectionFactory().getConnection();
    }

    public boolean validarMatr(Funcionario fun) {
        boolean x = false;
        rs = null;
        sql = "select * from funcionario where matricula=?;";
        try {
            pstm = con.prepareStatement(sql);
            pstm.setString(1, fun.getMatricula());
            rs = pstm.executeQuery();
            if (rs.first()) {
                System.out.println(rs.getStatement());
                x = true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return x;
    }

    public void addFuncionario(Funcionario fun) {
        sql = "insert into funcionario(matricula,nome,cargo) values (?,?,?);";
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
    
    public Funcionario getFuncionarioMatricula(String matricula){
        Funcionario fun =  new Funcionario();
        sql = "SELECT * FROM funcionario WHERE matricula = ?";
        try{
            pstm = con.prepareStatement(sql);
            pstm.setString(1, matricula);
            rs = pstm.executeQuery();
            rs.next();
            
            fun.setMatricula(rs.getString("matricula"));
            fun.setCargo(rs.getString("cargo"));
            fun.setNome(rs.getString("nome"));
        } catch (SQLException e){
            e.printStackTrace();
        }
        
        return fun;
    }
}
