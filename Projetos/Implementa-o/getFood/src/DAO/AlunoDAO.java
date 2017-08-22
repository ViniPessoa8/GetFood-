/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Classes.Aluno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author vinicius
 */
public class AlunoDAO {

    //Conexão
    Connection con;

    public AlunoDAO() {
        con = new ConnectionFactory().getConnection();
    }

    public boolean addAluno(Aluno aluno) {
        boolean resultado = false;
        String sql;
        PreparedStatement pstm;

        sql = "INSERT INTO aluno VALUES()";
        try {
            pstm = con.prepareStatement(sql);
            pstm.execute();
        } catch(SQLException e){
            e.printStackTrace();
        }
        return resultado;
    }

}
