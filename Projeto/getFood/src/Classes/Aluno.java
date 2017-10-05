package Classes;

public class Aluno {

    private float saldo = 0;
    private String nome = "", turma = "", matricula = "";
    private int beneficiario = 0, curso = 0;
    //fota ?
    public void Aluno(String matricula, float saldo, String nome, String turma, int curso, int beneficiario) {
        this.matricula = matricula;
        this.saldo = saldo;
        this.nome = nome;
        this.turma = turma;
        this.curso = curso;
        this.beneficiario = beneficiario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
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

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public int getBeneficiario() {
        return beneficiario;
    }

    public void setBeneficiario(int beneficiario) {
        this.beneficiario = beneficiario;
    }

    
    
    @Override
    public String toString() {
        return "Aluno{" + "saldo=" + saldo + ", nome=" + nome + ", turma=" + turma + ", curso=" + curso + ", matricula=" + matricula + ", beneficiario=" + beneficiario + '}';
    }

    

}
