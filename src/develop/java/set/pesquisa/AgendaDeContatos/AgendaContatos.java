package develop.java.set.pesquisa.AgendaDeContatos;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c: contatoSet){
            if (c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public void atualizarNumeroContato(String nome, int novoNumero){
        for (Contato c : contatoSet){
            if (c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Paulo", 991652625);
//        esse contato não é adicionado por ter o mesmo nome
        agendaContatos.adicionarContato("Paulo",333444);
        agendaContatos.adicionarContato("Paulo Roberto",111555);
        agendaContatos.adicionarContato("Paulo Malandrim",222777);
        agendaContatos.adicionarContato("José Antonio",991652625);

        agendaContatos.exibirContatos();

        System.out.println("Pesquisa por nome Paulo: " + agendaContatos.pesquisarPorNome("Paulo"));

        agendaContatos.atualizarNumeroContato("Paulo", 88664422);

        System.out.println("Pesquisa por nome Paulo: " + agendaContatos.pesquisarPorNome("Paulo"));

    }
}
