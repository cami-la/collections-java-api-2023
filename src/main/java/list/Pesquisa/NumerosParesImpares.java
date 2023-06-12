package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class NumerosParesImpares {
  //atributos
  private List<Integer> numeros;

  //construtor
  public NumerosParesImpares() {
    this.numeros = new ArrayList<>();
  }

  public void adicionarNumero(int numero) {
    this.numeros.add(numero);
  }

  public List<List<Integer>> separarParesEImpares() {
    List<Integer> pares = new ArrayList<>();
    List<Integer> impares = new ArrayList<>();
    for (Integer numero : numeros) {
      if (numero % 2 == 0) {
        pares.add(numero);
      } else {
        impares.add(numero);
      }
    }
    return new ArrayList<>() {{
      add(pares);
      add(impares);
    }};
  }

  public static void main(String[] args) {
    NumerosParesImpares numerosParesImpares = new NumerosParesImpares();
    numerosParesImpares.adicionarNumero(2);
    numerosParesImpares.adicionarNumero(1);
    numerosParesImpares.adicionarNumero(1);
    numerosParesImpares.adicionarNumero(100);
    numerosParesImpares.adicionarNumero(75);
    numerosParesImpares.adicionarNumero(80);
    System.out.println(numerosParesImpares.separarParesEImpares());
  }
}