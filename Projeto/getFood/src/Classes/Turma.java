package Classes;

public class Turma 
{
    private String codigo="",curso="";
    
    public Turma(String codigo,String curso)
    {
        this.curso=curso;
        this.codigo=codigo;
    }

    public Turma() 
    {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    @Override
    public String toString() {
        return "Turma{" + "codigo=" + codigo + ", curso=" + curso + '}';
    }
    
    
}
