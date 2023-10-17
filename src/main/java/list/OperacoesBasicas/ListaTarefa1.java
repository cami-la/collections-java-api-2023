package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;


public class ListaTarefa1 {
    //sempre que eu criar um objeto do tipo lista de tarefa
    //eu vou ter um atributo tarefaList com um ArrayList esperando
    private List<Tarefa1> tarefa1List;

    public ListaTarefa1() {
        this.tarefa1List = new ArrayList<>();
    }
    //criando método
    //1º add tarefa
    public void adicionarTarefa(String descricao){
        tarefa1List.add(new Tarefa1(descricao));
    }

    //2ºremover tarefa
    public void removerTarefa(String descricao){
        List<Tarefa1> tarefaForRemove = new ArrayList<>();
        for(Tarefa1 t: tarefa1List){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefaForRemove.add(t);
            }
        }
        tarefa1List.removeAll(tarefaForRemove);
    }

    //3º total de tarefas
    public int totalTarefas(){
        return tarefa1List.size();
    }


    //4º lista de descrições das tarefas
    public void obterDescricoes(){
        System.out.println(tarefa1List);
    }

    public static void main(String[] args) {
        ListaTarefa1 listaTarefa1 = new ListaTarefa1();
        System.out.println("O número total de tarefas é igual a: " + listaTarefa1.totalTarefas());
//        listaTarefa1.adicionarTarefa("Tarefa 1");
//        listaTarefa1.adicionarTarefa("Tarefa 2");
//        listaTarefa1.adicionarTarefa("Tarefa 2");
        System.out.println("O número total de tarefas agora é igual a: " + listaTarefa1.totalTarefas());

        //listaTarefa1.removerTarefa("taReFa 1");
        System.out.println("O número total de tarefas agora é igual a: " + listaTarefa1.totalTarefas());

        listaTarefa1.obterDescricoes();
    }
}
