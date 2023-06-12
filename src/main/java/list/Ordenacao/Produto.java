package main.java.list.Ordenacao;

import java.util.Comparator;

public class Produto implements Comparable<Produto> {
  //atributos
  private String nome;
  private double preco;
  private int qnt;

  //construtor
  public Produto(String nome, double preco, int qnt) {
    this.nome = nome;
    this.preco = preco;
    this.qnt = qnt;
  }

  public String getNome() {
    return nome;
  }

  public double getPreco() {
    return preco;
  }

  public int getQnt() {
    return qnt;
  }

  @Override
  public int compareTo(Produto produto) {
    return Double.compare(this.getPreco(), produto.getPreco());
  }

  @Override
  public String toString() {
    return "Produto{" +
        "nome='" + nome + '\'' +
        ", preco=" + preco +
        ", qnt=" + qnt +
        '}';
  }
}

class ComparatorEstoque implements Comparator<Produto> {
  @Override
  public int compare(Produto p1, Produto p2) {
    return Integer.compare(p1.getQnt(), p2.getQnt());
  }
}