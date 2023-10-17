package main.java.set.Ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Produto1 implements Comparable<Produto1> {
  //atributos
  private long codigo;
  private String nome;
  private double preco;
  private int quantidade;

  public Produto1(long codigo, String nome, double preco, int quantidade) {
    this.codigo = codigo;
    this.nome = nome;
    this.preco = preco;
    this.quantidade = quantidade;
  }

  @Override
  public int compareTo(Produto1 p) {
    return nome.compareToIgnoreCase(p.getNome());
  }

  public long getCodigo() {
    return codigo;
  }

  public String getNome() {
    return nome;
  }

  public double getPreco() {
    return preco;
  }

  public int getQuantidade() {
    return quantidade;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Produto1 produto1)) return false;
    return getCodigo() == produto1.getCodigo();
  }

  @Override
  public int hashCode() {
    return Objects.hash(getCodigo());
  }

  @Override
  public String toString() {
    return "Produto1{" +
        "codigo=" + codigo +
        ", nome='" + nome + '\'' +
        ", preco=" + preco +
        ", quantidade=" + quantidade +
        '}';
  }
}

class ComparatorPorPreco1 implements Comparator<Produto1> {
  @Override
  public int compare(Produto1 p1, Produto1 p2) {
    return Double.compare(p1.getPreco(), p2.getPreco());
  }
}








