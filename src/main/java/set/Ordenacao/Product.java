package main.java.set.Ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Product implements Comparable<Product>{

    // Cada produto possui atributos como nome, cod, preço e quantidade.
    private String name;
    private long code;
    private double price;
    private int quantity;
    
    // Construtor
    public Product(String name, long code, double price, int quantity) {
        this.name = name;
        this.code = code;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public long getCode() {
        return code;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return String.format("[Nome: %s | Código: %d | Preço (R$): %.2f | Quantidade: %d ]", name, code, price, quantity);
    }
    
     // Método Equal e Hash: o produto é igual se o código é igual

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Product product)) 
            return false;
        return getCode() == product.getCode();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCode());
    }

    //implementa Comparable porque o TreeSet não sabe como comparar dois objetos Product para decidir a ordem
    @Override
    public int compareTo(Product o) {
        return name.compareToIgnoreCase(o.getName()); 
    }
//Neste caso, optamos por ordenar os produtos pelo atributo 'name'.
// O método compareToIgnoreCase() é utilizado para fazer a comparação
// de strings desconsiderando diferenças entre maiúsculas e minúsculas.


    // como quero ordernar outro critério, usa Comparator
   public static class ComparatorByPrice implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        return Double.compare(p1.getPrice(),p2.getPrice());
    }
}
     // como quero ordernar outro critério, usa Comparator
   public static class ComparatorByQuantity implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        return Integer.compare(p1.getQuantity(),p2.getQuantity());
    }
    
}

}