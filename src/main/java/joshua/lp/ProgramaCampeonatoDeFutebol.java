package joshua.lp;
import java.util.Scanner;
public class ProgramaCampeonatoDeFutebol {
    public static void main(String [] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantos jogos aconteceram no campeonato?");
        int qntJogos = Integer.parseInt(leitor.nextLine());
        Jogo [] jogos = new Jogo[qntJogos];
        int k=0;
        while(k<qntJogos){
            System.out.println("Qual o primeiro time?");
            String nomeTime1 = leitor.nextLine();
            System.out.println("Qual o segundo time?");
            String nomeTime2 = leitor.nextLine();
            System.out.println("Quantos gols fez o time "+nomeTime1+"?");
            int qntGolsTime1 = Integer.parseInt(leitor.nextLine());
            System.out.println("Quantos gols fez o time "+nomeTime2+"?");
            int qntGolsTime2 = Integer.parseInt(leitor.nextLine());
            jogos[k] = new Jogo (nomeTime1, nomeTime2, qntGolsTime1, qntGolsTime2);
            k++;
        }
        leitor.close();
        imprimirJogos(jogos);
    }
    public static void imprimirJogos(Jogo [] jogos){
        for(int k=0; k<jogos.length; k++){
            System.out.println(jogos[k].toString());
        }
    }
}
