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
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
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
    
    private ResultSet rs;

    public RelatorioDAO() {
        
    }

    public void gerar(String layout, int beneficio, Date inicial, Date fim) throws JRException, SQLException, ClassNotFoundException {
        SimpleDateFormat sdf;
        sdf = new SimpleDateFormat("dd/MM/yyyy");
        java.sql.Date dataIni = null, dataFim = null;

        dataIni = new java.sql.Date(inicial.getTime());
        dataFim = new java.sql.Date(fim.getTime());

        //[DESENVOLVERDOR]
        System.out.println(inicial.getTime());
        System.out.println(
                sdf.format(
                        inicial));
        String Beneficiarios = "";
        if (beneficio == 1){
            Beneficiarios = "Beneficiários";
        } else {
            Beneficiarios = "Não-Benefíciários";
        }
        String dataInicial, dataFinal;
        dataInicial = sdf.format(inicial.getTime());
        dataFinal = sdf.format(fim.getTime());

        //HashMap com os parâmetros
        Map map = new HashMap();
        map.put("dataInicial", dataInicial);
        map.put("dataFinal", dataFinal);
        map.put("Beneficiarios", Beneficiarios);

        //gerando o jasper design
        JasperDesign desenho = JRXmlLoader.load(layout);

        //compila o relatório
        JasperReport relatorio = JasperCompileManager.compileReport(desenho);

        //estabelece conexão
        Class.forName(driver);
        Connection con = new ConnectionFactory().getConnection();
        if (dataIni == dataFim) {
            String sql = "select * from venda, aluno as A where A.beneficiario = ? and dt = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, beneficio);
            stmt.setDate(2, dataIni);
            rs = stmt.executeQuery();
        } else {
            String sql = "select * from venda, aluno as A where A.beneficiario = ? and (dt between ? and ?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, beneficio);
            stmt.setDate(2, dataIni);
            stmt.setDate(3, dataFim);
            rs = stmt.executeQuery();
        }

        //implementação da interface JRDataSource para DataSource ResultSet
        JRResultSetDataSource jrRS = new JRResultSetDataSource(rs);

        //executa o relatório
        JasperPrint impressao = JasperFillManager.fillReport(relatorio, map, jrRS);

        //exibe o resultado
        JasperViewer viewer = new JasperViewer(impressao, true);

        viewer.viewReport(impressao);
    }
}
