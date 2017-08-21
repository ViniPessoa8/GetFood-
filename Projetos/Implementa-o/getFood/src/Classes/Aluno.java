package Classes;

public class Aluno 
{
    protected float matricula=0, saldo=0;
    protected String nome="",turma="",curso="";
    //fota ?
    public void Aluno(float matricula, float saldo,String nome,String turma,String curso)
    {
        this.nome=nome;
        this.saldo=saldo;
        this.nome=nome;
        this.turma=turma;
        this.curso=curso;
    }
    public float getMatricula()
    {
        return matricula;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
}
