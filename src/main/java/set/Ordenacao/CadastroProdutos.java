package main.java.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
  //atributo
  private Set<Produto> produtoSet;

  public CadastroProdutos() {
    this.produtoSet = new HashSet<>();
  }

  public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
    produtoSet.add(new Produto(cod, nome, preco, quantidade));
  }

  public Set<Produto> exibirProdutosPorNome() {
    Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
    if (!produtoSet.isEmpty()) {
      return produtosPorNome;
    } else {
      throw new RuntimeException("O conjunto está vazio!");
    }
  }

  public Set<Produto> exibirProdutosPorPreco() {
    Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
    if (!produtoSet.isEmpty()) {
      produtosPorPreco.addAll(produtoSet);
      return produtosPorPreco;
    } else {
      throw new RuntimeException("O conjunto está vazio!");
    }
  }

  public static void main(String[] args) {
    CadastroProdutos cadastroProdutos = new CadastroProdutos();

    cadastroProdutos.adicionarProduto(1L, "Produto 5", 15d, 5);
    cadastroProdutos.adicionarProduto(2L, "Produto 0", 20d, 10);
    cadastroProdutos.adicionarProduto(1L, "Produto 3", 10d, 2);
    cadastroProdutos.adicionarProduto(9L, "Produto 9", 2d, 2);

    System.out.println(cadastroProdutos.produtoSet);

    System.out.println(cadastroProdutos.exibirProdutosPorNome());

    System.out.println(cadastroProdutos.exibirProdutosPorPreco());
  }
}
