package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SumNumbers {

    private List<Integer> numbers;

    public SumNumbers() {
        this.numbers = new ArrayList<>();
    }
    

    // métodos
    public void addNumber(int number) {
        numbers.add(number);
    }

    public  int sumNumbers (){
        int sum = 0; 
        for (Integer num : numbers){
            sum += num;
        }

        return sum; // 
        }

    
public int findBigNumber() {
    if (numbers.isEmpty()) {
        throw new IllegalStateException("A lista está vazia.");
    }
    return Collections.max(numbers);
}


    public int findSmallNumber (){
        if (numbers.isEmpty()) {
        throw new IllegalStateException("A lista está vazia.");
    }
    return Collections.min(numbers);
}
        

    public List<Integer> printNumbers(){
        return  numbers;
    }

    public static void main(String[] args) {
        
        SumNumbers n = new SumNumbers();
        //lista vazia
        System.out.println("Lista " + n.numbers);
        System.out.println("----------");

        n.addNumber(5);
        n.addNumber(10);
        n.addNumber(15);
        n.addNumber(-2);
        System.out.println("Lista " + n.numbers);

        System.out.println("----------");
        System.out.println("Soma = " + n.sumNumbers());
        System.out.println("----------");
        
        System.out.println("Maior número: " + n.findBigNumber());
        System.out.println("Menor número: " + n.findSmallNumber());
        System.out.println("----------");
    }
    }



    
    


