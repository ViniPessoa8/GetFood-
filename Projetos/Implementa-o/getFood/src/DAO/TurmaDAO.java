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

    public TurmaDAO() {
        this.con = new ConnectionFactory().getConnection();
    }

    public boolean addTurma(Turma t, int ano) {
        boolean retorno;
        
        //Atribuições
        sql = "INSERT INTO turma(codigo,curso, ano) VALUES (?,?,?)";
        retorno = false;

        try {
            pstm = con.prepareStatement(sql);
            pstm.setString(1, t.getCodigo());
            pstm.setString(2, t.getCurso());
            pstm.setInt(3, ano);
            pstm.execute();
            pstm.close();
            retorno = true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return retorno;
    }

    public boolean validacao(String codigo, int ano) {
        boolean retorno;

        //Atribuições
        sql = "SELECT * FROM turma WHERE codigo = ? AND ano = ?";
        rs = null;
        retorno = false;

        //efetua a validação
        try {
            pstm = con.prepareStatement(sql);
            pstm.setString(1, codigo);
            pstm.setInt(2, ano);
            rs = pstm.executeQuery();
            
            //Se houver resultado
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

    public ArrayList<String> getTurmasCurso(String curso, int ano) {
        ArrayList<String> lista;
        
        //Atribuições
        rs = null;
        sql = "SELECT * FROM turma WHERE curso = ?";
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

    public boolean rmTurma(String codigo, int ano) {
        boolean retorno;

        //Atribuições
        retorno = false;

        //verifica se a turma existe
        if(validacao(codigo, ano)){
            
            sql = "DELETE turma FROM turma WHERE codigo = ? AND ano = ?";
            
            try{
                pstm = con.prepareStatement(sql);
                pstm.setString(1, codigo);
                pstm.setInt(2, ano);
                pstm.execute();
                pstm.close();
                
                retorno = true;
            } catch (SQLException e){
                e.printStackTrace();
            }
            
            
            
        }
        
        return retorno;
    }
}
