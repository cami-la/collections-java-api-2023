package main.java.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
  //atributo
  private Map<Long, Produto> estoqueProdutosMap;

  public EstoqueProdutos() {
    this.estoqueProdutosMap = new HashMap<>();
  }

  public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
    estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
  }

  public void exibirProdutos() {
    System.out.println(estoqueProdutosMap);
  }

  public double calcularValorTotalEstoque() {
    double valorTotalEstoque = 0d;
    if(!estoqueProdutosMap.isEmpty()) {
      for(Produto p : estoqueProdutosMap.values()) {
        valorTotalEstoque += p.getQuantidade() * p.getPreco();
      }
    }
    return valorTotalEstoque;
  }

  public Produto obterProdutoMaisCaro() {
    Produto produtoMaisCaro = null;
    double maiorPreco = Double.MIN_VALUE;
    for (Produto p : estoqueProdutosMap.values()) {
      if (p.getPreco() > maiorPreco) {
        produtoMaisCaro = p;
        maiorPreco = p.getPreco();
      }
    }
    return produtoMaisCaro;
  }

  public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
    Produto produtoMaiorQuantidadeValorNoEstoque = null;
    double maiorValorTotalProdutoEstoque = 0d;
    if (!estoqueProdutosMap.isEmpty()) {
      for (Map.Entry<Long, Produto> entry : estoqueProdutosMap.entrySet()) {
        double valorProdutoEmEstoque = entry.getValue().getPreco() * entry.getValue().getQuantidade();
        if (valorProdutoEmEstoque > maiorValorTotalProdutoEstoque) {
          maiorValorTotalProdutoEstoque = valorProdutoEmEstoque;
          produtoMaiorQuantidadeValorNoEstoque = entry.getValue();
        }
      }
    }
    return produtoMaiorQuantidadeValorNoEstoque;
  }

  public static void main(String[] args) {
    EstoqueProdutos estoque = new EstoqueProdutos();
    estoque.exibirProdutos();

    estoque.adicionarProduto(1L, "Produto A", 1, 50.0);
    estoque.adicionarProduto(2L, "Produto B", 5, 11.0);
    estoque.adicionarProduto(3L, "Produto C", 3, 10.0);
    estoque.adicionarProduto(3L, "Produto D", 2, 4.0);

    estoque.exibirProdutos();

    System.out.println("Valor total do estoque: R$" + estoque.calcularValorTotalEstoque());
    System.out.println("Produto mais caro: " + estoque.obterProdutoMaisCaro());
    System.out.println("Produto com maior quantidade em valor no estoque: " + estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
  }
}
