package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class GabaritoDicionario {
  private Map<String, String> dicionario;

  public GabaritoDicionario() {
    this.dicionario = new HashMap<>();
  }

  public void adicionarPalavra(String palavra, String definicao) {
    dicionario.put(palavra, definicao);
  }

  public void removerPalavra(String palavra) {
    if (!dicionario.isEmpty()) {
      dicionario.remove(palavra);
    } else {
      System.out.println("O dicionário está vazio.");
    }
  }

  public String pesquisarPorPalavra(String palavra) {
    String definicao = dicionario.get(palavra);
    if (definicao != null) {
      return definicao;
    }
    return "Linguagem não encontrada no dicionário.";
  }

  public void exibirPalavras() {
    if (!dicionario.isEmpty()) {
      System.out.println(dicionario);
    } else {
      System.out.println("O dicionário está vazio.");
    }
  }

  public static void main(String[] args) {
    GabaritoDicionario gabaritoDicionario = new GabaritoDicionario();

    // Adicionar palavras (linguagens de programação)
    gabaritoDicionario.adicionarPalavra("java", "Linguagem de programação orientada a objetos.");
    gabaritoDicionario.adicionarPalavra("typescript", "Superset da linguagem JavaScript que adiciona tipagem estática.");
    gabaritoDicionario.adicionarPalavra("kotlin", "Linguagem moderna de programação para a JVM.");

    // Exibir todas as palavras
    gabaritoDicionario.exibirPalavras();

    // Pesquisar palavras
    String definicaoJava = gabaritoDicionario.pesquisarPorPalavra("java");
    System.out.println("Definição da linguagem 'java': " + definicaoJava);

    String definicaoCSharp = gabaritoDicionario.pesquisarPorPalavra("csharp");
    System.out.println(definicaoCSharp);

    // Remover uma palavra
    gabaritoDicionario.removerPalavra("typescript");
    gabaritoDicionario.exibirPalavras();
  }
}