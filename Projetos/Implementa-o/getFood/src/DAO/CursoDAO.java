package DAO;



import Classes.Curso;
import DAO.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CursoDAO 
{
    private Connection con;
    
    public CursoDAO()
    {
        this.con = new ConnectionFactory().getConnection();
    }
    public void addCurso(Curso c)
    {
        String sql="insert into curso(codigo,nome) values(?,?);";
        try
        {
          PreparedStatement stmt= con.prepareStatement(sql);
          stmt.setString(1,c.getCodigo());
          stmt.setString(2,c.getNome());
          stmt.execute();
          stmt.close();
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public boolean validarCurso(Curso c)
    {
        boolean x=false;
        String sql="select nome from curso where nome=?;";
        ResultSet rs=null;
        try
        {
            PreparedStatement stmt=con.prepareStatement(sql);
            stmt.setString(1,c.getNome());
            rs=stmt.executeQuery();
            if(rs.first())
            {
                System.out.println(rs.getStatement());
                x=true;
            }
            stmt.close();
            
        }catch (SQLException e) {
            e.printStackTrace();
        }
        
        return x;
    }
    
     public ArrayList<String> cursosDisp() 
     {
        ArrayList<String> lista = new ArrayList();
        String sql = "select * from curso;";
        ResultSet rs = null;
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            if (!rs.first()) {
                lista = null;
            } else {
                do {
                    lista.add(rs.getString("nome"));
                } while (rs.next());
            }
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
     
     public String busca(String nome) 
     {
        ResultSet rs = null;
        String codigo="";
        String sql = "select * from curso where nome=?;";

        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, nome);
            rs = stmt.executeQuery();
            if (rs.first()) 
            {
               codigo=rs.getString("codigo");
               System.out.println(codigo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return codigo;
    }
     public void alteraNome(String codigo, String nome)
     {
         String sql="update curso set nome='?' where codigo=?;";
         try
         {
             PreparedStatement stmt = con.prepareStatement(sql);
             stmt.setString(1,nome);
             stmt.setString(2,codigo);
             stmt.execute();
             stmt.close();
         }catch(SQLException e)
         {
             e.printStackTrace();
         }
     }
     
     
     
}
