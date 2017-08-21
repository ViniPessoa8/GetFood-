package Classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class TurmaDAO 
{
    private Connection con;
    public TurmaDAO()
    {
        this.con= new ConnectionFactory().getConnection();
    }
    
    public void addTurma(Turma t) 
    {
        String sql = "insert into turma(codigo,curso) values (?,?);";
        try 
        {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, t.getCodigo());
            stmt.setString(2, t.getCurso());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public boolean validacao(Turma t)
    {
        boolean k=false;
        ResultSet rs=null;
        String sql="select * from turma where codigo=? and curso=?;";
        try
        {
            PreparedStatement stmt=con.prepareStatement(sql);
            stmt.setString(1,t.getCodigo());
            stmt.setString(2,t.getCurso());
            rs= stmt.executeQuery();
             if(rs.first())
            {
                System.out.println(rs.getStatement());
                k=true;
            }
            stmt.close();
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
        return k;
    }
    public ArrayList<String> turmasDisp(String curso) {
        ArrayList<String> lista = new ArrayList();
        String sql = "select * from turma where curso=?;";
        ResultSet rs = null;
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1,curso);
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
}
