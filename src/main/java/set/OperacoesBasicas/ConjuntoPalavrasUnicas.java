package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
  //atributos
  private Set<String> palavrasUnicasSet;

  public ConjuntoPalavrasUnicas() {
    this.palavrasUnicasSet = new HashSet<>();
  }

  public void adicionarPalavra(String palavra) {
    palavrasUnicasSet.add(palavra);
  }

  public void removerPalavra(String palavra) {
    if(!palavrasUnicasSet.isEmpty()) {
      palavrasUnicasSet.remove(palavra);
    } else {
      System.out.println("O conjunto está vazio!");
    }
  }

  public boolean verificarPalavra(String palavra) {
    return palavrasUnicasSet.contains(palavra);
  }

  public void exibirPalavrasUnicas() {
    if(!palavrasUnicasSet.isEmpty()) {
      System.out.println(palavrasUnicasSet);
    } else {
      System.out.println("O conjunto está vazio!");
    }
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
