package Classes;

import DAO.ConnectionFactory;
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

public class Relatorio {

    private Calendar data;
    private float totalSaldo = 0, totalAl = 0;
    private int tipo = 0;
    private static final String driver = "com.mysql.jdbc.Driver";

    public void Relatorio(Calendar data, float saldo, float alunos, int tipo) {
        this.data = data;
        totalSaldo = saldo;
        totalAl = alunos;
        this.tipo = tipo;
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

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public float getTotalSaldo() {
        return totalSaldo;
    }

    public void setTotalSaldo(float totalSaldo) {
        this.totalSaldo = totalSaldo;
    }

    public float getTotalAl() {
        return totalAl;
    }

    public void setTotalAl(float totalAl) {
        this.totalAl = totalAl;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

}
