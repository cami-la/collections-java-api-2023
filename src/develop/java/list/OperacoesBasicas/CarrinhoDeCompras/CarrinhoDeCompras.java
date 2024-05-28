package develop.java.list.OperacoesBasicas.CarrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        itemList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itemListToRemove = new ArrayList<>();

        for (Item item: itemList){
            if (item.getNome().equalsIgnoreCase(nome)){
                itemListToRemove.add(item);
            }
        }

        itemList.removeAll(itemListToRemove);
    }

    public double calcularValorTotal(){
        double total = 0.00;

        for (Item item: itemList){
            total += item.getPreco() * item.getQuantidade();
        }

        return total;
    }

    public void exibirItens(){
        System.out.println(itemList);
    }

    public int numeroTotalDeItens(){
        return itemList.size();
    }

    public static void main(String[] args) {

        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        System.out.println("Número de itens no carrinho: " + carrinhoDeCompras.numeroTotalDeItens());

        carrinhoDeCompras.adicionarItem("Sabonete", 1.0, 5);
        carrinhoDeCompras.adicionarItem("Shampoo", 8.0, 1);
        carrinhoDeCompras.adicionarItem("Arroz", 19.50, 2);
        carrinhoDeCompras.adicionarItem("Arroz", 19.50, 2);
        carrinhoDeCompras.adicionarItem("Feijão", 4.99, 4);

        System.out.println("Número de itens no carrinho: " + carrinhoDeCompras.numeroTotalDeItens());

        System.out.println("Valor total das compras: " + carrinhoDeCompras.calcularValorTotal());

        System.out.println("*** Itens no carrinho ***");
        carrinhoDeCompras.exibirItens();

        carrinhoDeCompras.removerItem("arroz");
        carrinhoDeCompras.exibirItens();

        carrinhoDeCompras.adicionarItem("Arroz", 19.50, 2);
        System.out.println("Valor total das compras: " + carrinhoDeCompras.calcularValorTotal());
        carrinhoDeCompras.exibirItens();



    }
}
