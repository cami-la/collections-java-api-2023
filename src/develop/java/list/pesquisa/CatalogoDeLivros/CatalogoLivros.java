package develop.java.list.pesquisa.CatalogoDeLivros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosDoAutor = new ArrayList<>();

        if (!livroList.isEmpty()){
            for (Livro livro: livroList){
                if (livro.getAutor().equalsIgnoreCase(autor)){
                    livrosDoAutor.add(livro);
                }
            }
        }

        return livrosDoAutor;
    }
    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosIntervalo = new ArrayList<>();

        if (!livroList.isEmpty()){
            for (Livro livro: livroList){
                if (livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal){
                    livrosIntervalo.add(livro);
                }
            }
        }

        return livrosIntervalo;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        for (Livro livro: livroList){
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Livro 1","Autor 1", 2020);
        catalogoLivros.adicionarLivro("Livro 1","Autor 2", 2021);
        catalogoLivros.adicionarLivro("Livro 2","Autor 2", 2022);
        catalogoLivros.adicionarLivro("Livro 3","Autor 3", 2023);
        catalogoLivros.adicionarLivro("Livro 4","Autor 4", 1994);
        catalogoLivros.adicionarLivro("Livro 5","Autor 5", 1993);

//        Pesquisa livro por autor
        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 2"));

//        Pesquisar por intervalo de anos
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(1990, 2022));

//        Pesquisar por titulo
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1"));


    }
}
