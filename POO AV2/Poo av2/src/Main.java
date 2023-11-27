import Entities.Horista;
import Entities.Mensalista;
import Entities.Funcionario;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("1.Horista\n"
                        +"2.Mensalista\n"
                        +"Escolha uma função: ");

        int funcao = sc.nextInt();
        if (funcao == 1){
            System.out.print("\nDigite o nome do funcionário horista: ");
            sc.nextLine();
            String nome = sc.nextLine();

            System.out.print("Digite a idade do funcionário horista: ");
            Integer idade = sc.nextInt();

            System.out.print("Digite as horas trabalhadas do funcionário horista: ");
            Integer horasTrabalhadas = sc.nextInt();

            System.out.print("Digite o salário por hora do funcionário horista: ");
            Double salarioHora = sc.nextDouble();

            Horista horista = new Horista(nome, idade, salarioHora, horasTrabalhadas);

            System.out.print("Digite a tarefa para o funcionário horista: ");
            sc.nextLine();
            String tarefaHorista = sc.nextLine();

            System.out.println("\n" + horista);
            horista.realizarTarefa(tarefaHorista);

        }
        if (funcao == 2){
            System.out.print("Digite o nome do funcionário mensalista: ");
            String nome = sc.nextLine();
            sc.next();

            System.out.print("Digite a idade do funcionário mensalista: ");
            Integer idade = sc.nextInt();

            System.out.print("Digite o salário mensal do funcionário mensalista: ");
            double salarioMensal = sc.nextDouble();

            Mensalista mensalista = new Mensalista(nome, idade, salarioMensal);

            System.out.print("Digite a tarefa para o funcionário mensalista: ");
            sc.nextLine();
            String tarefaMensalista = sc.nextLine();
            mensalista.realizarTarefa(tarefaMensalista);
            
        }
        else{
        }



        sc.close();
    }
}