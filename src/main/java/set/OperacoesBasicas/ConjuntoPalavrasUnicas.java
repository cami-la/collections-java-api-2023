package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
  //atributos
  private Set<String> palavrasUnicas;

  public ConjuntoPalavrasUnicas() {
    this.palavrasUnicas = new HashSet<>();
  }

  public void adicionarPalavra(String palavra) {
    palavrasUnicas.add(palavra);
  }

  public void removerPalavra(String palavra) {
    palavrasUnicas.remove(palavra);
  }

  public boolean verificarPalavra(String palavra) {
    return palavrasUnicas.contains(palavra);
  }

  public void exibirPalavrasUnicas() {
    System.out.println(palavrasUnicas);
  }

  public static void main(String[] args) {
    ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();
    conjuntoPalavrasUnicas.adicionarPalavra("Palavra 1");
    conjuntoPalavrasUnicas.adicionarPalavra("Palavra 1");
    conjuntoPalavrasUnicas.adicionarPalavra("Palavra 3");
    conjuntoPalavrasUnicas.adicionarPalavra("Palavra 4");
    conjuntoPalavrasUnicas.adicionarPalavra("Palavra 2");
    conjuntoPalavrasUnicas.exibirPalavrasUnicas();
    conjuntoPalavrasUnicas.removerPalavra("Palavra 2");
    conjuntoPalavrasUnicas.exibirPalavrasUnicas();
    conjuntoPalavrasUnicas.removerPalavra("Palavra 5");
    System.out.println(conjuntoPalavrasUnicas.verificarPalavra("Palavra 2"));
    conjuntoPalavrasUnicas.exibirPalavrasUnicas();
  }
}
