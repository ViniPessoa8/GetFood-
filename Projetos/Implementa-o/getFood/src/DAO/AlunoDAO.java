/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Classes.Aluno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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

    //Incompleto
    public boolean addAluno(Aluno aluno) {
        boolean resultado = false;
        String sql;
        PreparedStatement pstm;

        sql = "INSERT INTO aluno VALUES()";
        try {
            pstm = con.prepareStatement(sql);
            pstm.execute();
            pstm.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultado;
    }

    public Aluno getAlunoMatricula(String matricula) {
        Aluno aluno;
        PreparedStatement pstm;
        String sql;
        ResultSet rs;

        aluno = new Aluno();
        
        //Requisição de dados do banco de dados
        sql = "SELECT * FROM aluno WHERE matricula = ?";
        try {
            pstm = con.prepareStatement(sql);
            pstm.setString(0, matricula);
            rs = pstm.executeQuery();
            
            //Atribuição de valores ao objeto 'aluno'
            aluno.setCurso(rs.getString("curso"));
            aluno.setMatricula(rs.getString("matricula"));
            aluno.setNome(rs.getString("nome"));
            aluno.setTurma(rs.getString("turma"));
            aluno.setSaldo(rs.getFloat("saldo"));
            
            pstm.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        
        
        System.out.println(aluno.toString());
        
        return aluno;
    }
    
    public ArrayList<Aluno> getListaAlunosNome(String nome){
        
    }
    
    public ArrayList<Aluno> getListaAlunosTurma(String turma){
        
    }
    
    public ArrayList<Aluno> getListaAlunosCurso(String curso){
        
    }
    
    public ArrayList<Aluno> getListaAlunosBeneficio(){
        
    }
}
