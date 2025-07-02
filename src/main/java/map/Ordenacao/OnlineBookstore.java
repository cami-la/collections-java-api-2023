package main.java.map.Ordenacao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class OnlineBookstore {

   

    private Map <String, Book> bookList;

    // contrutor
    public OnlineBookstore() {
        this.bookList = new HashMap<>();
    }

    // métodos
    public void addBook(String link, Book book){
        bookList.put(link, book);

    }

    public void removeBook (String title) {
        if (!bookList.isEmpty()) {
            bookList.remove(title);
        }
    }

    // livros por preço
    public void showBooksByPrice() {
    if (!bookList.isEmpty()) {
        List<Book> booksPrice = new ArrayList<>(bookList.values());
        booksPrice.sort(new Book.ComparatorByPrice());

    System.out.println("Livros ordenados por preço:");
    for (Book book : booksPrice) {
        System.out.println(book);
    }
    System.out.println("---------");
    }
    }

    // livros por autor
    public List<Book> showByAuthor(String author) {
        List<Book> booksByAuthor = new ArrayList<>();
        boolean bookFound = false;

        for (Book b : bookList.values()) {  // percorre o map
            if (b.getAuthor().equalsIgnoreCase(author)) { // verifica se o autor é igual ao informado
                booksByAuthor.add(b); // adiciona o livro à lista
                bookFound = true; // marca que encontrou pelo menos um livro do autor e vai para o próximo if
                } 
            } 
            
        if (bookFound) {
            System.out.println("Livros por: " + author); // exibe o autor
            for (Book b : booksByAuthor) { // percorre a lista de livros do autor
                System.out.printf("- %s (R$ %.2f)\n", b.getTitle(), b.getPrice()); // exibe o título e o preço do livro
        }
        } else {
            System.out.println("Nenhum livro encontrado para o autor: " + author);
    }
        
        return booksByAuthor;
    }

    public Book getExpensiveBook(){
        Book expensiveBook = null;
        double expensiveValue = Double.MIN_VALUE;
        if (!bookList.isEmpty()){
            for (Book bookE : bookList.values()){
                if (bookE.getPrice() > expensiveValue) {
                    expensiveBook = bookE;
                    expensiveValue = bookE.getPrice();
                }
            }
        }
        System.out.println("------------");
        System.out.println("Livro mais caro: " + expensiveBook);
        return expensiveBook;
    }


    public Book getCheapestBook(){
        Book cheapBook = null;
        double cheapValue = Double.MAX_VALUE;
        if (!bookList.isEmpty()){
            for (Book bookC : bookList.values()){
                if (bookC.getPrice() < cheapValue) {
                    cheapBook = bookC;
                    cheapValue = bookC.getPrice();
                }
            }
        }
        System.out.println("------------");
        System.out.println("Livro mais barato: " + cheapBook);
        return cheapBook;
    }





    public static void main(String[] args) {
        
        OnlineBookstore books = new OnlineBookstore();

       
        books.addBook("https://amzn.to/3EclT8Z", new Book("1984", "George Orwell", 50d));
        books.addBook("https://amzn.to/3YxHc6A", new Book("Admirável Mundo Novo", "Aldous Huxley", 45.5));
        books.addBook("https://amzn.to/3YeJK6O", new Book("O Conto da Aia", "Margaret Atwood", 60d));
        books.addBook("https://amzn.to/3Rnc2ME", new Book("Fahrenheit 451", "Ray Bradbury", 38.9));
        books.addBook("https://amzn.to/3KednAa", new Book("Laranja Mecânica", "Anthony Burgess", 42d));
        books.addBook("https://amzn.to/3KcZ9Ld", new Book("Ensaio Sobre a Cegueira", "José Saramago", 54d));
        books.addBook("https://amzn.to/3Reu1iG", new Book("O Hobbit", "J.R.R. Tolkien", 70.0));
        books.addBook("https://amzn.to/3X3TItM", new Book("O Senhor dos Anéis: A Sociedade do Anel", "J.R.R. Tolkien", 90.0));
        books.addBook("https://amzn.to/3X1OGbR", new Book("O Senhor dos Anéis: As Duas Torres", "J.R.R. Tolkien", 95.0));
        books.addBook("https://amzn.to/3Rg7hM7", new Book("O Senhor dos Anéis: O Retorno do Rei", "J.R.R. Tolkien", 100.0));
        books.addBook("https://amzn.to/3X2T39C", new Book("O Silmarillion", "J.R.R. Tolkien", 85.5));
        books.addBook("https://amzn.to/3ReuYg8", new Book("Contos Inacabados", "J.R.R. Tolkien", 78.0));
        books.addBook("https://amzn.to/3X5I9Lk", new Book("Beren e Lúthien", "J.R.R. Tolkien", 74.5));
        books.addBook("https://amzn.to/3X4FHJq", new Book("A Queda de Gondolin", "J.R.R. Tolkien", 79.9));


        books.showBooksByPrice();
        System.out.println("------------");

        books.showByAuthor("J.R.R. Tolkien");
        books.getExpensiveBook();
        books.getCheapestBook();

    }

   
}


    

