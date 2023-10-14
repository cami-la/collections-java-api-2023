package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
	//atributo
	private Map<String, Integer> agendaContatosMap;

	//construtor
	public AgendaContatos() {
		this.agendaContatosMap = new HashMap<>();
	}

	//método adicionarContato
	//o método put() serve tanto para adicionar quanto para atualizar
	// um elemento, no caso o último objeto passado com
	//determinada chave é quam irá persistir
	public void adicionarContato(String nome, Integer contato){
		agendaContatosMap.put(nome, contato);
	}

	//	método removerContato
	public void removerContato(String nome){
		if(!agendaContatosMap.isEmpty()){
			agendaContatosMap.remove(nome);
		}
	}

	//	método exibirContato
	public void exibirContato() {
		if(!agendaContatosMap.isEmpty()) {
			System.out.println(agendaContatosMap);
		}
	}

	//	método PesquisarPorNome
	public Integer pesquisaPorNome(String nome){
		Integer contatoPorNome = null;
		if (!agendaContatosMap.isEmpty()){
			contatoPorNome = agendaContatosMap.get(nome);
		}
		return contatoPorNome;
	}

	public static void main(String[] args) {
		GabaritoAgendaContatos gabaritoAgendaContatos = new GabaritoAgendaContatos();

		// Adicionar contatos
		gabaritoAgendaContatos.adicionarContato("Camila", 123456);
		gabaritoAgendaContatos.adicionarContato("João", 5665);
		gabaritoAgendaContatos.adicionarContato("Carlos", 1111111);
		gabaritoAgendaContatos.adicionarContato("Ana", 654987);
		gabaritoAgendaContatos.adicionarContato("Maria", 1111111);
		gabaritoAgendaContatos.adicionarContato("Camila", 44444);

		gabaritoAgendaContatos.exibirContatos();

		// Remover um contato
		gabaritoAgendaContatos.removerContato("Maria");
		gabaritoAgendaContatos.exibirContatos();

		// Pesquisar número por nome
		String nomePesquisa = "João";
		Integer numeroPesquisa = gabaritoAgendaContatos.pesquisarPorNome(nomePesquisa);
		System.out.println("Número de telefone de " + nomePesquisa + ": " + numeroPesquisa);

		String nomePesquisaNaoExistente = "Paula";
		Integer numeroPesquisaNaoExistente = gabaritoAgendaContatos.pesquisarPorNome(nomePesquisaNaoExistente);
		System.out.println("Número de telefone de " + nomePesquisaNaoExistente + ": " + numeroPesquisaNaoExistente);
	}

}
