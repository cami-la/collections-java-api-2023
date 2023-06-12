package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
  //atributos
  private List<Integer> numeros;

  //construtor
  public OrdenacaoNumeros() {
    this.numeros = new ArrayList<>();
  }

  public void adicionarNumero(int numero) {
    this.numeros.add(numero);
  }

  public List<Integer> ordenarAscendente() {
    List<Integer> numerosAscendente = new ArrayList<>(this.numeros);
    Collections.sort(numerosAscendente);
    return numerosAscendente;
  }

  public List<Integer> ordenarDescendente() {
    List<Integer> numerosAscendente = new ArrayList<>(this.numeros);
    numerosAscendente.sort(Collections.reverseOrder());
    return numerosAscendente;
  }

  public void exibirNumeros() {
    System.out.println(this.numeros);
  }

  public static void main(String[] args) {
    OrdenacaoNumeros numeros = new OrdenacaoNumeros();
    numeros.adicionarNumero(2);
    numeros.adicionarNumero(5);
    numeros.adicionarNumero(4);
    numeros.adicionarNumero(1);
    numeros.adicionarNumero(99);
    numeros.exibirNumeros();
    System.out.println(numeros.ordenarAscendente());
    numeros.exibirNumeros();
    System.out.println(numeros.ordenarDescendente());
    numeros.exibirNumeros();
  }
}
