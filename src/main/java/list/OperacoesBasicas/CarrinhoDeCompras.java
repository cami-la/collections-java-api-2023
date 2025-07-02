package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
  //atributos
  private List<Item> itens;

  public CarrinhoDeCompras() {
    this.itens = new ArrayList<>();
  }

  // métodos
  public void addItem(String name, double price, int quantity) {
    itens.add(new Item(name, price, quantity));
  }

  // não se usa .remove() porque não é possível remover um item específico de uma lista de objetos com for
  public void removeItem(String name){
    List<Item> itensToRemove = new ArrayList<>();
    if (!itens.isEmpty()){
    for (Item i : itens) { // percorre a lista de itens
      if (i.getName().equalsIgnoreCase(name)) {
        itensToRemove.add(i); // adiona o item à lista de itens a serem removidos
      }
    }
    itens.removeAll(itensToRemove); 
  }
  else {
    System.out.println("Carrinho vazio, não é possível remover itens.");
  }
  }

  public double getTotalPrice() {
    double total = 0.0;
    if (!itens.isEmpty()){
    for (Item i : itens) {
      total += i.getPrice() * i.getQuantity(); 
    }
    return total;
  }
    else {
      System.out.println("Carrinho vazio, não é possível calcular o total.");
      return total;
    }
  }
  public void getItemDescriptions() {
    System.out.println(itens);
  }

  public static void main(String[] args) {
    CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
    System.out.printf("Total do carrinho R$: %.2f%n ", carrinho.getTotalPrice());
    carrinho.getItemDescriptions();
    carrinho.removeItem("Arroz");
    System.out.println("");

    carrinho.addItem("Arroz", 5.99, 2);
    carrinho.addItem("Feijão", 4.49, 1);
    carrinho.addItem("Macarrão", 3.29, 3);
    System.out.printf("Total do carrinho R$: %.2f%n", carrinho.getTotalPrice());
    carrinho.getItemDescriptions();
    System.out.println("");

    carrinho.removeItem("Feijão");
    System.out.printf("Total do carrinho R$: %.2f%n", carrinho.getTotalPrice());
    carrinho.getItemDescriptions();
    
  }
}