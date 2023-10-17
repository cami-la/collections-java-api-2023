package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
	private Set<Contato> contatosSet;

	public AgendaContatos() {
		this.contatosSet = new HashSet<>();
	}

	//é essencial lembrar que no add estou instanciando um novo objeto
	//e nesse caso como parametro do add informo o new _OBJECT_(p1, p2,...)
	public void adicionarContatos(String nome, int numeroTelefone){
		contatosSet.add(new Contato(nome, numeroTelefone));
	}

	public void exibirContatos(){
		System.out.println(contatosSet);
	}

	public Set<Contato> pesquisarPorNome(String nome){
		Set<Contato> contatosPorNome = new HashSet<>();
		if(!contatosSet.isEmpty()){
			for(Contato c: contatosSet){
				//esse metodo startsWith retorna o q começacom()
				if(c.getNome().startsWith(nome)){
					contatosPorNome.add(c);
				}
			}
		}
		return contatosPorNome;
	}

	public Contato atualizarContato(String nome, int novoNumero){
		Contato contatoAtualizado = null;
		for(Contato c:contatosSet){
			if (c.getNome().equalsIgnoreCase(nome)){
				c.setNumeroTelefone(novoNumero);
				contatoAtualizado = c;
				break;
			}
		}
		return contatoAtualizado;
	}
}
