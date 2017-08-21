package Classes;


import java.util.Calendar;

public class Relatorio 
{
   protected Calendar data;
   protected float totalSaldo=0, totalAl=0;
   protected int tipo=0;
   public void Relatorio(Calendar data,float saldo,float alunos,int tipo)
   {
       this.data=data;
       totalSaldo=saldo;
       totalAl=alunos;
       this.tipo=tipo;
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
