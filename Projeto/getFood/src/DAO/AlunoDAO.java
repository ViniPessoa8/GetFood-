/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Classes.Aluno;
import Classes.FotoUtil;
import Classes.Venda;
import java.io.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    //Imagem do aluno
    private InputStream input;
    private FileInputStream inputImagem;
    private ByteArrayOutputStream outImagem;
    private File arquivo;
    private FotoUtil fotoUtil;
    private VendaDAO vendaDao;
    private SimpleDateFormat sdf;

    public AlunoDAO() {
        con = new ConnectionFactory().getConnection();
        inputImagem = null;
        input = null;
        outImagem = null;
        arquivo = null;
        fotoUtil = new FotoUtil();
        vendaDao = new VendaDAO();
        sdf = new SimpleDateFormat("dd/MM/yyyy");
    }

    /*Retorna uma instancia de Aluno com os valores preenchidos de acordo com a 
    * matricula informada
     */
    public Boolean addAluno(Aluno aluno) {
        retorno = false;
        sql = "INSERT INTO aluno(matricula, nome, saldo, turma, curso, beneficiario) VALUES (?,?,?,?,?,?,?)";
        String path = "C:\\Users\\Vinicius\\Documents\\GitHub\\GetFood-\\Projeto\\bin";
        //processamento da foto do aluno
        inputImagem = fotoUtil.byteToInputStream(aluno.getFoto(), path);

        try {
            pstm = con.prepareStatement(sql);
            pstm.setString(1, aluno.getMatricula());
            pstm.setString(2, aluno.getNome());
            pstm.setDouble(3, aluno.getSaldo());
            pstm.setString(4, aluno.getTurma());
            pstm.setInt(5, aluno.getCurso());
            pstm.setInt(6, aluno.getBeneficiario());
            pstm.setBinaryStream(7, inputImagem);
            pstm.execute();

            retorno = true;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return retorno;
    }

    public ArrayList<Aluno> getListaAlunos() {
        listaAlunos = new ArrayList();
        sql = "SELECT * FROM aluno;";
        try {
            pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                aluno = new Aluno();

                aluno.setCurso(rs.getInt("curso"));
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

    public Aluno getAlunoMatricula(String matricula) {
        byte[] b = null;
        aluno = null;

        //Requisição de dados do banco de dados
        sql = "SELECT * FROM aluno WHERE matricula = ?";
        try {
            pstm = con.prepareStatement(sql);
            pstm.setString(1, matricula);
            rs = pstm.executeQuery();

            //Se houver resultado
            if (rs.first()) {
                //Instancia o aluno
                aluno = new Aluno();

                //Tratamento da foto do aluno
                if (rs.getBinaryStream("foto") != null) {
                    input = rs.getBinaryStream("foto");
                    ByteArrayOutputStream out = new ByteArrayOutputStream();
                    byte[] rb = new byte[1024];
                    int ch = 0;
                    try {
                        while ((ch = input.read(rb)) != -1) {
                            out.write(rb, 0, ch);
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    b = out.toByteArray();
                }

                //Atribuição de valores ao objeto 'aluno'
                aluno.setCurso(rs.getInt("curso"));
                aluno.setMatricula(rs.getString("matricula"));
                aluno.setNome(rs.getString("nome"));
                aluno.setTurma(rs.getString("turma"));
                aluno.setSaldo(rs.getFloat("saldo"));
                aluno.setFoto(b);
            }
            pstm.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        //[Desnvolvedor] Imprime no console as informações do usuário
        if (aluno != null) {
            System.out.println(aluno.toString());
        } else {
            return null;
        }

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

                aluno.setCurso(rs.getInt("curso"));
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
                aluno.setCurso(rs.getInt("curso"));
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
                aluno.setCurso(rs.getInt("curso"));
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
                aluno.setCurso(rs.getInt("curso"));
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

    public boolean setBeneficiario(Aluno al) {
        sql = "UPDATE aluno SET beneficiario = 1 WHERE matricula = ?";

        try {
            pstm = con.prepareStatement(sql);
            pstm.setString(1, al.getMatricula());
            pstm.execute();
            retorno = true;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return retorno;
    }

    public boolean dropAlunos() {
        boolean result = false;
        sql = "delete from aluno;";
        try {
            pstm = con.prepareStatement(sql);
            pstm.execute();
            result = true;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }

    public boolean setFotoAluno(byte[] bytes, Aluno al) {
        retorno = false;
        String path = "C:\\Users\\Vinicius\\Documents\\GitHub\\GetFood-\\Projeto\\bin";
        InputStream input = fotoUtil.byteToInputStream(bytes, sql);
        sql = "UPDATE aluno SET foto = ? WHERE matricula = ?";

        try {
            pstm = con.prepareStatement(sql);
            pstm.setBinaryStream(1, input);
            pstm.executeUpdate();
            retorno = true;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return retorno;
    }

    public boolean setFotoAluno(InputStream input, Aluno al) {
        retorno = false;

        sql = "UPDATE aluno SET foto = ? WHERE matricula = ?";

        try {
            pstm = con.prepareStatement(sql);
            pstm.setBinaryStream(1, input);
            pstm.setString(2, al.getMatricula());
            pstm.executeUpdate();
            retorno = true;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return retorno;
    }

    //Retorna um ArrayLista com o histórico de todas as vendas do aluno
    public ArrayList consultarHistorico(String matricula) {
        ArrayList<String> historico = new ArrayList();
        ArrayList<Venda> vendas = vendaDao.getListaVendaAluno(matricula);

        if (!vendas.isEmpty()) {

            //Formatação dp tipo
            for (Venda venda : vendas) {
                String tipo = "";
                switch (venda.getTipo()) {
                    case 1:
                        tipo = "Ficha_Crédito";
                        break;
                    case 2:
                        tipo = "Ficha_Dinheiro";
                        break;
                    case 3:
                        tipo = "Crédito";
                        break;
                    case 4:
                        tipo = "Ficha_Benefício";
                        break;
                    default:
                        tipo = "ERRO!";
                        break;
                }

                //Formatação da data
                String data = sdf.format(venda.getData());

                String linha = venda.getCodigo() + "#" + venda.getValor() + "#" + tipo + "#" + data;
                historico.add(linha);
            }

        } else {
            historico = null;
        }

        return historico;
    }
    
    public boolean verificaBD(){
        sql = "SELECT * FROM aluno";
        
        try{
            pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery();
            System.out.println(rs.toString());
            if(rs.first()){
                retorno = true;
            } else {
                retorno = false;
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return retorno;
    }
}
