package develop.java.set.OperacoesBasicas.ConjuntoDeConvidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        convidadoSet = new HashSet<>();
    }

    public void adicionaConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        for (Convidado c: convidadoSet){
            if (c.getCodigoConvite() == codigoConvite){
                convidadoSet.remove(c);
                break;
            }
        }
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        conjuntoConvidados.adicionaConvidado("Convidado 1", 1);
        conjuntoConvidados.adicionaConvidado("Convidado 2", 2);
        conjuntoConvidados.adicionaConvidado("Convidado 9", 2);
        conjuntoConvidados.adicionaConvidado("Convidado 2", 3);
        conjuntoConvidados.adicionaConvidado("Convidado 3", 4);
        conjuntoConvidados.adicionaConvidado("Convidado 4", 5);

        System.out.println("Quantidade de convidados: " + conjuntoConvidados.contarConvidados());
        conjuntoConvidados.exibirConvidados();

        conjuntoConvidados.removerConvidadoPorCodigoConvite(2);

        System.out.println("Quantidade de convidados: " + conjuntoConvidados.contarConvidados());


    }
}
