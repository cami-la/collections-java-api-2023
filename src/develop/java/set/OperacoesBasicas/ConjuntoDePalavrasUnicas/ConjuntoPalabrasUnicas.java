package develop.java.set.OperacoesBasicas.ConjuntoDePalavrasUnicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalabrasUnicas {

    private Set<String> conjuntoPalavras;

    public ConjuntoPalabrasUnicas() {
        this.conjuntoPalavras = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        conjuntoPalavras.add(palavra);
    }

    public void removerPalavra(String palavra){
        conjuntoPalavras.remove(palavra);
    }

    public boolean verificarPalavra(String palavra){
       for (String s : conjuntoPalavras){
           if (s.equalsIgnoreCase(palavra)){
               return true;
           }
       }
       return false;
    }

    public void exibirPalavrasUnicas(){
        System.out.println(conjuntoPalavras);
    }


    public static void main(String[] args) {
        ConjuntoPalabrasUnicas conjuntoPalabrasUnicas = new ConjuntoPalabrasUnicas();

        conjuntoPalabrasUnicas.adicionarPalavra("Palavra 1");
        conjuntoPalabrasUnicas.adicionarPalavra("Palavra 2");
        conjuntoPalabrasUnicas.adicionarPalavra("Palavra 3");
        conjuntoPalabrasUnicas.adicionarPalavra("Palavra 4");
        conjuntoPalabrasUnicas.adicionarPalavra("Palavra 5");

        conjuntoPalabrasUnicas.exibirPalavrasUnicas();

        conjuntoPalabrasUnicas.removerPalavra("Palavra 3");

        conjuntoPalabrasUnicas.exibirPalavrasUnicas();

        System.out.println("Contem Palavra 2? " +
                conjuntoPalabrasUnicas
                        .verificarPalavra("Palavra 3"));
    }
}
