package Entities;

public class Mensalista extends  Funcionario{
    public Double salarioMensal;

    public Mensalista(){

    }

    public Mensalista(String nome, Integer idade, Double salarioMensal) {
        super(nome, idade);
        this.salarioMensal = salarioMensal;
    }

    public Double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(Double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    public double calcularSalario(){
        return salarioMensal += salarioMensal * 0.1  ;
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
