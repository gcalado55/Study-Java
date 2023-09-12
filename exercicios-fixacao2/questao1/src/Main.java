import java.util.Scanner;
import Entities.Salary;
public class Main {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);


        System.out.println("Insira as informações do colaborador: ");
        System.out.print("Nome: ");
        String colaborador = sc.nextLine();
        System.out.print("Salario Atual: ");
        double salarioOriginal = sc.nextDouble();

        Salary salario = new Salary(colaborador, salarioOriginal);

        salario.calcularAumento();

        System.out.println(salario.toString());

        sc.close();
    }
}