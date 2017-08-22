package Classes;

public class Aluno 
{
    protected float saldo=0;
    protected String nome="",turma="",curso="",matricula="";
    //fota ?
    public void Aluno(String matricula, float saldo,String nome,String turma,String curso)
    {
        this.matricula=matricula;
        this.saldo=saldo;
        this.nome=nome;
        this.turma=turma;
        this.curso=curso;
    }
    public String getMatricula()
    {
        return matricula;
    }
    
    public void setMatricula(String matricula){
        this.matricula = matricula;
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

    @Override
    public String toString() {
        return "Aluno{" + "matricula=" + matricula + ", saldo=" + saldo + ", nome=" + nome + ", turma=" + turma + ", curso=" + curso + '}';
    }
    
    
    
}
