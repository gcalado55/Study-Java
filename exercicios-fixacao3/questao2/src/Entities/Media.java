package Entities;

public class Media {
    public static double calcularMediaAritmetica(double nota1, double nota2) {
        return (nota1 + nota2) / 2;
    }

    public static double calcularMediaPonderada(double nota1, double nota2, double nota3, double peso1, double peso2, double peso3) {
        return (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);
    }
}
}
