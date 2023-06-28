package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
  //atributo
  private Set<Convidado> convidadoSet;

  public ConjuntoConvidados() {
    this.convidadoSet = new HashSet<>();
  }

  public void adicionarConvidado(String nome, int codigoConvite) {
    convidadoSet.add(new Convidado(nome, codigoConvite));
  }

  public void removerConvidadoPorCodigoConvite(int codigoConvite) {
    Convidado convidadoParaRemover = null;
    for (Convidado c : convidadoSet) {
      if (c.getCodigoConvite() == codigoConvite) {
        convidadoParaRemover = c;
        break;
      }
    }
    convidadoSet.remove(convidadoParaRemover);
  }

  public int contarConvidados() {
    return convidadoSet.size();
  }

  public void exibirConvidados() {
    System.out.println(convidadoSet);
  }

  public static void main(String[] args) {
    ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
    System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");

    conjuntoConvidados.adicionarConvidado("Convidado 1", 1234);
    conjuntoConvidados.adicionarConvidado("Convidado 2", 1235);
    conjuntoConvidados.adicionarConvidado("Convidado 3", 1235);
    conjuntoConvidados.adicionarConvidado("Convidado 4", 1236);

    conjuntoConvidados.exibirConvidados();

    /*System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");

    conjuntoConvidados.removerConvidadoPorCodigoConvite(1236);
    System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");

    conjuntoConvidados.exibirConvidados();*/
  }
}
