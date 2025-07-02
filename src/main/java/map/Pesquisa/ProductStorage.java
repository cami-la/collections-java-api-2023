package main.java.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ProductStorage {
   
    private Map <Long, Product> productsInStorage;

    public ProductStorage() {
        this.productsInStorage = new HashMap<>();
    }

    // métodos 
    //adicionar Produto
    public void addProduct (long code, String name, int quantity, double price){
        productsInStorage.put(code, new Product(name, price, quantity));
    }

    // exibir produtos
    public void showProducts(){
        if (productsInStorage.isEmpty()){
            System.out.println("Estoque está vazio");
            System.out.println("-----------");

        }
        else {
            System.out.println("Lista de Produtos: " + productsInStorage);
            System.out.println("-----------");
        }
    }

    // total no estoque
    public double storageTotal(){
        double totalStorageValue = 0d; // variavel para armazenar o valor total
        if(!productsInStorage.isEmpty()){
            for (Product p : productsInStorage.values()) { // para pegar apenas os valores desejados
                totalStorageValue += p.getQuantity() * p.getPrice();
            }
        } 
        System.out.printf("Total em estoque: R$ %.2f", totalStorageValue); 
        return totalStorageValue; 
    }

    public Product getExpensiveProduct(){
       Product expensiveProduct = null;
       double expensiveValue = Double.MIN_VALUE; // Se quero achar o mais caro, começo com o menor valor possível.
        if (!productsInStorage.isEmpty()){
            for(Product e : productsInStorage.values()){
                if(e.getPrice() > expensiveValue ){
                    expensiveProduct = e;
                    expensiveValue = e.getPrice();

                }

            }

        } 
        System.out.println("Produto mais caro: " + expensiveProduct);
        return expensiveProduct;

    }


    public Product getTheCheapestProduct (){
    Product cheapestProduct = null;
    double cheapestValue = Double.MAX_VALUE; // Se quero achar o mais barato, começo com o maior valor possível.
        if (!productsInStorage.isEmpty()){
            for(Product c : productsInStorage.values()){
                if(c.getPrice() < cheapestValue ){
                    cheapestProduct = c;
                    cheapestValue = c.getPrice();

                }

            }

        } 
        System.out.println("Produto mais barato: " + cheapestProduct);
        return cheapestProduct;


    }


    // maior produto em estoque
    public Product getMajorQuantityProduct() {
        Product productMajor = null; 
        double totalPrice = 0d;

        
        if (!productsInStorage.isEmpty()){
            for(Product t : productsInStorage.values()){  // para pegar apenas os valores desejados
                if(t.getQuantity() * t.getPrice() > totalPrice){ // verifica se o produto é maior que o totalPrice
                    totalPrice = t.getQuantity() * t.getPrice(); // calcula o totalPrice
                    productMajor = t; // atribui o produto ao productMajor

                }

            }

        } 
        System.out.printf("Produto com mais quantidade: %s | -> Preço Total R$: %.2f", productMajor, totalPrice);

        System.out.println(" ");
        System.out.println("--------------------");
        return productMajor;

    }


    

    public static void main(String[] args) {
        
        ProductStorage products = new ProductStorage();

        products.showProducts();
        System.out.println("Adicionando produtos...");
        products.addProduct(1, "Arroz", 3, 30.00);
        products.addProduct(2, "Feijão", 3, 15.00); // para testar
        products.addProduct(2, "Feijão", 6, 15.00);
        products.addProduct(3, "Broa de Milho", 10, 12.00);
        products.addProduct(4, "Ovos", 30, 29.00);
        products.addProduct(5, "Iogurte", 15, 10.00);
        products.addProduct(6, "Sal", 1, 2.00);

        products.showProducts();

        
        products.getExpensiveProduct();
        products.getTheCheapestProduct();
        products.getMajorQuantityProduct();
        products.storageTotal();

        
    }
}
