package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoProdutos {
  //atributo
  private List<Produto> produtos;

  //construtor
  public OrdenacaoProdutos() {
    this.produtos = new ArrayList<>();
  }

  public void adicionarProduto(Produto produto) {
    this.produtos.add(produto);
  }

  public List<Produto> ordenarPorPreco() {
    List<Produto> produtosPorPreco = new ArrayList<>(produtos);
    Collections.sort(produtosPorPreco);
    return produtosPorPreco;
  }

  public List<Produto> ordenarPorEstoque() {
    List<Produto> produtosPorEstoque = new ArrayList<>(produtos);
    Collections.sort(produtosPorEstoque, new ComparatorEstoque());
    //produtosPorEstoque.sort(new ComparatorEstoque());
    return produtosPorEstoque;
  }

  public static void main(String[] args) {
    OrdenacaoProdutos ordenacaoProdutos = new OrdenacaoProdutos();
    ordenacaoProdutos.adicionarProduto(new Produto("Produto 1", 22d, 0));
    ordenacaoProdutos.adicionarProduto(new Produto("Produto 2", 15d, 1));
    ordenacaoProdutos.adicionarProduto(new Produto("Produto 3", 30d, 0));
    ordenacaoProdutos.adicionarProduto(new Produto("Produto 4", 1d, 5));
    System.out.println(ordenacaoProdutos.ordenarPorPreco());
    System.out.println(ordenacaoProdutos.ordenarPorEstoque());
  }
}
