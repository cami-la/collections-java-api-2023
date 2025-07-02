package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class BooksCatalog {

    private List<Book> booksCatalog;

    // Construtor
    public BooksCatalog() {
        this.booksCatalog = new ArrayList<>();
    }

    public void addBook(String name, String author, int publishingYear) {
        booksCatalog.add(new Book(name, author, publishingYear));
    }
    
    public List<Book> searchForAuthor(String author){
        List<Book> booksByAuthor = new ArrayList<>();
        if (!booksCatalog.isEmpty()){
            for(Book b : booksCatalog){
                if(b.getAuthor().equalsIgnoreCase(author)){
                    booksByAuthor.add(b);
                }
            } 
        } else {
            System.out.println("Nenhum autor encontrado.");
        }
        return booksByAuthor;
    }

    public List<Book> searchForYearRange(int initialYear, int finalYear){
        List<Book> booksByYear = new ArrayList<>();
        if (!booksCatalog.isEmpty()){
            for(Book b : booksCatalog){
                if(b.getPublishingYear() >= initialYear && b.getPublishingYear() <= finalYear){
                    booksByYear.add(b);
                }
            } 
        } else {
            throw new RuntimeException("Nenhum livro encontrado neste intervalo de anos.");
        }
        return booksByYear;
    }
    

    public Book searchForTitle(String name){
        Book bookByTitle = null;
        if (!booksCatalog.isEmpty()){
            for(Book b : booksCatalog){
                if(b.getName().equalsIgnoreCase(name)){
                    bookByTitle = b;
                    break;
                }
            } 
        } else {
            System.out.println("Nenhum livro encontrado com este título.");
        }
        return bookByTitle;
    }

    public static void main(String[] args) {

        // Pesquisa por livros
        BooksCatalog booksCatalog = new BooksCatalog();

        System.out.println("Número de livros: " + booksCatalog.booksCatalog.size());
        System.out.println("--------------------");
        // Adicionando livros
        System.out.println("Adicionando livros ao catálogo...");
        booksCatalog.addBook("Java Programming", "John Doe", 2020);
        booksCatalog.addBook("Python Programming", "John Doe", 2019);
        booksCatalog.addBook("Effective Java", "Joshua Bloch", 2018);
        System.out.println("--------------------");
        // pesquisa por autor
        List<Book> booksByAuthor = booksCatalog.searchForAuthor("John Doe");
        System.out.println("Livros encontrados por autor 'John Doe':" + booksByAuthor);
        System.out.println("--------------------");
        // autor não encontrado
        List<Book> booksByAuthorNotFound = booksCatalog.searchForAuthor("Jane Smith");
        System.out.println("Livros encontrados por autor 'Jane Smith': " + booksByAuthorNotFound);
        System.out.println("--------------------");
        // pesquisa por título
        Book bookByTitle = booksCatalog.searchForTitle("Java Programming");
        System.out.println("Livro encontrado por título 'Java Programming': " + bookByTitle);
        System.out.println("--------------------");
        // título não encontrado
        Book bookByTitleNotFound = booksCatalog.searchForTitle("Python Programming");
        System.out.println("Livro encontrado por título 'Python Programming': " + bookByTitleNotFound);
        System.out.println(" ");
        System.out.println("--------------------");
        // pesquisa por ano
        List<Book> booksByYear = booksCatalog.searchForYearRange(2015, 2021);
        System.out.println("Livros encontrados entre 2015 e 2021: " + booksByYear);
        System.out.println("--------------------");
        // ano não encontrado
        List<Book> booksByYearNotFound = booksCatalog.searchForYearRange(2000, 2010);
        System.out.println("Livros encontrados entre 2000 e 2010: " + booksByYearNotFound);
        System.out.println("--------------------");

        
    }
    
    
}
