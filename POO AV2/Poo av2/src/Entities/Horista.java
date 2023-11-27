package Entities;

public class Horista extends Funcionario {
    private Double salarioHora;
    private Integer horasTrabalhadas;

    public Horista(String nome, Integer idade, Double salarioHora, Integer horasTrabalhadas) {
        super(nome, idade);
        this.salarioHora = salarioHora;
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
