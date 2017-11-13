/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author vinicius
 */
public class RelatorioDAO {
    private static final String driver = "com.mysql.jdbc.Driver";

    public void Relatorio() {
        
    }

    public void gerar(String layout, int beneficio, Date dataInicial, Date dataFinal) throws JRException, SQLException, ClassNotFoundException {

        java.sql.Date dataIni = null, dataFim = null;

        dataIni = new java.sql.Date(dataInicial.getTime());
        dataFim = new java.sql.Date(dataFinal.getTime());

        //gerando o jasper design
        JasperDesign desenho = JRXmlLoader.load(layout);

        //compila o relatório
        JasperReport relatorio = JasperCompileManager.compileReport(desenho);

        //estabelece conexão
        Class.forName(driver);
        Connection con = new ConnectionFactory().getConnection();
        String sql = "select * from venda, aluno as A where A.beneficiario = ? and (dt between ? and ?)";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1, beneficio);
        stmt.setDate(2, dataIni);
        stmt.setDate(3, dataFim);
        ResultSet rs = stmt.executeQuery();

        //implementação da interface JRDataSource para DataSource ResultSet
        JRResultSetDataSource jrRS = new JRResultSetDataSource(rs);

        //executa o relatório
        JasperPrint impressao = JasperFillManager.fillReport(relatorio, new HashMap(), jrRS);

        //exibe o resultado
        JasperViewer viewer = new JasperViewer(impressao, true);

        viewer.viewReport(impressao);
    }
}
