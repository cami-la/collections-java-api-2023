package main.java.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
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
    if (!estoqueProdutosMap.isEmpty()) {
      for (Produto p : estoqueProdutosMap.values()) {
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

  public Produto obterProdutoMaisBarato() {
    Produto produtoMaisBarato = null;
    double menorPreco = Double.MAX_VALUE;
    for (Produto p : estoqueProdutosMap.values()) {
      if (p.getPreco() < menorPreco) {
        produtoMaisBarato = p;
        menorPreco = p.getPreco();
      }
    }
    return produtoMaisBarato;
  }

  public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
    Produto produto = null;
    if (!estoqueProdutosMap.isEmpty()) {
        for (Produto p : estoqueProdutosMap.values()) {
            if (produto == null) {
                produto = p;
                continue;
            }

            if (isMaiorQuantidadeValorTotal(p, produto)) {
                produto = p;
            }
        }
        return produto;
    }
    System.out.println("Nao tem produtos no estoque");
    return produto;
}

private boolean isMaiorQuantidadeValorTotal(Produto p1, Produto p2) {
    double totalProduto1 = p1.getPreco() * p1.getQuantidade();
    double totalProduto2 = p2.getPreco() * p2.getQuantidade();
    boolean isMaiorValorTotal = totalProduto1 > totalProduto2 ;
    boolean isMesmoValorTotal = totalProduto1  == totalProduto2;
    boolean isMaiorQuantidade = p1.getQuantidade() > p2.getQuantidade();

    
    if(isMaiorValorTotal || isMesmoValorTotal && isMaiorQuantidade){
        return true;
    }
    
    return false;
}

  public static void main(String[] args) {
    EstoqueProdutos estoque = new EstoqueProdutos();

    // Exibe o estoque vazio
    estoque.exibirProdutos();

    // Adiciona produtos ao estoque
    estoque.adicionarProduto(1L, "Notebook", 1, 1500.0);
    estoque.adicionarProduto(2L, "Mouse", 5, 25.0);
    estoque.adicionarProduto(3L, "Monitor", 10, 400.0);
    estoque.adicionarProduto(4L, "TV", 1, 4000.0);
    estoque.adicionarProduto(5L, "Teclado", 2, 40.0);

    // Exibe os produtos no estoque
    estoque.exibirProdutos();

    // Calcula e exibe o valor total do estoque
    System.out.println("Valor total do estoque: R$" + estoque.calcularValorTotalEstoque());

    // Obtém e exibe o produto mais caro
    Produto produtoMaisCaro = estoque.obterProdutoMaisCaro();
    System.out.println("Produto mais caro: " + produtoMaisCaro);

    // Obtém e exibe o produto mais barato
    Produto produtoMaisBarato = estoque.obterProdutoMaisBarato();
    System.out.println("Produto mais barato: " + produtoMaisBarato);

    // Obtém e exibe o produto com a maior quantidade em valor no estoque
    Produto produtoMaiorQuantidadeValorTotal = estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque();
    System.out.println("Produto com maior quantidade em valor no estoque: " + produtoMaiorQuantidadeValorTotal);
  }
}
