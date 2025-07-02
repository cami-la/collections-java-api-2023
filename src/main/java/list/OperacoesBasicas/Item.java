package main.java.list.OperacoesBasicas;

public class Item {
  //atributos
	
	private String name;
	private double price;
  	private int quantity;

  // construtor
  public Item(String name, double price, int quantity) {
	this.name = name;
	this.price = price;
	this.quantity = quantity;
  }

  // getters
  public String getName() {
	return name;
  }

  public double getPrice() {
	return price;
  }

  public int getQuantity() {
	return quantity;
  }

  // toString
  @Override
  public String toString() {
	return "Item{" +
			"nome='" + name + '\'' +
			", preco=" + price +
			", quantidade=" + quantity +
			'}';
  }
}
