package Aulas;
import java.util.Scanner;

import static Aulas.testMetodo.qualChapaTemMaisVotos;
import static Aulas.testMetodo2.verificarSeEstudanteVotou;

public class Sistemavotacoes {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantas pessoas irão votar:");
          int numVotantes = Integer.parseInt(leitor.nextLine());
          Voto [] votos = new Voto [numVotantes];
          for (int k=0; k<numVotantes; k++){
              System.out.println("Digite seu código de votante:");
              String codigo = leitor.nextLine();
              System.out.println("Qual o seu voto? 1. Chapa vamos vencer;" + " 2. Chapa é isso aí; 3. Chapa vamos construir.");
              int numChapa = Integer.parseInt(leitor.nextLine());
              votos[k] = new Voto(codigo, numChapa);
          }
          imprimeresultado(votos);
          int chapaMaisVotada = qualChapaTemMaisVotos(votos);
          if (chapaMaisVotada == -1){
              System.out.println("Houve um empate");
          } else{
              System.out.println("Chapa mais votada: " + chapaMaisVotada);
          }
          boolean esseEstudanteVotou = verificarSeEstudanteVotou("E333", votos);
          if (esseEstudanteVotou){
              System.out.println("voto computado");
          } else{
              System.out.println("votante não encontrado");

        }
          leitor.close();
    }

    public static void imprimeresultado(Voto[] votos){
        int votosChapa1 = 0;
        int votosChapa2 = 0;
        int votosChapa3 = 0;
        int votosNulos = 0;
        int k = 0;
        do {
            if (votos[k].getnumChapa()==1){
                votosChapa1++;
            } else if (votos[k].getnumChapa()==2){
                votosChapa2++;
            } else if (votos[k].getnumChapa()==3){
                votosChapa3++;
            } else {
                votosNulos++;
            }
            k++;
        } while (k<votos.length);
        System.out.println("Votos chapa1: "+votosChapa1);
        System.out.println("Votos chapa2: "+votosChapa2);
        System.out.println("Votos chapa3: "+votosChapa3);
        System.out.println("Votos nulos: "+votosNulos);

    }

}
