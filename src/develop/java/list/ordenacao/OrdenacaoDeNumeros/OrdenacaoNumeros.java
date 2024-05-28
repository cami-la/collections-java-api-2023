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

    public void adicionaNumero(int numero){
        integerList.add(numero);
    }

    public List<Integer> ordenarAscendenteComparable(){
        List<Integer> numerosAscendente = new ArrayList<>(integerList);
        Collections.sort(numerosAscendente);
        return numerosAscendente;
    }

    public List<Integer> ordenarDescendenteComparable(){
        List<Integer> numerosDescendente = new ArrayList<>(integerList);
        Collections.reverseOrder();

        return numerosDescendente;
    }



    public List<Integer> ordenarAscendenteComparator(){
        List<Integer> numerosAscendente = new ArrayList<>(integerList);
        Collections.sort(numerosAscendente,new NumeroComparatorAscendente());
        return numerosAscendente;
    }


}

class NumeroComparatorAscendente implements Comparator<Integer>{
    @Override
    public int compare(Integer i1, Integer i2) {
        return Integer.compare(i1,i2);
    }
}
