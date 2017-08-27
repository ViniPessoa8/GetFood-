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

    //Variáveis
    Connection con;
    PreparedStatement pstm;
    ResultSet rs;
    String sql;

    public AlunoDAO() {
        con = new ConnectionFactory().getConnection();
    }

    //Incompleto
    public boolean addAluno(Aluno aluno) {
        boolean resultado = false;

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

        //Instancia um aluno
        aluno = new Aluno();

        //Requisição de dados do banco de dados
        sql = "SELECT * FROM aluno WHERE matricula = ?";
        try {
            pstm = con.prepareStatement(sql);
            pstm.setString(1, matricula);
            rs = pstm.executeQuery();
            
            //Se houver resultado
            if (rs.next()) {
                //Atribuição de valores ao objeto 'aluno'
                aluno.setCurso(rs.getString("curso"));
                aluno.setMatricula(rs.getString("matricula"));
                aluno.setNome(rs.getString("nome"));
                aluno.setTurma(rs.getString("turma"));
                aluno.setSaldo(rs.getFloat("saldo"));
            }
            pstm.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        //[Desnvolvedor] Imprime no console as informações do usuário
        System.out.println(aluno.toString());

        return aluno;
    }

    //Retorna um ArrayList de alunos de acordo com o nome procurado.
    public ArrayList<Aluno> getListaAlunosNome(String nome) {
        Aluno aluno;
        ArrayList<Aluno> listaAlunos;

        //Instancias
        listaAlunos = new ArrayList();

        sql = "SELECT * FROM aluno WHERE nome LIKE '%" + nome + "%'";

        try {
            pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                aluno = new Aluno();

                aluno.setCurso(rs.getString("curso"));
                aluno.setNome(rs.getString("nome"));
                aluno.setMatricula(rs.getString("matricula"));
                aluno.setSaldo(rs.getFloat("saldo"));
                aluno.setTurma(rs.getString("turma"));
                aluno.setBeneficiario(rs.getInt("beneficiario"));

                listaAlunos.add(aluno);
            }

            pstm.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listaAlunos;
    }

    //Retorna um ArrayList de alunos de acordo com a turma procurada.
    public ArrayList<Aluno> getListaAlunosTurma(String turma, int ano) {
        Aluno aluno;
        ArrayList<Aluno> listaAlunos;

        //Instancias
        listaAlunos = new ArrayList();

        sql = "SELECT * FROM aluno A, turma T WHERE  T.codigo = ? and T.ano = ? and A.turma = T.codigo";

        try {
            pstm = con.prepareStatement(sql);
            pstm.setString(1, turma);
            pstm.setInt(2, ano);
            rs = pstm.executeQuery();

            while (rs.next()) {
                aluno = new Aluno();

                //Atribuição de valores recuperados do BD
                aluno.setCurso(rs.getString("curso"));
                aluno.setNome(rs.getString("nome"));
                aluno.setMatricula(rs.getString("matricula"));
                aluno.setSaldo(rs.getFloat("saldo"));
                aluno.setTurma(rs.getString("turma"));
                aluno.setBeneficiario(rs.getInt("beneficiario"));

                //Adiciona o aluno à lista
                listaAlunos.add(aluno);
            }

            pstm.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listaAlunos;
    }

    //Retorna um Arraylist de alunos de acordo com o curso procurado.
    public ArrayList<Aluno> getListaAlunosCurso(String curso, int ano) {
        Aluno aluno;
        ArrayList<Aluno> listaAlunos;

        //Instancias
        listaAlunos = new ArrayList();

        sql = "SELECT * FROM aluno A, curso C WHERE  C.codigo = ? and C.ano = ? and A.curso = C.codigo";

        try {
            pstm = con.prepareStatement(sql);
            pstm.setString(1, curso);
            pstm.setInt(2, ano);
            rs = pstm.executeQuery();

            while (rs.next()) {
                aluno = new Aluno();

                //Atribuição de valores recuperados do BD
                aluno.setCurso(rs.getString("curso"));
                aluno.setNome(rs.getString("nome"));
                aluno.setMatricula(rs.getString("matricula"));
                aluno.setSaldo(rs.getFloat("saldo"));
                aluno.setTurma(rs.getString("turma"));
                aluno.setBeneficiario(rs.getInt("beneficiario"));

                //Adiciona o aluno à lista
                listaAlunos.add(aluno);
            }

            pstm.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listaAlunos;
    }

    /*Retorna um Arraylist de alunos beneficiarios ou não (depende do 'tipo' 
    * inserido) de determinado ano.
     */
    public ArrayList<Aluno> getListaAlunosBeneficio(int param, int ano) {
        Aluno aluno;
        ArrayList<Aluno> listaAlunos;

        //Instancias
        listaAlunos = new ArrayList();

        sql = "SELECT * FROM aluno A WHERE  beneficiario = ?";

        try {
            pstm = con.prepareStatement(sql);
            pstm.setInt(1, param);
            rs = pstm.executeQuery();

            while (rs.next()) {
                aluno = new Aluno();

                //Atribuição de valores recuperados do BD
                aluno.setCurso(rs.getString("curso"));
                aluno.setNome(rs.getString("nome"));
                aluno.setMatricula(rs.getString("matricula"));
                aluno.setSaldo(rs.getFloat("saldo"));
                aluno.setTurma(rs.getString("turma"));
                aluno.setBeneficiario(rs.getInt("beneficiario"));

                //Adiciona o aluno à lista
                listaAlunos.add(aluno);
            }

            pstm.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listaAlunos;
    }
    
    //Remove o aluno de acordo com a matricula fornecida.
    public boolean rmAlunoMatricula(String matricula) {
        boolean retorno;
        Aluno aluno;

        //Atribuições
        retorno = false; //o valor será mudado se a operação for executada, senão continuará sendo false.
        aluno = getAlunoMatricula(matricula); //verifica se a matricula informada existe no BD

        //Caso o aluno for encontrado
        if (aluno != null) {

            sql = "DELETE FROM aluno WHERE matricula = ?";

            //efetua a remoção do aluno
            try {
                pstm = con.prepareStatement(sql);
                pstm.setString(1, matricula);
                pstm.execute();
                pstm.close();

                //Operação efetuada com sucesso
                retorno = true;

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return retorno;

    }
    
    //Remove o aluno todos os alunos da turma fornecida.
    public boolean rmAlunosTurma(String turma, int ano){
        boolean retorno;
        ArrayList<Aluno> listaAlunos;
        String sql1, sql2;
        TurmaDAO turmaDAO = new TurmaDAO();
        
        //Atribuições
        retorno = false;
        listaAlunos = getListaAlunosTurma(turma, ano);
        
        //Se a turma for encontrada
        if(listaAlunos.size() > 0){
            
            //comando para apagar os alunos da turma
            sql1 = "DELETE aluno FROM aluno A, turma T WHERE A.turma = T.codigo and T.codigo = ? and T.ano = ?";
            
            //Efetua a remoção
            try{
                //Remove os alunos da turma
                pstm = con.prepareStatement(sql1);
                pstm.setString(1, turma);
                pstm.setInt(2, ano);
                pstm.execute();
                
                //remove a turma
            }catch(SQLException e){
                e.printStackTrace();
            }
            
            //comando para apagar a turma
            turmaDAO.rmTurma(turma, ano);
            
            retorno = true;
        }
        
        return retorno;
    }
}
