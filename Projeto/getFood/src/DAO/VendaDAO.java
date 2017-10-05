/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Classes.Aluno;
import Classes.Funcionario;
import Classes.Venda;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author vinicius
 */
public class VendaDAO {

    private PreparedStatement pstm;
    private ResultSet rs;
    private String sql;
    private Connection con;
    private Calendar cal;

    public VendaDAO() {
        this.con = new ConnectionFactory().getConnection();
        rs = null;
        pstm = null;
        sql = null;
        cal = Calendar.getInstance();
    }

    /* Efetua a venda ao aluno.
    tipo = 1 -> Venda de uma ficha a partir dos créditos
    tipo = 2 -> venda de uma ficha no dinheiro
    tipo = 3 -> Venda de créditos
     */
    public boolean efetuarVenda(String matAluno, String matFun, double valor, Date data, int tipo) {
        boolean retorno = false;
        FichaDAO fichaDAO = new FichaDAO();

        /*
        Verifica se o usuário tem créditos suficientes para a venda ou 
        se ele está comprando no dinheiro
         */
        if (getSaldoAluno(matAluno) >= fichaDAO.getVal() || tipo == 2) {

            sql = "INSERT INTO venda(matAluno, matFun, valor, data, tipo) VALUES(?,?,?,?,?)";

            try {
                pstm = con.prepareStatement(sql);
                pstm.setString(1, matAluno);
                pstm.setString(2, matFun);
                pstm.setDouble(3, valor);
                pstm.setDate(4, new java.sql.Date(data.getTime()));
                pstm.setInt(5, tipo);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            if (tipo == 1) {
                atualizaSaldoAluno(matAluno, getSaldoAluno(matAluno) - valor);
            } else if (tipo == 3) {
                atualizaSaldoAluno(matAluno, getSaldoAluno(matAluno) + valor);
            }
        }

        return retorno;
    }

    public boolean atualizaSaldoAluno(String matAluno, double valor) {
        Boolean retorno = false;
        sql = "UPDATE aluno SET saldo = ? WHERE matricula = ?";

        try {
            pstm = con.prepareStatement(sql);
            pstm.setDouble(1, valor);
            pstm.setString(2, matAluno);
            pstm.execute();
            pstm.close();

            retorno = true;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return retorno;
    }

    public double getSaldoAluno(String matAluno) {
        sql = "SELECT saldo FROM aluno WHERE matricula = ?";
        double saldo = -1;
        try {
            pstm = con.prepareStatement(sql);
            pstm.setString(1, matAluno);
            rs = pstm.executeQuery();
            pstm.close();

            saldo = rs.getDouble("saldo");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return saldo;
    }

    public ArrayList<Venda> getListaVendaFun(String matFun) {
        ArrayList<Venda> lista = new ArrayList();
        Venda venda;
        sql = "SELECT FROM venda WHERE matFun = ?";

        try {
            pstm = con.prepareStatement(sql);
            pstm.setString(1, matFun);
            rs = pstm.executeQuery();
            pstm.close();

            while (rs.next()) {
                venda = new Venda();
                venda.setData(rs.getDate("dt"));
                venda.setMatAluno(rs.getString("matAluno"));
                venda.setMatFun(rs.getString("matFun"));
                venda.setValor(rs.getDouble("valor"));
                venda.setTipo(rs.getInt("tipo"));

                lista.add(venda);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }

    public ArrayList<Venda> getListaVendaAluno(String matAluno) {
        ArrayList<Venda> lista = new ArrayList();
        Venda venda;
        sql = "SELECT FROM venda WHERE matAluno = ?";

        try {
            pstm = con.prepareStatement(sql);
            pstm.setString(1, matAluno);
            rs = pstm.executeQuery();
            pstm.close();

            while (rs.next()) {
                venda = new Venda();
                venda.setData(rs.getDate("dt"));
                venda.setMatAluno(rs.getString("matAluno"));
                venda.setMatFun(rs.getString("matFun"));
                venda.setValor(rs.getDouble("valor"));
                venda.setTipo(rs.getInt("tipo"));

                lista.add(venda);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }

    public ArrayList<Venda> getListaVendaTipo(int tipo) {
        ArrayList<Venda> lista = new ArrayList();
        Venda venda;
        sql = "SELECT FROM venda WHERE matFun = ?";

        try {
            pstm = con.prepareStatement(sql);
            pstm.setString(1, sql);
            rs = pstm.executeQuery();
            pstm.close();

            while (rs.next()) {
                venda = new Venda();
                venda.setData(rs.getDate("dt"));
                venda.setMatAluno(rs.getString("matAluno"));
                venda.setMatFun(rs.getString("matFun"));
                venda.setValor(rs.getDouble("valor"));
                venda.setTipo(rs.getInt("tipo"));

                lista.add(venda);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }

    public ArrayList<Venda> filtraVendaTipo(ArrayList<Venda> lista, int tipo) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getTipo() != tipo){
                lista.remove(i);
            }
        }
        
        return lista;
    }

    public ArrayList<Venda> getListaVendaData(Date data) {
        ArrayList<Venda> lista = new ArrayList();
        Venda venda;
        sql = "SELECT FROM venda WHERE matFun = ?";

        try {
            pstm = con.prepareStatement(sql);
            pstm.setString(1, sql);
            rs = pstm.executeQuery();
            pstm.close();

            while (rs.next()) {
                venda = new Venda();
                venda.setData(rs.getDate("dt"));
                venda.setMatAluno(rs.getString("matAluno"));
                venda.setMatFun(rs.getString("matFun"));
                venda.setValor(rs.getDouble("valor"));
                venda.setTipo(rs.getInt("tipo"));

                lista.add(venda);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
 
        
        return lista;
    }
}