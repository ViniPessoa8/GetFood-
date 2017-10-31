package DAO;

import Classes.Curso;
import DAO.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CursoDAO {

    private Connection con;
    private String sql;
    private PreparedStatement pstm;
    private ResultSet rs;
    private boolean retorno;
    private ArrayList<String> lista;

    public CursoDAO() 
    {
        this.con = new ConnectionFactory().getConnection();
        pstm = null;
        sql = null;
    }

    public Curso getCurso(int codigo) {
        Curso curso = null;

        sql = "SELECT * FROM curso WHERE codigo = ?";
        try {
            pstm = con.prepareStatement(sql);
            pstm.setString(1, ""+codigo);
            rs = pstm.executeQuery();
            rs.first();
            curso = new Curso(rs.getString("codigo"), rs.getString("nome"));
            //[DEV]
            System.out.println(curso.getNome());
            System.out.println(curso.getCodigo());
            
            pstm.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return curso;
    }

    public void addCurso(Curso c) {
        sql = "INSERT INTO curso(codigo,nome) VALUES(?, ?)";
        try {
            pstm = con.prepareStatement(sql);
            pstm.setString(1, c.getCodigo());
            pstm.setString(2, c.getNome());
            pstm.execute();
            pstm.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean validarCurso(Curso c) {
        sql = "SELECT nome FROM curso WHERE nome = ?";

        try {
            pstm = con.prepareStatement(sql);
            pstm.setString(1, c.getNome());
            rs = pstm.executeQuery();
            if (rs.first()) {
                System.out.println(rs.getStatement());
                retorno = true;
            }
            pstm.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return retorno;
    }

    public ArrayList<String> getListaCursos() {
        lista = new ArrayList();
        sql = "SELECT * FROM curso";

        try {
            pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery();
            if (!rs.first()) {
                lista = null;
            } else {
                do {
                    lista.add(rs.getString("nome"));
                } while (rs.next());
            }
            pstm.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    public String busca(String nome) {
        String codigo = null;

        sql = "SELECT * FROM curso WHERE nome = ?";

        try {
            pstm = con.prepareStatement(sql);
            pstm.setString(1, nome);
            rs = pstm.executeQuery();

            if (rs.first()) {
                codigo = rs.getString("codigo");
                System.out.println(codigo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return codigo;
    }

    public void alteraNome(String codigo, String nome) {
        sql = "UPDATE curso SET nome = ? WHERE codigo = ?";
        try {
            pstm = con.prepareStatement(sql);
            pstm.setString(1, nome);
            pstm.setString(2, codigo);
            pstm.execute();
            pstm.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void alteraCodigo(String codigoAntigo, String codigoNovo) {
        sql = "UPDATE curso SET codigo = ? WHERE codigo = ?";

        try {
            pstm = con.prepareStatement(sql);
            pstm.setString(1, codigoNovo);
            pstm.setString(2, codigoAntigo);
            pstm.execute();
            pstm.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public int getCodigoByNome(String nome) {
        sql = "SELECT * FROM curso WHERE nome = ?";
        int codigo = 0;
        try {
            pstm = con.prepareStatement(sql);
            pstm.setString(1, nome);
            System.out.println(pstm.toString());
            rs = pstm.executeQuery();
            rs.first();
            codigo = rs.getInt("codigo");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return codigo;
    }
     
    
    public boolean dropCursos() 
    {
        boolean result = false;
        sql = "delete from curso;";
        try 
        {
            pstm = con.prepareStatement(sql);
            pstm.execute();
            result = true;
        } catch (SQLException e) 
        {
            e.printStackTrace();
        }

        return result;
    }
}
