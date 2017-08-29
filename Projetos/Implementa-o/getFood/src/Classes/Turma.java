package Classes;

public class Turma 
{
    private String codigo="",curso="";
    private int ano;
    
    public Turma(String codigo,String curso)
    {
        this.curso=curso;
        this.codigo=codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Turma{" + "codigo=" + codigo + ", curso=" + curso + ", ano=" + ano + '}';
    }
    
    
}
