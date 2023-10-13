package main.java.list.Ordenacao;

import java.util.Comparator;

public class Pessoaa implements Comparable<Pessoaa>{

	//por padrão o compareTo usa um "o" após o objeto, mas como estamos nos referindo à Pessoaa, coloquei um p #didática
	@Override
	public int compareTo(Pessoaa p) {
		return Integer.compare(idade, p.getIdade());
	}

	private String nome;
	private int idade;
	private double altura;

	public Pessoaa(String nome, int idade, double altura) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public double getAltura() {
		return altura;
	}

	@Override
	public String toString() {
		return "Nome = " + nome + '\'' +
				", idade = " + idade +
				", altura = " + altura;
	}

}

class ComparatorForAltura implements Comparator<Pessoaa>{

	@Override
	public int compare(Pessoaa p1, Pessoaa p2) {
		return Double.compare(p1.getAltura(), p2.getAltura());
	}
}
