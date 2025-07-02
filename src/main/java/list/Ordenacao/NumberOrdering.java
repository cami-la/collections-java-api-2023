package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


// Não é necessário implementar Comparable na classe pois Integer já é Comparable.
public class NumberOrdering {



private List<Integer> numbers;

// Construtor
public NumberOrdering() {
    this.numbers = new ArrayList<>();

}

//Métodos
public void addNumber (int number){
    numbers.add(number);

}

//Ordem ascendente
public List<Integer> orderSort() {
    List<Integer> naturalOrder = new ArrayList<>(this.numbers); // novo array para que a lsita original não seja modificada
    if (numbers.isEmpty()) {
        throw new IllegalStateException("A lista está vazia.");
    }
    
    Collections.sort(naturalOrder);
    return naturalOrder;
}

//Ordem descrescente
public List<Integer> reverseOrder (){
    List<Integer> reverseNumList = new ArrayList<>(this.numbers); // novo array para que a lsita original não seja modificada
    if (numbers.isEmpty()) {
        throw new IllegalStateException("A lista está vazia.");
    }
    Collections.sort(reverseNumList, Collections.reverseOrder());
    return reverseNumList;

}

public List<Integer> printNumbers(){
        return numbers;
    }

public static void main(String[] args) {

    NumberOrdering n = new NumberOrdering();
        //lista vazia
        System.out.println("Lista " + n.numbers);
        System.out.println("----------");

        n.addNumber(8);
        n.addNumber(10);
        n.addNumber(15);
        n.addNumber(-2);
        System.out.println("Lista " + n.numbers);
        System.out.println("----------");

        //Ordem ascendente
        System.out.println("Ordem ascendente " + n.orderSort());
        System.out.println("----------");

        //Ordem descendente
        System.out.println("Ordem descendente " + n.reverseOrder());
        System.out.println("----------");
    
}



}
