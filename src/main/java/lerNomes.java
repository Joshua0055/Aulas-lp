import java.util.Scanner;

public class lerNomes {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Vamos ler 10 nomes?");
        String [] nomes = new String[10];
        int comecaComA= 0;
        for (int i = 0; i < nomes.length; i++){
            System.out.println("Digite um nome:");
            nomes[i] = leitor.nextLine();
            if (nomes[i].startsWith("A")){
                comecaComA++;
            }
        }
        System.out.println("A quantidade de nomes que começam com a letra (A) foi de "+comecaComA+" nomes.");
        leitor.close();
    }

}
