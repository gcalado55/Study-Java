import java.util.Scanner;
import Entities.Triangulo;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os três lados do triângulo:");
        double lado1 = sc.nextDouble();
        double lado2 = sc.nextDouble();
        double lado3 = sc.nextDouble();

        Triangulo triangulo = new Triangulo(lado1, lado2, lado3);

        if (triangulo.formaTriangulo()) {
            System.out.println("Os lados formam um triângulo " + triangulo.tipoTriangulo() + ".");
        } else {
            System.out.println("Os lados não formam um triângulo.");
        }

        sc.close();
    }
}