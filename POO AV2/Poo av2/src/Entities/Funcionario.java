package Entities;

public class Funcionario {

    private String nome;
    private Integer idade;

    public Funcionario(){
    }

    public Funcionario(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public void realizarTarefa(String tarefa){
        System.out.println("Realizando a tarefa: " + tarefa);
    }

}
