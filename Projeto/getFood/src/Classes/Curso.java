package Classes;

public class Curso 
{
    protected String codigo="",nome="";
    public Curso(String codigo,String nome)
    {
        this.nome=nome;
        this.codigo=codigo;
    }

    public Curso() 
    {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
