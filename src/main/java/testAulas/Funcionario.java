package testAulas;

public class Funcionario {
    private String cpf;
    private String nome;
    private int cargaHorariaSemanal;
    private String funcao;

    public Funcionario (String nome, String cpf, int cargaHorariaSemanal, String funcao){
        this.cpf= cpf;
        this.nome= nome;
        this.cargaHorariaSemanal= cargaHorariaSemanal;
        this.funcao= funcao;
    }
    public String getcpf(){
        return this.cpf;
    }
    public String getnome(){
        return this.nome;
    }
    public int getcargaHorariaSemanal(){
        return this.cargaHorariaSemanal;
    }
    public String getfuncao(){
        return this.funcao;
    }
    public void setcargaHorariaSemanal(int cargaHoraria){
        this.cargaHorariaSemanal= cargaHoraria;
    }
    public String toString(){
        return "Funcionário(a) "+getnome()+" de cpf: "+getcpf()+" com carga horária de "+getcargaHorariaSemanal()+" horas e que trabalha como "+getfuncao();

    }
}
