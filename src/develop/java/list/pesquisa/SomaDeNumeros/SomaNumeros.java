package develop.java.list.pesquisa.SomaDeNumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    private List<Integer> integerList;

    public SomaNumeros() {
        this.integerList = new ArrayList<>();
    }

    public void adicionaNumero(int numero){
        integerList.add(numero);
    }

    public int calcularSoma(){
        int soma = 0;
        for (Integer i : integerList){
            soma += i;
        }
        return soma;
    }

    public int encontrarMaiorNumero(){
        int maiorValor = Integer.MIN_VALUE;
        for (Integer i : integerList){
            if (i > maiorValor){
                maiorValor = i;
            }
        }
        return maiorValor;
    }

    public int encontrarMenorNumero(){
        int menorValor = Integer.MAX_VALUE;
        for (Integer i : integerList){
            if (i < menorValor){
                menorValor = i;
            }
        }
        return menorValor;
    }

    public void exibirNumeros(){
        System.out.println(integerList);
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();
        somaNumeros.adicionaNumero(1);
        somaNumeros.adicionaNumero(2);
        somaNumeros.adicionaNumero(3);
        somaNumeros.adicionaNumero(4);
        somaNumeros.adicionaNumero(5);

        System.out.println("Soma de todos números: " + somaNumeros.calcularSoma());
        System.out.println("Maior número: " + somaNumeros.encontrarMaiorNumero());
        System.out.println("Menor número: " + somaNumeros.encontrarMenorNumero());
        somaNumeros.exibirNumeros();

    }

}
