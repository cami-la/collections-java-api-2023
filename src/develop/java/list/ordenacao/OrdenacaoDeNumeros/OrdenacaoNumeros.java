package develop.java.list.ordenacao.OrdenacaoDeNumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoNumeros {

    private List<Integer> integerList;

    public OrdenacaoNumeros() {
        this.integerList = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        integerList.add(numero);
    }

    public void exibirNumeros(){
        System.out.println(integerList);
    }


    public List<Integer> ordenarAscendenteComparable(){
        List<Integer> numerosAscendente = new ArrayList<>(integerList);
        Collections.sort(numerosAscendente);
        return numerosAscendente;
    }

    public List<Integer> ordenarDescendenteComparable(){
        List<Integer> numerosDescendente = new ArrayList<>(integerList);
        numerosDescendente.sort(Collections.reverseOrder());
        return numerosDescendente;
    }

    public List<Integer> ordenarAscendenteComparator(){
        List<Integer> numerosAscendente = new ArrayList<>(integerList);
        Collections.sort(numerosAscendente,new NumeroComparatorAscendente());
        return numerosAscendente;
    }

    public List<Integer> ordenarDescendenteComparator(){
        List<Integer> numerosDescendente = new ArrayList<>(integerList);
        Collections.sort(numerosDescendente,new NumeroComparatorDescendente());
        return numerosDescendente;
    }

    public static void main(String[] args) {
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();

        // Adicionando números à lista
        numeros.adicionarNumero(2);
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(4);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(99);

        // Exibindo a lista de números adicionados
        numeros.exibirNumeros();

        // Ordenando e exibindo em ordem ascendente
        System.out.println("Ascendente Comparable: " + numeros.ordenarAscendenteComparable());
        System.out.println("Ascendente Comparator: " + numeros.ordenarAscendenteComparator());

        // Exibindo a lista
        numeros.exibirNumeros();

        // Ordenando e exibindo em ordem descendente
        System.out.println("Descendente Comparable: " + numeros.ordenarDescendenteComparator());
        System.out.println("Descendente Comparator: " + numeros.ordenarDescendenteComparator());

        // Exibindo a lista
        numeros.exibirNumeros();
    }

}

class NumeroComparatorAscendente implements Comparator<Integer>{
    @Override
    public int compare(Integer i1, Integer i2) {
        return Integer.compare(i1,i2);
    }
}
class NumeroComparatorDescendente implements Comparator<Integer>{
    @Override
    public int compare(Integer i1, Integer i2) {
        return Integer.compare(i2,i1);
    }
}
