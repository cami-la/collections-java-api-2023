package main.java.list.OperacoesBasicas;

public class Item {
    //Atributos
    private String nome;
    private double preco;
    private int quantidade;

    public Item(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "Item {\n" +
                " Nome: " + nome + ",\n" +
                " Preco: " + preco + ",\n" +
                " Quantidade: " + quantidade + ",\n" +
                "}";
    }

    
    


}
