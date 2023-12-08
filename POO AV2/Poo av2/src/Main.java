import Entities.Horista;
import Entities.Mensalista;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       int breakWhile = '\0';

       while (breakWhile != 3){
           System.out.print("1.Horista\n"
                            +"2.Mensalista\n"
                            +"3.Sair\n"
                            +"Escolha uma função: ");

           int funcao = sc.nextInt();
           breakWhile = funcao;
           if (funcao == 1){
               Horista horista = new Horista();
               List<Horista> hor = new ArrayList<>();
               System.out.print("\nDigite o nome do funcionário horista: ");
               sc.nextLine();
               String nome = sc.nextLine();

               System.out.print("Digite a idade do funcionário horista: ");
               Integer idade = sc.nextInt();

               System.out.print("Digite as horas trabalhadas do funcionário horista: ");
               Integer horasTrabalhadas = sc.nextInt();

               System.out.print("Digite o salário por hora do funcionário horista: ");
               Double salarioHora = sc.nextDouble();

               System.out.print("Digite a tarefa para o funcionário horista: ");
               sc.nextLine();
               String tarefaHorista = sc.nextLine();

               hor.add(new Horista(nome, idade,salarioHora, horasTrabalhadas));
               for(Horista funcionarios: hor){
                   System.out.println("\n" + funcionarios);
               }
               horista.realizarTarefa(tarefaHorista);
               System.out.println();

           }
           if (funcao == 2){
               Mensalista mensalista = new Mensalista();
               List<Mensalista> mens = new ArrayList<>();
               System.out.print("\nDigite o nome do funcionário mensalista: ");
               sc.nextLine();
               String nome = sc.nextLine();

               System.out.print("Digite a idade do funcionário mensalista: ");
               Integer idade = sc.nextInt();

               System.out.print("Digite o salário mensal do funcionário mensalista: ");
               Double salarioMensal = sc.nextDouble();

               System.out.print("Digite a tarefa para o funcionário mensalista: ");
               sc.nextLine();
               String tarefaMensalista = sc.nextLine();

               mens.add(new Mensalista(nome, idade, salarioMensal));

               for(Mensalista funcionarios: mens){
                   System.out.println("\n" + funcionarios);
               }
               mensalista.realizarTarefa(tarefaMensalista);
               System.out.println();

           }
           else{
           }

       }



        sc.close();
    }
}