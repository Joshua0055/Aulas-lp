package Aulas;

public class Voto {
    private String codigo;
    private int numChapa;
    public Voto(String codigo, int numchapa) {
        this.codigo = codigo;
        this.numChapa = numchapa;
    }
    public String getCodigo() {
        return this.codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public int getnumChapa() {
        return this.numChapa;
    }
    public void setnumChapa(int numchapa) {
        this.numChapa = numchapa;
    }
    public String toString(){
        return "Código votante:  "+codigo+", chapa votada:"+this.numChapa;
    }

}
