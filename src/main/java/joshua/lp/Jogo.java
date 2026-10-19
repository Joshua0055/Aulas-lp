package joshua.lp;

public class Jogo {
    private String nomeTime1;
    private String nomeTime2;
    private int numGolsTime1;
    private int numGolsTime2;

    public Jogo(String nomeTime1, String nomeTime2,  int numGolsTime1, int numGolsTime2) {
        this.nomeTime1 = nomeTime1;
        this.nomeTime2 = nomeTime2;
        this.numGolsTime1 = numGolsTime1;
        this.numGolsTime2 = numGolsTime2;
    }
    public Jogo(){
        this("","",0,0);
    }
    public String getnomeTime1(){
        return nomeTime1;
    }
    public void setnomeTime1(String nomeTime1){
        this.nomeTime1 = nomeTime1;
    }
    public String getnomeTime2(){
        return nomeTime2;
    }
    public void setnomeTime2(String nomeTime2){
        this.nomeTime2 = nomeTime2;
    }
    public int getnumGolsTime1(){
        return numGolsTime1;
    }
    public void setnumGolsTime1(int numGolsTime1){
        this.numGolsTime1 = numGolsTime1;
    }
    public int getnumGolsTime2() {
        return numGolsTime2;
    }
    public void setnumGolsTime2(int numGolsTime2){
        this.numGolsTime2 = numGolsTime2;
    }
    public String toString(){
        return "O jogo entre os times "+getnomeTime1()+" e "+getnomeTime2()+", teve o seguinte resultado: "+getnumGolsTime1()+"x"+getnumGolsTime2();

    }
}
