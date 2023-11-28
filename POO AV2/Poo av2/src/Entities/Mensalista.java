package Entities;

public class Mensalista extends  Funcionario{
    public Double salarioMensal;


    public Mensalista(String nome, Integer idade, Double salarioMensal) {
        super(nome, idade);
        this.salarioMensal = salarioMensal;
    }

    public double calcularSalario(){
        return salarioMensal = (double)3000;
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
