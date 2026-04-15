package me.dio.collections.list.operacoes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Operações básicas em Listas usando Java 25.
 * Substitui loops imperativos por Streams API.
 */
public class ListaTarefa {
    private final List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    /**
     * Remove tarefas com base na descrição utilizando removeIf (Java 8+).
     * Garante que todas as tarefas correspondentes sejam removidas em uma única operação.
     */
    public void removerTarefa(String descricao) {
        if (tarefaList.isEmpty()) throw new IllegalStateException("A lista está vazia!");
        
        tarefaList.removeIf(t -> t.descricao().equalsIgnoreCase(descricao));
    }

    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }

    /**
     * Retorna uma lista inmutável de descrições das tarefas.
     */
    public List<String> obterDescricoesTarefas() {
        return tarefaList.stream()
                .map(Tarefa::descricao)
                .collect(Collectors.toUnmodifiableList());
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        listaTarefa.adicionarTarefa("Comprar leite");
        listaTarefa.adicionarTarefa("Estudar para o exame");
        listaTarefa.adicionarTarefa("Fazer exercícios");

        System.out.println("Tarefas: " + listaTarefa.obterDescricoesTarefas());
        System.out.println("Total: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.removerTarefa("Comprar leite");
        System.out.println("Tarefas após remoção: " + listaTarefa.obterDescricoesTarefas());
    }
}
