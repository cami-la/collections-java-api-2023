package main.java.map.Pesquisa;

public class Product {
    // Cada produto possui atributos como nome, cod, preço e quantidade.
    private String name;
    
    private double price;
    private int quantity;
    
    // Construtor
    public Product(String name, double price, int quantity) {
        this.name = name;
        
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }


    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return String.format("[Nome: %s | Preço (R$): %.2f | Quantidade: %d ]", name, price, quantity);
    }
}
