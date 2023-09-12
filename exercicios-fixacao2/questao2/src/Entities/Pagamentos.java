package Entities;

public class Pagamentos {
    private String empregado;
    private double percentual;
    private double salarioLiquido;
    private double desconto;
    private double horasTrabalhadas;
    private double precoPorHora;
    private double fgts;

    public Pagamentos(String empregado, double horasTrabalhadas, double precoPorHora) {
        this.empregado = empregado;
        this.horasTrabalhadas = horasTrabalhadas;
        this.precoPorHora = precoPorHora;
    }

    public double getFgts() {
        return fgts;
    }

    public String getEmpregado() {
        return empregado;
    }

    public void setEmpregado(String empregado) {
        this.empregado = empregado;
    }

    public double getPercentual() {
        return percentual;
    }

    public double getSalarioLiquido() {
        return salarioLiquido;
    }

    public double getDesconto() {
        return desconto;
    }

    public double salarioBruto(){
        return horasTrabalhadas * precoPorHora;
    }

    public double descontoInss() {
        if (salarioBruto() <=900) {
            percentual = 0;
        } else if (salarioBruto() <= 1500) {
            percentual = 5;
        } else if (salarioBruto() <= 2500) {
            percentual = 10;
        }else{
            percentual = 20;
        }
        desconto = (percentual / 100) * salarioBruto();
        return desconto;
    }

    public double inss(){
        return salarioBruto() * 0.1;
    }

    public double fgts(){
        fgts = salarioBruto() *0.11;
        return fgts;
    }

    public double descontoTotal(){
        return inss() + desconto;
    }

    public double salarioLiquido(){
        return salarioLiquido = salarioBruto() - descontoTotal();
    }

    public String toString() {
        return "Empregado: "
                + empregado
                + ", Salario Bruto: "
                + String.format("%.2f", salarioBruto())
                + ", Desconto IR: "
                + inss()
                + ", INSS: "
                + String.format("%.2f", inss())
                +", FGTS: "
                +String.format("%.2f", fgts())
                + ", Total de descontos: "
                + String.format("%.2f", descontoTotal())
                + ", Salario Líquido: "
                + String.format("%.2f", salarioLiquido());
    }
}