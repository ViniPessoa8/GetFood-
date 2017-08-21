package Classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FunDAO 
{
    private Connection con;
    public FunDAO()
    {
        this.con= new ConnectionFactory().getConnection();
    }
    
    public boolean validarMatr(Funcionario fun)
    {
        boolean x=false;
        ResultSet rs=null;
        String sql="select * from funcionario where matricula=?;";
        try
        {
            PreparedStatement stmt=con.prepareStatement(sql);
            stmt.setFloat(1,fun.getMatricula());
            rs=stmt.executeQuery();
            if(rs.first())
            {
                System.out.println(rs.getStatement());
                x=true;
            }
            
        }catch(SQLException e)   
        {
            e.printStackTrace();
        }
        return x;
    }
    public void addFuncionario(Funcionario fun)
    {
        String sql="insert into funcionario(matricula,nome,cargo) values (?,?,?);";
        try
        {
            PreparedStatement stmt=con.prepareStatement(sql);
            stmt.setFloat(1,fun.getMatricula());
            stmt.setString(2,fun.getNome());
            stmt.setString(3,fun.getCargo());
            stmt.execute();
            stmt.close();
        }catch(SQLException e)
        {
             e.printStackTrace();
        }
    }
    public boolean buscar(float matr)
    {
        
        boolean result = false;
        ResultSet rs = null;
        String sql = "select * from funcionario where matricula ='"+matr+"' ;";
        try
        {
            PreparedStatement stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            if(rs.first())
            {
                result = true;
            }
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
        return result;
    }
    public void altNome(Float matr,String nome)
    {
        String sql = "update funcionario set nome='"+nome+"' where matricula='"+matr+"';";
        try
        {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.execute();
            stmt.close();
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
    public void altCargo(Float matr,String cargo)
    {
        String sql = "update funcionario set cargo='"+cargo+"' where matricula='"+matr+"';";
        try
        {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.execute();
            stmt.close();
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
    
}