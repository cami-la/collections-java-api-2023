package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class GabaritoAgendaContatos {
  //atributo
  private Map<String, Integer> agendaContatoMap;

  public GabaritoAgendaContatos() {
    this.agendaContatoMap = new HashMap<>();
  }

  public void adicionarContato(String nome, Integer telefone) {
    agendaContatoMap.put(nome, telefone);
  }

  public void removerContato(String nome) {
    if (!agendaContatoMap.isEmpty()) {
      agendaContatoMap.remove(nome);
    } else {
      System.out.println("A agenda de contatos está vazia.");
    }
  }

  public void exibirContatos() {
    if (!agendaContatoMap.isEmpty()) {
      System.out.println(agendaContatoMap);
    } else {
      System.out.println("A agenda de contatos está vazia.");
    }
  }

  public Integer pesquisarPorNome(String nome) {
    Integer numeroPorNome = null;
    if (!agendaContatoMap.isEmpty()) {
      numeroPorNome = agendaContatoMap.get(nome);
      if (numeroPorNome == null) {
        System.out.println("Contato1 não encontrado na agenda.");
      }
    } else {
      System.out.println("A agenda de contatos está vazia.");
    }
    return numeroPorNome;
  }

  public static void main(String[] args) {
    GabaritoAgendaContatos gabaritoAgendaContatos = new GabaritoAgendaContatos();

    // Adicionar contatos
    gabaritoAgendaContatos.adicionarContato("Camila", 123456);
    gabaritoAgendaContatos.adicionarContato("João", 5665);
    gabaritoAgendaContatos.adicionarContato("Carlos", 1111111);
    gabaritoAgendaContatos.adicionarContato("Ana", 654987);
    gabaritoAgendaContatos.adicionarContato("Maria", 1111111);
    gabaritoAgendaContatos.adicionarContato("Camila", 44444);

    gabaritoAgendaContatos.exibirContatos();

    // Remover um contato
    gabaritoAgendaContatos.removerContato("Maria");
    gabaritoAgendaContatos.exibirContatos();

    // Pesquisar número por nome
    String nomePesquisa = "João";
    Integer numeroPesquisa = gabaritoAgendaContatos.pesquisarPorNome("João");
    System.out.println("Número de telefone de " + nomePesquisa + ": " + numeroPesquisa);

    String nomePesquisaNaoExistente = "Paula";
    Integer numeroPesquisaNaoExistente = gabaritoAgendaContatos.pesquisarPorNome(nomePesquisaNaoExistente);
    System.out.println("Número de telefone de " + nomePesquisaNaoExistente + ": " + numeroPesquisaNaoExistente);
  }

}