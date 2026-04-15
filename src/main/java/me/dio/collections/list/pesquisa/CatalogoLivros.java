package me.dio.collections.list.pesquisa;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Catálogo de livros moderno usando Java 25.
 */
public class CatalogoLivros {
    private final List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    /**
     * Pesquisa livros por autor usando Streams y filtragem declarativa.
     */
    public List<Livro> pesquisarPorAutor(String autor) {
        if (this.livroList.isEmpty()) throw new IllegalStateException("O catálogo está vazio!");

        return this.livroList.stream()
                .filter(l -> l.autor().equalsIgnoreCase(autor))
                .collect(Collectors.toUnmodifiableList());
    }

    /**
     * Pesquisa livros por intervalo de anos com streams.
     */
    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        if (this.livroList.isEmpty()) throw new IllegalStateException("O catálogo está vazio!");

        return this.livroList.stream()
                .filter(l -> l.anoPublicacao() >= anoInicial && l.anoPublicacao() <= anoFinal)
                .collect(Collectors.toUnmodifiableList());
    }

    /**
     * Pesquisa livro por título y retorna o primeiro encontrado usando Optional.
     */
    public Optional<Livro> pesquisarPorTitulo(String titulo) {
        return this.livroList.stream()
                .filter(l -> l.titulo().equalsIgnoreCase(titulo))
                .findFirst();
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Microsserviços Prontos Para a Produção", "Susan J. Fowler", 2017);
        catalogoLivros.adicionarLivro("Java Guia do Programador", "Peter Jandl Junior", 2021);
        catalogoLivros.adicionarLivro("Código Limpo", "Robert C. Martin", 2009);

        System.out.println("Livros de Robert C. Martin: " + catalogoLivros.pesquisarPorAutor("Robert C. Martin"));
    }
}
