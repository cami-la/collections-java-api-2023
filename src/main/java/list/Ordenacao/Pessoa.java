package main.java.list.Ordenacao;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa> {
  //atributos
  private final String nome;
  private final int idade;
  private final double altura;

  public Pessoa(String nome, int idade, double altura) {
    this.nome = nome;
    this.idade = idade;
    this.altura = altura;
  }

  @Override
  public int compareTo(Pessoa p) {
    return Integer.compare(this.idade, p.idade());
  }

  public String nome() {
    return nome;
  }

  public int idade() {
    return idade;
  }

  public double altura() {
    return altura;
  }

  @Override
  public String toString() {
    return "Pessoa{" +
        "nome='" + nome + '\'' +
        ", idade=" + idade +
        ", altura=" + altura +
        '}';
  }

  // Java 25 Fluent Comparator syntax
  public static Comparator<Pessoa> porAltura() {
    return Comparator.comparingDouble(Pessoa::altura);
  }
}
