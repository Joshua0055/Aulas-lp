
import java.util.Scanner;

public class OperacaoMedia {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o número de notas: ");
        int num = Integer.parseInt(leitor.nextLine());
        double Notas[] = new double[num];
        for (int i = 0; i < num; i++) {
            System.out.println("Digite a nota [" + i + "]");
            Notas[i] = Double.parseDouble(leitor.nextLine());
        }
        double media = calcularMedia(Notas);
        System.out.printf("A media é %.1f", media);

        leitor.close();
    }
    public static double calcularMedia(double [] numeros){
        if (numeros.length == 0){
            return 0;
        } else{
            double soma = 0.0;
            for (int i = 0; i < numeros.length; i++) {
                soma+= numeros[i];
            }
            return soma/numeros.length;

        }
    }
}