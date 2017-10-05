package DAO;

import DAO.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FichaDAO {

    private Connection con;
    private String sql;
    private PreparedStatement pstm;
    private ResultSet rs;

    public FichaDAO() {
        this.con = new ConnectionFactory().getConnection();
        pstm = null;
    }

    public void updatePreco(float preco) {
        sql = "UPDATE ficha SET valor = ?";
        try {
            pstm = con.prepareStatement(sql);
            pstm.setFloat(1, preco);
            pstm.execute();
            pstm.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public float getVal() {
        sql = "SELECT * FROM ficha";
        float valor = 0;
        try {
            pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery();
            valor = rs.getFloat("valor");
            System.out.println(valor);
        } catch (SQLException e) {

            e.printStackTrace();
        }
        return valor;
    }
}
