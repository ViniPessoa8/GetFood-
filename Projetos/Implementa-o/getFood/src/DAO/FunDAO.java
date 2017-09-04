package DAO;

import Classes.Funcionario;
import DAO.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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
            pstm.setFloat(1, fun.getMatricula());
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
            pstm.setFloat(1, fun.getMatricula());
            pstm.setString(2, fun.getNome());
            pstm.setString(3, fun.getCargo());
            pstm.execute();
            pstm.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
