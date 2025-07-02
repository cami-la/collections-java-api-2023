package main.java.list.Pesquisa;

public class Book {

  private String name;
  private String author;
  private int publishingYear;
  
  // Construtor
  public Book(String name, String author, int publishingYear) {
    this.name = name;
    this.author = author;
    this.publishingYear = publishingYear;
  }

  // Get 
  public String getName() {
    return name;
  }

  public String getAuthor() {
    return author;
  }


  public int getPublishingYear() {
    return publishingYear;
  }

  

  @Override
public String toString() {
    return " \n" +
           "Título: " + name + "\n" +
           "Autor: " + author + "\n" +
           "Ano de Publicação: " + publishingYear + "\n"; 
}


  
  

  
}
