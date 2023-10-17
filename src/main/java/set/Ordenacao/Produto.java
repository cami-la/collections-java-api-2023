package main.java.set.Ordenacao;

import java.util.Comparator;

public class Produto implements Comparable<Produto>{
	private long cod;
	private String nome;
	private double preco;
	private int quantidade;

	public Produto(long cod, String nome, double preco, int quantidade) {
		this.cod = cod;
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	//com o simples fato de adicionarmos este compareTo()
	//o código já entende que o Set deve ser comparado pelo nome
	@Override
	public int compareTo(Produto p) {
		return nome.compareToIgnoreCase(p.getNome());
	}

	public void setPreco(double preco){
		this.preco = preco;
	}

	public void setQuantidade(int quantidade){
		this.quantidade = quantidade;
	}

	public long getCod() {
		return cod;
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

	public String toString(){
		return cod + " - " + nome  + " - " + preco  + " - " + quantidade;
	}
}

class ComparatorForPreco implements Comparator<Produto>{
	@Override
	public int compare(Produto p1, Produto p2) {
		return Double.compare(p1.getPreco(), p2.getPreco());
	}
}
