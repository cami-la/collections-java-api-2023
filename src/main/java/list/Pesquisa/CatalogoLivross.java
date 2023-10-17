package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivross {
	//atributo array
	private List<Livroo> livroList;

	//construtor
	public CatalogoLivross() {
		this.livroList = new ArrayList<>();
	}
	//metodo para adicionar livros ao catalogo
	public void adicionarLivro(String titulo,
	                           String autor,
	                           int anoPublicacao){
		livroList.add(new Livroo(titulo, autor,
				anoPublicacao));
	}

	//metodo para pesquisar livro por autor
	public List<Livroo> pesquisaPorAutor(String autor){
		List<Livroo> livrosPorAutor =
				new ArrayList<>();
		if(!livroList.isEmpty()) {
			for (Livroo l : livroList) {
				if (l.getAutor().equalsIgnoreCase(autor)) {
					livrosPorAutor.add(l);
				}
			}
		}
		return livrosPorAutor;
	}
	//metodo para pesquisar livro por intervalo
	// de ano de publicação
	public List<Livroo> pesquisaPorIntervaloAnos (int anoInicio, int anoFim){
		List<Livroo> livrosPorIntervaloAnos = new ArrayList<>();
		if(!livroList.isEmpty()){
			for(Livroo l: livroList){
				if(l.getAnoPublicacao() >= anoInicio && l.getAnoPublicacao() <= anoFim){
					livrosPorIntervaloAnos.add(l);
				}
			}
		}
		return livrosPorIntervaloAnos;
	}
	//metodo para pesquisar e retornar o
	// primeiro livro encontrado por titulo
	public Livroo pesquisaPorTitulo(String titulo){
		Livroo livrosPorTitulo = null;
		if (!livroList.isEmpty()){
			for(Livroo l: livroList){
				if(l.getTitulo().equalsIgnoreCase(titulo)){
					livrosPorTitulo = l;
					break;
				}
			}
		}
		return livrosPorTitulo;
	}

	//metodo main, onde a mágica acontece
	public static void main(String[] args) {
		CatalogoLivross catalogoLivross =
				new CatalogoLivross();

		catalogoLivross.adicionarLivro("Livro 1", "Autor 1", 2020);
		catalogoLivross.adicionarLivro("Livro 1", "Autor 2", 2021);
		catalogoLivross.adicionarLivro("Livro 2", "Autor 2", 2022);
		catalogoLivross.adicionarLivro("Livro 3", "Autor 3", 2023);
		catalogoLivross.adicionarLivro("Livro 4", "Autor 4", 1994);

		System.out.println(catalogoLivross.pesquisaPorAutor("Autor 1"));
		System.out.println(catalogoLivross.pesquisaPorIntervaloAnos(2001, 2022));
		System.out.println(catalogoLivross.pesquisaPorTitulo("Livro 2"));
	}
}