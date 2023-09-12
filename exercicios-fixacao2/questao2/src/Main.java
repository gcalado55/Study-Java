import java.util.Scanner;
import Entities.Pagamentos;

public class Main {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);


        System.out.println("Insira as informações do colaborador: ");
        System.out.print("Nome do empregado: ");
        String empregado = sc.nextLine();
        System.out.print("Horas Trabalhadas: ");
        double horasTrabalhadas = sc.nextDouble();
        System.out.print("Preço por hora: ");
        double precoPorHora = sc.nextDouble();

        Pagamentos pagamentos = new Pagamentos(empregado, horasTrabalhadas, precoPorHora);

        pagamentos.descontoInss();

        System.out.println(pagamentos.toString());

        sc.close();
    }
}