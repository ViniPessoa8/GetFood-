package Classes;

import DAO.CursoDAO;
import DAO.TurmaDAO;

public class Aluno {

    private float saldo = 0;
    private String nome = "", turma = "", matricula = "";
    private int beneficiario = 0, curso = 0;
    private CursoDAO cursoDao;
    private byte[] foto;
    
    
    public Aluno(String matricula, float saldo, String nome, String turma, int curso, int beneficiario, byte[] foto) {
        this.matricula = matricula;
        this.saldo = saldo;
        this.nome = nome;
        this.turma = turma;
        this.curso = curso;
        this.beneficiario = beneficiario;
        this.foto = foto;
        cursoDao = new CursoDAO();
    }
    
    public Aluno(){
        cursoDao = new CursoDAO();
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

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    
    
    @Override
    public String toString() {
        //passa o benefício para String 'Sim' ou 'Não'
        String beneficio = "";
        if(getBeneficiario() == 1){
            beneficio = "Sim";
        } else {
            beneficio = "Não";
        }
        
        return "Matricula: " + getMatricula() + "\n"
                + "Nome: " + getNome() + "\n"
                + "Saldo: " + getSaldo() + "\n"
                + "Beneficiário: " + beneficio + "\n"
                + "Curso: " + cursoDao.getCurso(getCurso()).getNome() + "\n"
                + "Turma: " + getTurma() + "\n";
    }

    

}
