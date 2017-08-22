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

    /*Retorna uma instancia de Aluno com os valores preenchidos de acordo com a 
    * matricula informada
    */
    public Aluno getAlunoMatricula(String matricula) {
        Aluno aluno;
        PreparedStatement pstm;
        String sql;
        ResultSet rs;
        
        //Instancia um aluno
        aluno = new Aluno();
        
        //Requisição de dados do banco de dados
        sql = "SELECT * FROM aluno WHERE matricula = ?";
        try {
            pstm = con.prepareStatement(sql);
            pstm.setString(1, matricula);
            rs = pstm.executeQuery();
            rs.next();
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
        
        //[Desnvolvedor] Imprime no console as informações do usuário
        System.out.println(aluno.toString());
        
        return aluno;
    }
    
    //Retorna um ArrayList de alunos de acordo com o nome procurado.
    public ArrayList<Aluno> getListaAlunosNome(String nome){
        
    }
    
    //Retorna um ArrayList de alunos de acordo com a turma procurada.
    public ArrayList<Aluno> getListaAlunosTurma(String turma, int ano){
        
    }
    
    //Retorna um Arraylist de alunos de acordo com o curso procurado.
    public ArrayList<Aluno> getListaAlunosCurso(String curso, int ano){
        
    }
    
    /*Retorna um Arraylist de alunos beneficiarios ou não (depende do 'tipo' 
    * inserido) de determinado ano.
    */
    public ArrayList<Aluno> getListaAlunosBeneficio(int ano){
        
    }
}
