package main.java.list.Pesquisa;

public class Livro {
    //Atributos
    private String titulo;
    private String autor;
    private int anoPublicacao;


    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }


    public String getTitulo() {
        return titulo;
    }


    public String getAutor() {
        return autor;
    }


    public int getAnoPublicacao() {
        return anoPublicacao;
    }


    @Override
    public String toString() {
        return "Livro {\n" +
               "  titulo: " + titulo + ",\n" +
               "  autor: " + autor + ",\n" +
               "  anoPublicacao: " + anoPublicacao + "\n" +
               "}";

    }
    
}
