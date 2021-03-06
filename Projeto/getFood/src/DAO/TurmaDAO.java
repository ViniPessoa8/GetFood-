package DAO;

import Classes.Turma;
import DAO.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class TurmaDAO {

    private Connection con;
    private String sql;
    private PreparedStatement pstm;
    private ResultSet rs;
    private ArrayList<String> lista;
    private boolean retorno;

    public TurmaDAO() {
        this.con = new ConnectionFactory().getConnection();
        rs = null;
        pstm = null;
        sql = null;
    }

    public String getCodigoByNome(String nome) {
        sql = "SELECT * FROM turma WHERE curso = ?";
        String codigo = "";
        try {
            pstm = con.prepareStatement(sql);
            pstm.setString(1, nome);
            System.out.println(pstm.toString());
            rs = pstm.executeQuery();
            rs.first();
            codigo = "" + rs.getInt("codigo");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return codigo;
    }

    public boolean addTurma(Turma t) {

        //Atribuições
        sql = "INSERT INTO turma(codigo,curso) VALUES (?,?)";
        retorno = false;

        try {
            pstm = con.prepareStatement(sql);
            pstm.setString(1, t.getCodigo());
            pstm.setString(2, t.getCurso());
            pstm.execute();
            pstm.close();
            retorno = true;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return retorno;
    }

    public boolean validacao(String codigo) {

        //Atribuições
        sql = "SELECT * FROM turma WHERE codigo = ?";
        rs = null;

        retorno = false;

        //efetua a validação
        try {
            pstm = con.prepareStatement(sql);
            pstm.setString(1, codigo);
            rs = pstm.executeQuery();

            //Se houver resultado
            if (rs.first()) {
                retorno = true;
            }

            pstm.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return retorno;
    }

    public ArrayList<String> getTurmasCurso(String curso) {

        //Atribuições
        rs = null;
        sql = "SELECT * FROM turma";

        lista = new ArrayList();

        try {
            pstm = con.prepareStatement(sql);
            pstm.setString(1, curso);
            rs = pstm.executeQuery();

            //Se não houver resultado da busca
            if (!rs.first()) {
                lista = null;
            } else {
                //Loop para adicionar os nomes das turmas na lista
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

    public boolean rmTurma(String codigo) {

        //Atribuições
        retorno = false;

        //verifica se a turma existe
        if (validacao(codigo)) {

            sql = "DELETE turma FROM turma WHERE codigo = ?";

            try {

                pstm = con.prepareStatement(sql);
                pstm.setString(1, codigo);
                pstm.execute();
                pstm.close();

                retorno = true;
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

        return retorno;
    }

    public boolean dropTurmas() {
        boolean result = false;
        sql = "delete from turma;";
        try {
            pstm = con.prepareStatement(sql);
            pstm.execute();
            result = true;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }

    public boolean verificaBD() {
        sql = "SELECT * FROM turma";

        try {
            pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery();
            if (rs.first()) {
                retorno = true;
            } else {
                retorno = false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return retorno;
    }

}
