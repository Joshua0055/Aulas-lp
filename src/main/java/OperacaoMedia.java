import java.util.Scanner;
//programa para calucular média;
public class OperacaoMedia {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        //Informando a qnt de notas do aluno;
        System.out.println("Informe o número de notas: ");
        int num = Integer.parseInt(leitor.nextLine());
        //Criando um array de notas;
        double [] Notas =  new double[num];
        for (int i = 0; i < num; i++){
            System.out.println("Digite a nota ["+i+"]");
            Notas[i] = leitor.nextDouble();
        }
        //Chamando o metodo;
        double media = CalculaMedia(Notas);
        System.out.printf("A media do aluno foi %.1f",media);

        leitor.close();
    }
    //Metodo para calcular a media;
    public static double CalculaMedia(double [] notas ){
        if (notas.length==0){
            return 0;
        } else {
            double soma = 0.0;
            for (int i = 0; i < notas.length; i++){
                soma += notas[i];
            }
            return soma/notas.length;

        }
    }
}
