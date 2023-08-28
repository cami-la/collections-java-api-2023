package main.java.map.Ordenacao;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;

public class Livro implements Comparable<Livro> {
  private String titulo;
  private String autor;
  private double preco;

  public Livro(String titulo, String autor, double preco) {
    this.titulo = titulo;
    this.autor = autor;
    this.preco = preco;
  }

  public String getTitulo() {
    return titulo;
  }

  public String getAutor() {
    return autor;
  }

  public double getPreco() {
    return preco;
  }

  @Override
  public int compareTo(Livro l) {
    return Double.compare(preco, l.getPreco());
  }

  @Override
  public String toString() {
    return "Livro{" +
        "titulo='" + titulo + '\'' +
        ", autor='" + autor + '\'' +
        ", preco=" + preco +
        '}';
  }
}

class ComparatorPorAutor implements Comparator<Map.Entry<String, Livro>> {
  @Override
  public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
    return l1.getValue().getAutor().compareToIgnoreCase(l2.getValue().getAutor());
  }
}