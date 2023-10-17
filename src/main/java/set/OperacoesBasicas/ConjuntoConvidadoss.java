package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidadoss {
	private Set<Convidados> convidadosSet;

	public ConjuntoConvidadoss() {
		this.convidadosSet = new HashSet<>();
	}

	public void adicionarConvidados(String nome, int codeConvit){
		convidadosSet.add(new Convidados(nome, codeConvit));
	}

	public void removerConvidados(int codeConvit){
		Convidados convidadosParaRemover = null;
		for(Convidados c: convidadosSet){
			if(c.getCodeConvit() == codeConvit){
				convidadosParaRemover = c;
				break;
			}
		}
		convidadosSet.remove(convidadosParaRemover);
	}

	public int contarConvidados(){
		return convidadosSet.size();
	}

	public void exibirConvidados(){
		System.out.println(convidadosSet);
	}

	public static void main(String[] args) {
		ConjuntoConvidadoss conjuntoConvidados = new ConjuntoConvidadoss();

		System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados para a sua festa!");
		conjuntoConvidados.adicionarConvidados("Matheus Marcos", 1998);
		conjuntoConvidados.adicionarConvidados("Joziara Alves", 1999);
		conjuntoConvidados.adicionarConvidados("Mayza Isle", 2004);
		conjuntoConvidados.adicionarConvidados("Rony Silva", 2004);
		conjuntoConvidados.adicionarConvidados("Maria Telma", 1971);
		conjuntoConvidados.adicionarConvidados("Samuel Alves", 2016);
		conjuntoConvidados.exibirConvidados();
//		System.out.println("Agora existem " + conjuntoConvidados.contarConvidados() + " convidados para a sua festa!");
//		conjuntoConvidados.removerConvidados(2004);
//		conjuntoConvidados.removerConvidados(2003);
//		System.out.println("Agora existem " + conjuntoConvidados.contarConvidados() + " convidados para a sua festa!");
//		conjuntoConvidados.exibirConvidados();
	}
}
