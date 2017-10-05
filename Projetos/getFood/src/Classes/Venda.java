package Classes;

import java.util.Date;

public class Venda {

    private String matAluno, matFun;
    private Double valor;
    private Date data;
    private int tipo;

    public void Venda(String matAluno, String matFun, Double valor, Date data, int tipo) {
        this.matAluno = matAluno;
        this.matFun = matFun;
        this.valor = valor;
        this.data = data;
        this.tipo = tipo;
    }

    public Venda() {
        matAluno = null;
        matFun = null;
        tipo = 0;
        valor = null;
        data = null;
    }
    
    

    public String getMatAluno() {
        return matAluno;
    }

    public void setMatAluno(String matAluno) {
        this.matAluno = matAluno;
    }

    public String getMatFun() {
        return matFun;
    }

    public void setMatFun(String matFun) {
        this.matFun = matFun;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    

}
