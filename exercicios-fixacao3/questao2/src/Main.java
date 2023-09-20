import java.util.Scanner;
import Entities.Media;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Menu de opções:");
            System.out.println("1. Média aritmética");
            System.out.println("2. Média ponderada");
            System.out.println("3. Sair");
            System.out.print("Digite a opção desejada: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite a primeira nota: ");
                    double nota1 = scanner.nextDouble();
                    System.out.print("Digite a segunda nota: ");
                    double nota2 = scanner.nextDouble();
                    double mediaAritmetica = Media.calcularMediaAritmetica(nota1, nota2);
                    System.out.println("A média aritmética é: " + mediaAritmetica);
                    break;
                case 2:
                    System.out.print("Digite a primeira nota: ");
                    double nota1Ponderada = scanner.nextDouble();
                    System.out.print("Digite o peso da primeira nota: ");
                    double peso1 = scanner.nextDouble();
                    System.out.print("Digite a segunda nota: ");
                    double nota2Ponderada = scanner.nextDouble();
                    System.out.print("Digite o peso da segunda nota: ");
                    double peso2 = scanner.nextDouble();
                    System.out.print("Digite a terceira nota: ");
                    double nota3Ponderada = scanner.nextDouble();
                    System.out.print("Digite o peso da terceira nota: ");
                    double peso3 = scanner.nextDouble();
                    double mediaPonderada = Media.calcularMediaPonderada(nota1Ponderada, nota2Ponderada, nota3Ponderada, peso1, peso2, peso3);
                    System.out.println("A média ponderada é: " + mediaPonderada);
                    break;
                case 3:
                    System.out.println("Saindo do programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 3);

        scanner.close();
    }
}