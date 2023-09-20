import java.util.Scanner;
import Entities.Combustivel;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha um tipo de combustivel: ");
        System.out.println("A. Alcool");
        System.out.println("G. Gasolina");
        char combustivel = sc.next().charAt(0);
        System.out.println();
        System.out.print("Quantos Litros serão repostos: ");
        double litros = sc.nextDouble();
        Combustivel combustivel1 = new Combustivel(litros);


        switch (combustivel){
            case 'a':
                System.out.printf("Você abasteceu %.2f litros de Alcool pelo valor de R$%.2f", litros, combustivel1.totalAlcool());
                break;
            case 'g':
                System.out.printf("Você abasteceu %.2f litros de Gasolina pelo valor de R$%.2f", litros, combustivel1.totalGasolina());
                break;
            default:
                System.out.println("Escolha uma opção valida");
        }



        sc.close();
    }
}