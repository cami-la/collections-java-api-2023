package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
  //atributos
  private Set<Tarefa> tarefas;

  public ListaTarefas() {
    this.tarefas = new HashSet<>();
  }

  public void adicionarTarefa(Tarefa tarefa) {
    tarefas.add(tarefa);
  }

  public void removerTarefa(String descricao) {
    Tarefa tarefaParaRemover = null;
    for(Tarefa t: tarefas) {
      if (t.getDescricao().equalsIgnoreCase(descricao)) {
        tarefaParaRemover = t;
        break;
      }
    }
    tarefas.remove(tarefaParaRemover);
  }

  public void exibirTarefas() {
    System.out.println(tarefas);
  }

  public int contarTarefas() {
    return tarefas.size();
  }

  public Set<Tarefa> obterTarefasConcluidas() {
    Set<Tarefa> tarefasConcluidas = new HashSet<>();
    for (Tarefa t : tarefas) {
      if (t.isConcluida()) {
        tarefasConcluidas.add(t);
      }
    }
    return tarefasConcluidas;
  }

  public Set<Tarefa> obterTarefasPendentes() {
    Set<Tarefa> tarefasNaoConcluidas = new HashSet<>();
    for (Tarefa t : tarefas) {
      if (!t.isConcluida()) {
        tarefasNaoConcluidas.add(t);
      }
    }
    return tarefasNaoConcluidas;
  }

  public void marcarTarefaConcluida(String descricao) {
    for (Tarefa t : tarefas) {
      if (t.getDescricao().equalsIgnoreCase(descricao)) {
        t.setConcluida(true);
      }
    }
  }

  public void marcarTarefaPendente(String descricao) {
    for (Tarefa t : tarefas) {
      if (t.getDescricao().equalsIgnoreCase(descricao)) {
        t.setConcluida(false);
      }
    }
  }

  public void limparListaTarefas() {
    tarefas.clear();
  }

  public static void main(String[] args) {
    ListaTarefas listaTarefas = new ListaTarefas();
    listaTarefas.adicionarTarefa(new Tarefa("Tarefa 1", false));
    listaTarefas.adicionarTarefa(new Tarefa("Tarefa 2", false));
    listaTarefas.adicionarTarefa(new Tarefa("Tarefa 3", false));
    listaTarefas.adicionarTarefa(new Tarefa("Tarefa 4", false));
    listaTarefas.exibirTarefas();
    listaTarefas.removerTarefa("Tarefa 3");
    listaTarefas.exibirTarefas();
    System.out.println("Existem " + listaTarefas.contarTarefas() + " na lista de tarefas.");
    System.out.println(listaTarefas.obterTarefasConcluidas());
    System.out.println(listaTarefas.obterTarefasPendentes());
    listaTarefas.marcarTarefaConcluida("Tarefa 2");
    listaTarefas.marcarTarefaConcluida("Tarefa 1");
    listaTarefas.exibirTarefas();
    listaTarefas.limparListaTarefas();
    listaTarefas.exibirTarefas();
  }
}
