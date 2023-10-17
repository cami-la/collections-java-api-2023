package main.java.list.Pesquisa;

public class Livroo {
	//atributos
	private String titulo;
	private String autor;
	private int anoPublicacao;

	public Livroo(String titulo, String autor, int anoPublicacao) {
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
		return "Livroo{" +
				"titulo='" + titulo + '\'' +
				", autor='" + autor + '\'' +
				", anoPublicacao=" + anoPublicacao +
				'}';
	}
}
