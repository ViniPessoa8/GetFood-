package DAO;

import DAO.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FichaDAO
{
    private Connection con;
    private String sql;
    private PreparedStatement pstm;
    private ResultSet rs;
    
    public FichaDAO()
    {
        this.con = new ConnectionFactory().getConnection();
        rs = null;
        pstm = null;
        sql = null;
    }
    
    public void updatePreco(float preco)
    {
        sql="update ficha set valor=?;";
        try
        {
            pstm = con.prepareStatement(sql);
            pstm.setFloat(1,preco);
            pstm.execute();
            pstm.close();
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
    
    public float getVal()
    {
        sql="select * from ficha;";
        rs=null;
        float p=0;
        try
        {
            PreparedStatement stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            p = rs.getFloat("valor");
            System.out.println(p);
        } catch(SQLException e)
        {
            e.printStackTrace();
        }
        return p;
    }
}
