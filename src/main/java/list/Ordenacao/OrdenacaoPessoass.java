package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoass {
	//atributo
	private List<Pessoaa> pessoaList;

	public OrdenacaoPessoass() {
		this.pessoaList = new ArrayList<>();
	}

	public void adicionarPessoas(String nome, int idade, double altura){
		pessoaList.add(new Pessoaa(nome, idade, altura));
	}

	public List<Pessoaa> ordenarPorIdade(){
		List<Pessoaa> pessoaPorIdade = new ArrayList<>(pessoaList);
		Collections.sort(pessoaPorIdade);
		return pessoaPorIdade;
	}

	public List<Pessoaa> ordenarPorAltura(){
		List<Pessoaa> pessoaPorAltura = new ArrayList<>(pessoaList);
		Collections.sort(pessoaPorAltura, new ComparatorForAltura());
		return pessoaPorAltura;
	}

	public static void main(String[] args) {
		OrdenacaoPessoass ordenacaopessoass = new OrdenacaoPessoass();

		ordenacaopessoass.adicionarPessoas("Matheus Marcos", 25, 1.80);
		ordenacaopessoass.adicionarPessoas("Joziara Alves", 24, 1.65);
		ordenacaopessoass.adicionarPessoas("Mayza Isle", 19, 1.55);
		ordenacaopessoass.adicionarPessoas("Rony Silva", 20, 1.75);
		ordenacaopessoass.adicionarPessoas("Maria Telma", 51, 1.50);

		System.out.println(ordenacaopessoass.ordenarPorIdade());
		System.out.println(ordenacaopessoass.ordenarPorAltura());

	}

}
