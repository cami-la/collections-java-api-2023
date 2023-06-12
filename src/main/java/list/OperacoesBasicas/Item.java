package main.java.list.OperacoesBasicas;

public class Item {
  //atributos
	private String nome;
	private double preco;
	private int quant;

	public Item(String nome, double preco, int quant) {
		this.nome = nome;
		this.preco = preco;
		this.quant = quant;
	}

	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}

	public int getQuant() {
		return quant;
	}

	@Override
	public String toString() {
		return "Item{" +
				"nome='" + nome + '\'' +
				", preco=" + preco +
				", quant=" + quant +
				'}';
	}
}
