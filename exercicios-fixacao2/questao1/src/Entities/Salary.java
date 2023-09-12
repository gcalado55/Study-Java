package Entities;

public class Salary {

    private String colaborador;
    private double salarioOriginal;
    private double percentual;
    private double salarioNovo;
    private double aumento;

    public Salary(String colaborador, double salarioOriginal) {
        this.colaborador = colaborador;
        this.salarioOriginal = salarioOriginal;
    }

    public String getColaborador() {
        return colaborador;
    }

    public void setColaborador(String colaborador) {
        this.colaborador = colaborador;
    }

    public double getSalarioOriginal() {
        return salarioOriginal;
    }

    public double getPercentual() {
        return percentual;
    }

    public double getSalarioNovo() {
        return salarioNovo;
    }

    public double getAumento() {
        return aumento;
    }

    public double calcularAumento() {
        if (salarioOriginal <= 280) {
            percentual = 20;
        } else if (salarioOriginal > 280 && salarioOriginal < 700) {
            percentual = 15;
        } else if (salarioOriginal > 700 && salarioOriginal < 1500) {
            percentual = 10;
        } else if (salarioOriginal > 1500) {
            percentual = 5;
        }
        aumento = (percentual / 100) * salarioOriginal;
        salarioNovo = salarioOriginal + aumento;
        return aumento;
    }

    public String toString(){
        return  "Colaborador: "
                +colaborador
                +", Salario Original: "
                +String.format("%.2f",salarioOriginal)
                +", Percentual do aumento: "
                +percentual
                +"%, Valor do aumento: "
                + String.format("%.2f",aumento)
                +", Novo salario: "
                +String.format("%.2f",salarioNovo);
    }
}

