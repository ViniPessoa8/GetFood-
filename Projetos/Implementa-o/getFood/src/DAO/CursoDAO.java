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

    public CursoDAO() {
        this.con = new ConnectionFactory().getConnection();
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

    public ArrayList<String> cursosDisp() {
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
        sql = "update curso set nome='?' where codigo=?;";
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

}
