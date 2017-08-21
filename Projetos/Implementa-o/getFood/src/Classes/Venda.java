package Classes;

import java.util.Calendar;


public class Venda 
{
    Aluno al;
    Funcionario fun;
    protected float valor=0;
    protected Calendar data;
    public void Venda(Aluno al,Funcionario fun,float valor,Calendar data)
    {
        this.al=al;
        this.fun=fun;
        this.valor=valor;
        this.data=data;
    }

    public Aluno getAl() {
        return al;
    }

    public void setAl(Aluno al) {
        this.al = al;
    }

    public Funcionario getFun() {
        return fun;
    }

    public void setFun(Funcionario fun) {
        this.fun = fun;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }
    
}
