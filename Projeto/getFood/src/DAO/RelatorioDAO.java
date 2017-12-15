/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;
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

    public void gerar(String layout, Date inicial, Date fim) throws JRException, SQLException, ClassNotFoundException {
        SimpleDateFormat sdf;
        sdf = new SimpleDateFormat("dd/MM/yyyy");
        java.sql.Date dataIni = null, dataFim = null;

        dataIni = new java.sql.Date(inicial.getTime());
        dataFim = new java.sql.Date(fim.getTime());
        
        String dataInicial, dataFinal;
        dataInicial = sdf.format(inicial.getTime());
        dataFinal = sdf.format(fim.getTime());
        
        //HashMap com os parâmetros
        Map map = new HashMap();
        map.put("dataInicial", dataInicial);
        map.put("dataFinal", dataFinal);

        //gerando o jasper design
        JasperDesign desenho = JRXmlLoader.load(layout);

        //compila o relatório
        JasperReport relatorio = JasperCompileManager.compileReport(desenho);

        //estabelece conexão
        Class.forName(driver);
        Connection con = new ConnectionFactory().getConnection();

        if (dataIni == dataFim) {

           String sql = "SELECT codigo, matrAl, matrFun, valor, tipo, dt , A.beneficiario as beneficio "
                    + "FROM aluno as A INNER JOIN venda as V ON A.matricula = V.matrAl "
                    + "WHERE tipo <> 3 and dt between ? and ? ";
            System.out.println(sql);
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setDate(1, dataIni);
            rs = stmt.executeQuery();
        } else {
            String sql = "SELECT codigo, matrAl, matrFun, valor, tipo, dt , A.beneficiario as beneficio "
                    + "FROM aluno as A INNER JOIN venda as V ON A.matricula = V.matrAl "
                    + "WHERE tipo <> 3 and dt between ? and ?  ";
            
            System.out.println(sql);
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setDate(1, dataIni);
            stmt.setDate(2, dataFim);
            rs = stmt.executeQuery();
        }

        //implementação da interface JRDataSource para DataSource ResultSet
        JRResultSetDataSource jrRS = new JRResultSetDataSource(rs);

        //executa o relatório
        JasperPrint impressao = JasperFillManager.fillReport(relatorio, map, jrRS);

        //exibe o resultado
        JasperViewer viewer = new JasperViewer(impressao, false);
        viewer.viewReport(impressao, false);
    }
    
   
}
