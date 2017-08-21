package Classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FichaDAO
{
    private Connection con;
    public FichaDAO()
    {
        this.con = new ConnectionFactory().getConnection();
    }
    
    public void updatePreco(float preco)
    {
        String sql="update ficha set valor=?;";
        try
        {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setFloat(1,preco);
            stmt.execute();
            stmt.close();
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
    
    public float getVal()
    {
        String sql="select * from ficha;";
        ResultSet rs=null;
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
