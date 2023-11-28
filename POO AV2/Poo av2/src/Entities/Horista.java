package Entities;

public class Horista extends Funcionario {
    private Double salarioHora;
    private Integer horasTrabalhadas;

    public Horista(){

    }

    public Horista(String nome, Integer idade, Double salarioHora, Integer horasTrabalhadas) {
        super(nome, idade);
        this.salarioHora = salarioHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public Double getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(Double salarioHora) {
        this.salarioHora = salarioHora;
    }

    public Integer getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(Integer horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double calcularSalario(){
        return salarioHora * horasTrabalhadas;
    }

    @Override
    public void realizarTarefa(String tarefa){
        System.out.println("Realizando a tarefa: " + tarefa);
    }

    public String toString(){
        return "Funcionario: "
                +getNome()
                +", Idade: "
                +getIdade()
                +", Salario: "
                +String.format("%.2f", calcularSalario());
    }
}
