package Classes;

import java.util.Calendar;
import java.util.Date;

public class Relatorio {

    private Calendar data;
    private float totalSaldo = 0, totalAl = 0;
    private int tipo = 0;
    private static final String driver = "com.mysql.jdbc.Driver";
    private Date dataInicial, dataFinal;

    public void Relatorio(Calendar data, float saldo, float alunos, int tipo) {
        this.data = data;
        totalSaldo = saldo;
        totalAl = alunos;
        this.tipo = tipo;
    }
    
    public void Relatorio(Date dataInicial, Date dataFinal, float saldo, float alunos, int tipo) {
        this.data = data;
        totalSaldo = saldo;
        totalAl = alunos;
        this.tipo = tipo;
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
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

    public Date getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(Date dataInicial) {
        this.dataInicial = dataInicial;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }
    
    

}
