package testAulas;
import java.util.Scanner;
import java.util.ArrayList;
public class testFuncionarios {
    public static void main(String [] args){
        Scanner leitor = new Scanner(System.in);
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        boolean continuar = true;
        while (continuar){
            System.out.println("Digite o nome do funcionário(a):");
            String nome = leitor.nextLine();
            System.out.println("Digite o cpf do funcionário(a):");
            String cpf = leitor.nextLine();
            System.out.println("Digite a carga horária semanal do funcionário(a);");
            int cargaHoraiaSemanal = Integer.parseInt(leitor.nextLine());
            System.out.println("Digite a função do funcionário(a):");
            String funcao = leitor.nextLine();
            Funcionario funcionario = new Funcionario(nome, cpf, cargaHoraiaSemanal, funcao );
            System.out.println(funcionario.toString());
            funcionarios.add(funcionario);
            System.out.println("Deseja cadastrar outro funcionário? (S)Sim ou (N)Não?");
            String decidir = leitor.nextLine();
            if (decidir.equals("N")){
                continuar = false;
            }
        }
        System.out.println("Funcionários cadastrados:");
        for(Funcionario f: funcionarios){
            System.out.println(f.toString());
        }

    }
}
