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

    private Aluno aluno;
    private Connection con;
    private String sql;
    private PreparedStatement pstm;
    private ResultSet rs;
    private ArrayList<Aluno> listaAlunos;
    private boolean retorno;
    private TurmaDAO turmaDAO;

    public AlunoDAO() {
        con = new ConnectionFactory().getConnection();

    }

    /*Retorna uma instancia de Aluno com os valores preenchidos de acordo com a 
    * matricula informada
     */
    public boolean addAluno(Aluno al){
        
        retorno = false;
        sql = "INSERT INTO aluno(matricula, saldo, nome, beneficiario, curso, turma) VALUES (?,?,?,?,?,?)";
        
        try{
            pstm = con.prepareStatement(sql);
            pstm.setString(1, al.getMatricula());
            pstm.setDouble(2, al.getSaldo());
            pstm.setString(3, al.getNome());
            pstm.setInt(4, al.getBeneficiario());
            pstm.setString(5, al.getCurso());
            pstm.setString(6, al.getTurma());
            retorno =  pstm.execute();
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        return retorno;
    }
    
    
    public Aluno getAlunoMatricula(String matricula) {

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
    public ArrayList<Aluno> getListaAlunosTurma(String turma) {

        //Instancias
        listaAlunos = new ArrayList();

        sql = "SELECT * FROM aluno A, turma T WHERE  T.codigo = ? and A.turma = T.codigo";

        try {
            pstm = con.prepareStatement(sql);
            pstm.setString(1, turma);
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
    public ArrayList<Aluno> getListaAlunosCurso(String curso) {

        //Instancias
        listaAlunos = new ArrayList();

        sql = "SELECT * FROM aluno A, curso C WHERE  C.codigo = ? and A.curso = C.codigo";

        try {
            pstm = con.prepareStatement(sql);
            pstm.setString(1, curso);
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
    * Se o parametro for 1, o método retorna os alunos que recebem benefício.
     */
    public ArrayList<Aluno> getListaAlunosBeneficio(int param) {

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

    public boolean rmAlunosTurma(String turma) {
        turmaDAO = new TurmaDAO();

        //Atribuições
        retorno = false;
        listaAlunos = getListaAlunosTurma(turma);

        //Se a turma for encontrada
        if (listaAlunos.size() > 0) {

            //comando para apagar os alunos da turma
            sql = "DELETE aluno FROM aluno A, turma T WHERE A.turma = T.codigo and T.codigo = ?";

            //Efetua a remoção
            try {
                //Remove os alunos da turma
                pstm = con.prepareStatement(sql);
                pstm.setString(1, turma);
                pstm.execute();

                //remove a turma
            } catch (SQLException e) {
                e.printStackTrace();
            }

            //comando para apagar a turma
            turmaDAO.rmTurma(turma);

            retorno = true;
        }

        return retorno;
    }
}
