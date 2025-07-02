package main.java.map.Ordenacao;

import java.util.Comparator;



public class Book implements Comparable<Book> {

    // A classe "Livro" possui atributos como título, autor e preço.
    private String title;
    private String author;
    private double price;
    
    // Construtor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("[Título: %s | Autor(a): %s | Preço (R$): %.2f ]", title, author, price);
    }

    @Override
    public int compareTo(Book book) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }

    public static class ComparatorByPrice implements Comparator<Book>{

        @Override
        public int compare(Book price1, Book price2) {
                return Double.compare(price1.getPrice(), price2.getPrice());
        
        
        }

    }
    

}
