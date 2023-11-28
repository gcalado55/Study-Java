package Entities;

public class Tarefa {

    private String descricao;
    private String dataConclusao;
    private int prioridade;


    public Tarefa() {
    }

    public Tarefa(String descricao, String dataConclusao, int prioridade) {
        this.descricao = descricao;
        this.dataConclusao = dataConclusao;
        this.prioridade = prioridade;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public String getDataConclusao(){
        return this.dataConclusao;
    }

    public int getPrioridade() {
        return this.prioridade;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setDataConclusao(String dataConclusao) {
        this.dataConclusao = dataConclusao;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }


    public String toString(){
        return descricao
                +", "
                +dataConclusao
                +", "
                +prioridade;
    }
}
