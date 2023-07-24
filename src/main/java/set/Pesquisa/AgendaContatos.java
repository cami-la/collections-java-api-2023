package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
  //atributo
  private Set<Contato> contatosSet;

  public AgendaContatos() {
    this.contatosSet = new HashSet<>();
  }

  public void adicionarContato(String nome, int numero) {
    contatosSet.add(new Contato(nome, numero));
  }

  public void exibirContatos() {
    if (!contatosSet.isEmpty()) {
      System.out.println(contatosSet);
    } else {
      System.out.println("O conjunto está vazio!");
    }
  }

  public Set<Contato> pesquisarPorNome(String nome) {
    Set<Contato> contatosPorNome = new HashSet<>();
    if (!contatosSet.isEmpty()) {
      for (Contato c : contatosSet) {
        if (c.getNome().startsWith(nome)) {
          contatosPorNome.add(c);
        }
      }
      return contatosPorNome;
    } else {
      throw new RuntimeException("O conjunto está vazio!");
    }
  }

  public Contato atualizarNumeroContato(String nome, int novoNumero) {
    Contato contatoAtualizado = null;
    if (!contatosSet.isEmpty()) {
      for (Contato c : contatosSet) {
        if (c.getNome().equalsIgnoreCase(nome)) {
          c.setNumero(novoNumero);
          contatoAtualizado = c;
          break;
        }
      }
      return contatoAtualizado;
    } else {
      throw new RuntimeException("O conjunto está vazio!");
    }
  }

  public static void main(String[] args) {
    AgendaContatos agendaContatos = new AgendaContatos();

    agendaContatos.exibirContatos();

    agendaContatos.adicionarContato("Camila", 123456);
    agendaContatos.adicionarContato("Camila", 5665);
    agendaContatos.adicionarContato("Camila", 5665);
    agendaContatos.adicionarContato("Camila Cavalcante", 1111111);
    agendaContatos.adicionarContato("Camila DIO", 654987);
    agendaContatos.adicionarContato("Maria Silva", 1111111);

    agendaContatos.exibirContatos();

    System.out.println(agendaContatos.pesquisarPorNome("Camila"));

    System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Maria Silva", 5555555));

    agendaContatos.exibirContatos();
  }
}
