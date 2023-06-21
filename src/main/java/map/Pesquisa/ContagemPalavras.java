package main.java.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
  //atributo
  private Map<String, Integer> palavras;

  public ContagemPalavras() {
    this.palavras = new HashMap<>();
  }

  public void adicionarPalavra(String palavra, Integer contagem) {
    palavras.put(palavra, contagem);
  }

  public int exibirContagemPalavras() {
    int contagemTotal = 0;
    for (Map.Entry<String, Integer> entry : palavras.entrySet()) {
      contagemTotal += entry.getValue();
    }
    return contagemTotal;
  }

  public String encontrarPalavraMaisFrequente() {
    String palavraMaisFrequente = null;
    int maiorContagem = 0;
    for (Map.Entry<String, Integer> entry : palavras.entrySet()) {
      if(entry.getValue() > maiorContagem) {
        maiorContagem = entry.getValue();
        palavraMaisFrequente = entry.getKey();
      }
    }
    return palavraMaisFrequente;
  }

  public static void main(String[] args) {
    ContagemPalavras contagemPalavras = new ContagemPalavras();
    contagemPalavras.adicionarPalavra("Palavra 1", 2);
    contagemPalavras.adicionarPalavra("Palavra 2", 8);
    contagemPalavras.adicionarPalavra("Palavra 3", 1);
    contagemPalavras.adicionarPalavra("Palavra 4", 6);
    System.out.println("Existem " + contagemPalavras.exibirContagemPalavras() + " palavras.");
    System.out.println("A palavra mais frequente é: " + contagemPalavras.encontrarPalavraMaisFrequente());
  }
}
