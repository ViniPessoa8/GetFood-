
package Classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class LoginDAO 
{
    private Connection con;
    
    public LoginDAO(){
        con = new ConnectionFactory().getConnection();
    }
    
    public boolean validaLogin(String login)
    {
        ResultSet rs;
        boolean log = false;
        String sql = "select * from login where login ='"+login+"';";
       // System.out.println(log);
        try
        {
            PreparedStatement stmt = con.prepareStatement(sql);
            //stmt.setString(1,login);
            rs = stmt.executeQuery();
            if(rs.first())
            {
                log = true; 
            }
        } catch(SQLException e)
        {
            e.printStackTrace();
        }
       // System.out.println(log);
        return log;
    }
    
    public boolean logar(String login, String senha)
    {
        boolean result = false;
        ResultSet rs = null;
        String sql = "select * from login where login = ? and senha = MD5('"+senha+"');";
        System.out.println("");
        try
        {
            PreparedStatement stmt = con.prepareStatement(sql);
            //System.out.println("eae men");
            stmt.setString(1,login);
            rs = stmt.executeQuery();
            if(rs.first())
            {
                result = true;
            }else
            {
                //System.out.println("vc falhou como smp se fode ai");
            }
            stmt.close();
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
        return result;
    }
    public void add(String login, String senha,float matr)
    {
        String sql="insert into login(login,senha,matrFun,status) values(?,MD5('"+senha+"'),?,1);";
        try
        {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1,login);
            stmt.setFloat(2,matr);
            stmt.execute();
            stmt.close();
            
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
    public ArrayList loginsExistentes()
    {
        ArrayList<String> logins = new ArrayList();
        ResultSet rs = null;
        String sql = "select login from login;";
        try
        {
            PreparedStatement stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            if(rs.first())
            {
                logins.add(rs.getString("login"));
            }
            stmt.close();
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
        
        return logins;
    }
    public boolean buscar(String login)
    {
        ResultSet rs = null;
        boolean result = false;
        String sql = "select * from login where login = '"+login+"' ;";
        try
        {
            PreparedStatement stmt = con.prepareStatement(sql);
            //stmt.setString(1,login);
            rs = stmt.executeQuery();
            if(rs.first())
            {
                result = true;
            }
            stmt.close();
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
        return result;
    }
    public void desativar(String login)
    {
        String sql = "update login set status = 0 where login = '"+login+"';";
        try
        {
            PreparedStatement stmt = con.prepareStatement(sql);
            //stmt.setString(1,login);
            stmt.execute();
            stmt.close();
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
        
    public void altSenha(String login,String nova)
    {
        String sql = "update login set senha=MD5('"+nova+"') where login = '"+login+"';";
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
