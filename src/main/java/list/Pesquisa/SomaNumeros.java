package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
  //atributos
  private List<Integer> numeros;

  //construtor
  public SomaNumeros() {
    this.numeros = new ArrayList<>();
  }

  public void adicionarNumero(int numero) {
    this.numeros.add(numero);
  }

  public int calcularSoma() {
    int soma = 0;
    for(Integer numero : numeros)
      soma += numero;
    return soma;
  }

  public int encontrarMaiorNumero() {
    int maiorNumero = Integer.MIN_VALUE;
    for(Integer numero : numeros) {
      if(numero >= maiorNumero){
        maiorNumero = numero;
      }
    }
    return maiorNumero;
  }

  public int encontrarMenorNumero() {
    int menorNumero = Integer.MAX_VALUE;
    for(Integer numero : numeros) {
      if(numero <= menorNumero){
        menorNumero = numero;
      }
    }
    return menorNumero;
  }

  public void exibirNumeros() {
    System.out.println(this.numeros);
  }

  public static void main(String[] args) {
    SomaNumeros somaNumeros = new SomaNumeros();
    somaNumeros.adicionarNumero(5);
    somaNumeros.adicionarNumero(0);
    somaNumeros.adicionarNumero(0);
    somaNumeros.adicionarNumero(-2);
    somaNumeros.adicionarNumero(10);
    somaNumeros.exibirNumeros();
    System.out.println("Soma dos números = " + somaNumeros.calcularSoma());
    System.out.println("Maior número = " + somaNumeros.encontrarMaiorNumero());
    System.out.println("Menor número = " + somaNumeros.encontrarMenorNumero());
  }
}
