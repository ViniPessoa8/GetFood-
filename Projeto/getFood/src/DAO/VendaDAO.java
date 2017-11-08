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

public class VendaDAO {

    public final int VENDA_FICHA_CREDITOS = 1;
    public final int VENDA_FICHA_DINHEIRO = 2;
    public final int VENDA_CREDITOS = 3;
    public final int VENDA_FICHA_BENEFICIO = 4;
    
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
    tipo = 4 -> Venda de uma ficha para um aluno beneficiário
     */
    public boolean efetuarVenda(String matAluno, String matFun, double valor, Date data, int tipo) {
        boolean retorno = false;
        FichaDAO fichaDAO = new FichaDAO();

        /*
        Verifica se o usuário tem créditos suficientes para a venda ou 
        se ele está comprando no dinheiro
         */
        //VENDA_FICHA_BENEFICIO
        if (tipo == 4) {
            sql = "insert into venda(matrAl,matrFun,valor,dt,tipo) values (?,?,?,?,?);";
            try {
                pstm = con.prepareStatement(sql);
                pstm.setString(1, matAluno);
                pstm.setString(2, matFun);
                pstm.setDouble(3, 0);
                pstm.setDate(4, (java.sql.Date) data);
                pstm.setInt(5, tipo);
                pstm.execute();
                retorno = true;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            //VENDA_FICHA_DINHEIRO
            if (getSaldoAluno(matAluno) >= fichaDAO.getVal() || tipo == VENDA_FICHA_DINHEIRO) {

                sql = "INSERT INTO venda(matrAl, matrFun, valor, dt, tipo) VALUES(?,?,?,?,?)";

                try {
                    pstm = con.prepareStatement(sql);
                    pstm.setString(1, matAluno);
                    pstm.setString(2, matFun);
                    pstm.setDouble(3, valor);
                    pstm.setDate(4, new java.sql.Date(data.getTime()));
                    pstm.setInt(5, tipo);
                    pstm.execute();
                    retorno = true;
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            //VENDA_FICHA_CREDITOS
            } else if (getSaldoAluno(matAluno) >= fichaDAO.getVal() || tipo == VENDA_FICHA_CREDITOS) {
                atualizaSaldoAluno(matAluno, getSaldoAluno(matAluno) - valor);

                sql = "INSERT INTO venda(matrAl, matrFun, valor, dt, tipo) VALUES(?,?,?,?,?)";

                try {
                    pstm = con.prepareStatement(sql);
                    pstm.setString(1, matAluno);
                    pstm.setString(2, matFun);
                    pstm.setDouble(3, valor);
                    pstm.setDate(4, new java.sql.Date(data.getTime()));
                    pstm.setInt(5, tipo);
                    pstm.execute();
                    retorno = true;
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            //VENDA_CREDITOS
            } else if (tipo == 3) {
                System.out.println("Chegou aqui uhul");
                atualizaSaldoAluno(matAluno, getSaldoAluno(matAluno) + valor);
                sql = "INSERT INTO venda(matrAl, matrFun, valor, dt, tipo) VALUES(?,?,?,?,?)";

                try {
                    pstm = con.prepareStatement(sql);
                    pstm.setString(1, matAluno);
                    pstm.setString(2, matFun);
                    pstm.setDouble(3, valor);
                    pstm.setDate(4, new java.sql.Date(data.getTime()));
                    pstm.setInt(5, tipo);
                    pstm.execute();
                    retorno = true;
                } catch (SQLException e) {
                    e.printStackTrace();
                }
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
        System.out.println("ATUALIZOU O SALDO "+valor);
        return retorno;
    }

    public double getSaldoAluno(String matAluno) {
        sql = "SELECT saldo FROM aluno WHERE matricula = ?";
        double saldo = -1;
        try {
            pstm = con.prepareStatement(sql);
            pstm.setString(1, matAluno);
            rs = pstm.executeQuery();

            rs.first();
            saldo = rs.getDouble("saldo");
            pstm.close();
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
            if (lista.get(i).getTipo() != tipo) {
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

    public boolean dropVendas() {
        boolean result = false;
        sql = "delete from venda;";
        try {
            pstm = con.prepareStatement(sql);
            pstm.execute();
            result = true;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }

}
