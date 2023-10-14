package main.java.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos1 {
  //atributo
  private Set<Produto1> produto1Set;

  public CadastroProdutos1() {
    this.produto1Set = new HashSet<>();
  }

  public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
    produto1Set.add(new Produto1(cod, nome, preco, quantidade));
  }

  public Set<Produto1> exibirProdutosPorNome() {
    Set<Produto1> produtosPorNome = new TreeSet<>(produto1Set);
    if (!produto1Set.isEmpty()) {
      return produtosPorNome;
    } else {
      throw new RuntimeException("O conjunto está vazio!");
    }
  }

  public Set<Produto1> exibirProdutosPorPreco() {
    Set<Produto1> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco1());
    if (!produto1Set.isEmpty()) {
      produtosPorPreco.addAll(produto1Set);
      return produtosPorPreco;
    } else {
      throw new RuntimeException("O conjunto está vazio!");
    }
  }

  public static void main(String[] args) {
    // Criando uma instância do CadastroProdutos1
    CadastroProdutos1 cadastroProdutos1 = new CadastroProdutos1();

    // Adicionando produtos ao cadastro
    cadastroProdutos1.adicionarProduto(1L, "Smartphone", 1000d, 10);
    cadastroProdutos1.adicionarProduto(2L, "Notebook", 1500d, 5);
    cadastroProdutos1.adicionarProduto(1L, "Mouse", 30d, 20);
    cadastroProdutos1.adicionarProduto(4L, "Teclado", 50d, 15);

    // Exibindo todos os produtos no cadastro
    System.out.println(cadastroProdutos1.produto1Set);

    // Exibindo produtos ordenados por nome
    System.out.println(cadastroProdutos1.exibirProdutosPorNome());

    // Exibindo produtos ordenados por preço
    System.out.println(cadastroProdutos1.exibirProdutosPorPreco());
  }
}
