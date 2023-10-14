package main.java.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
	private Set<Produto> produtosSet;

	public CadastroProdutos() {
		this.produtosSet = new HashSet<>();
	}

	public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
		produtosSet.add(new Produto(cod, nome, preco, quantidade));
	}

	//Como meu set está ordenado por nome, graças ao CompareTo()
	//Uso o TreeSet que aceita o Set Ordenado produtosSet
	public Set<Produto> exibirProdutosPorNome(){
		Set<Produto> produtosPorNome = new TreeSet<>(produtosSet);
		return produtosPorNome;
	}

	public Set<Produto> exibirProdutosPorPreco(){
		Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorForPreco());
		produtosPorPreco.addAll(produtosSet);
		return produtosPorPreco;
	}
}
