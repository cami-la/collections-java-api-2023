package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CarrinhoDeCompras {
	//atributos
	private List<Item> itens;

	public CarrinhoDeCompras() {
		this.itens = new ArrayList<>();
	}

	public void adicionarItem(String nome, double preco, int quantidade) {
		Item item = new Item(nome, preco, quantidade);
		this.itens.add(item);
	}

	public void removerItem(String nome) {
		Iterator<Item> iterator = itens.iterator();
		while (iterator.hasNext()) {
			Item next = iterator.next();
			if(next.getNome().equalsIgnoreCase(nome))
				iterator.remove();
		}
	}

	public double calcularValorTotal() {
		double valorTotal = 0d;
		for(Item item : itens) {
			double valorItem = item.getPreco() * item.getQuant();
			valorTotal += valorItem; //valorTotal = valorTotal + valorItem;
		}
		return valorTotal;
	}

	public void exibirItens() {
		System.out.println(this.itens);
	}

	@Override
	public String toString() {
		return "CarrinhoDeCompras{" +
				"itens=" + itens +
				'}';
	}

	public static void main(String[] args) {
		CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
		carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
		carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
		carrinhoDeCompras.adicionarItem("Caderno", 35d, 1);
		carrinhoDeCompras.adicionarItem("Borracha", 2d, 2);
		carrinhoDeCompras.exibirItens();
		carrinhoDeCompras.removerItem("caderno");
		carrinhoDeCompras.exibirItens();
		System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal());
	}
}
