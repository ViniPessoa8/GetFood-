package Classes;

public class Funcionario 
{
    protected float matricula=0;
    protected String nome="",cargo="";

    public Funcionario(float matricula, String nome, String cargo) {
         this.matricula=matricula;
        this.nome=nome;
        this.cargo=cargo;
    }
  

    public float getMatricula() {
        return matricula;
    }

    public void setMatricula(float matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
}
