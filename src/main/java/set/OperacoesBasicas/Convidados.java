package main.java.set.OperacoesBasicas;

import java.util.Objects;

public class Convidados {
	private String nome;
	private int codeConvit;

	public Convidados(String nome, int codeConvit) {
		this.nome = nome;
		this.codeConvit = codeConvit;
	}

	public String getNome() {
		return nome;
	}

	public int getCodeConvit() {
		return codeConvit;
	}

	//este método ira comparar os codeConvites para avaliar se algum conflita
	//haja vista que essa será a Primary Key deste Objeto
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Convidados that))
			return false;
		return getCodeConvit() == that.getCodeConvit();
	}

	@Override
	public int hashCode() {
		return Objects.hash(getCodeConvit());
	}

	@Override
	public String toString() {
		return "Convidados{" +
				"nome='" + nome + '\'' +
				", codeConvit=" + codeConvit +
				'}';
	}
}
