package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos1 {
  //atributo
  private Set<Contato1> contatosSet;

  public AgendaContatos1() {
    this.contatosSet = new HashSet<>();
  }

  public void adicionarContato(String nome, int numero) {
    contatosSet.add(new Contato1(nome, numero));
  }

  public void exibirContatos() {
    if (!contatosSet.isEmpty()) {
      System.out.println(contatosSet);
    } else {
      System.out.println("O conjunto está vazio!");
    }
  }

  public Set<Contato1> pesquisarPorNome(String nome) {
    Set<Contato1> contatosPorNome = new HashSet<>();
    if (!contatosSet.isEmpty()) {
      for (Contato1 c : contatosSet) {
        if (c.getNome().startsWith(nome)) {
          contatosPorNome.add(c);
        }
      }
      return contatosPorNome;
    } else {
      throw new RuntimeException("O conjunto está vazio!");
    }
  }

  public Contato1 atualizarNumeroContato(String nome, int novoNumero) {
    Contato1 contato1Atualizado = null;
    if (!contatosSet.isEmpty()) {
      for (Contato1 c : contatosSet) {
        if (c.getNome().equalsIgnoreCase(nome)) {
          c.setNumero(novoNumero);
          contato1Atualizado = c;
          break;
        }
      }
      return contato1Atualizado;
    } else {
      throw new RuntimeException("O conjunto está vazio!");
    }
  }

  public static void main(String[] args) {
    // Criando uma instância da classe AgendaContatos1
    AgendaContatos1 agendaContatos1 = new AgendaContatos1();

    // Exibindo os contatos no conjunto (deve estar vazio)
    agendaContatos1.exibirContatos();

    // Adicionando contatos à agenda
    agendaContatos1.adicionarContato("João", 123456789);
    agendaContatos1.adicionarContato("Maria", 987654321);
    agendaContatos1.adicionarContato("Maria Fernandes", 55555555);
    agendaContatos1.adicionarContato("Ana", 88889999);
    agendaContatos1.adicionarContato("Fernando", 77778888);
    agendaContatos1.adicionarContato("Carolina", 55555555);

    // Exibindo os contatos na agenda
    agendaContatos1.exibirContatos();

    // Pesquisando contatos pelo nome
    System.out.println(agendaContatos1.pesquisarPorNome("Maria"));

    // Atualizando o número de um contato
    Contato1 contato1Atualizado = agendaContatos1.atualizarNumeroContato("Carolina", 44443333);
    System.out.println("Contato1 atualizado: " + contato1Atualizado);

    // Exibindo os contatos atualizados na agenda
    System.out.println("Contatos na agenda após atualização:");
    agendaContatos1.exibirContatos();
  }
}
