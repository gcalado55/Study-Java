package Entities;

public class Combustivel {
    private double litros;
    private double alcool = 4.35;
    private double gasolina = 5.6;


    public Combustivel(double litros) {
        this.litros = litros;
    }

    public double getLitros() {
        return litros;
    }

    public double getAlcool() {
        return alcool;
    }

    public double getGasolina() {
        return gasolina;
    }

    public double totalAlcool() {
        return alcool * litros;
    }
    public double totalGasolina(){
        return gasolina * litros;
    }
}
