import Entities.Tarefa;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Tarefa> tarefaList = new ArrayList<>();


        System.out.print("Descricao: ");
        String descricao = sc.nextLine();
        System.out.print("Data: ");
        String dataConclusao = sc.next();
        System.out.print("Prioridade: ");
        Integer prioridade = sc.nextInt();

        tarefaList.add(new Tarefa(descricao, dataConclusao, prioridade));

        tarefaList.stream().filter(prior -> prior.getPrioridade() == prioridade).findFirst().orElse(null);

        for (Tarefa tarefa: tarefaList){
            System.out.println(tarefa);
        }


        sc.close();
    }
}