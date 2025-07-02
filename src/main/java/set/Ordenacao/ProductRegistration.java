package main.java.set.Ordenacao;


import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import main.java.set.Ordenacao.Product.ComparatorByPrice;
import main.java.set.Ordenacao.Product.ComparatorByQuantity;

public class ProductRegistration {

    /* - `adicionarProduto(long cod, String nome, double preco, int quantidade)`: Adiciona um produto ao cadastro.
- `exibirProdutosPorNome()`: Exibe todos os produtos do cadastro em ordem alfabética pelo nome.
- `exibirProdutosPorPreco()`: Exibe todos os produtos do cadastro em ordem crescente de preço.*/

    private Set<Product> productList;

    public ProductRegistration() {
        this.productList = new HashSet<>();
    }

    public void addProduct (long code, String name, double price, int quantity){
        productList.add(new Product(name, code, price, quantity));
    }

    public Set<Product> showProductByName(){
        Set<Product> productByName = new TreeSet<>(productList);
        if (productList.isEmpty()){
            throw new IllegalStateException("A lista está vazia.");
        }
        else{
            return productByName;
        }

    }

    public Set<Product> showProductByPrice(){
        Set<Product> productByPrice = new TreeSet<>(new ComparatorByPrice());
        if (productList.isEmpty()){
            throw new IllegalStateException("A lista está vazia.");
        }
        else{
            productByPrice.addAll(productList);
            return productByPrice;
        }

    }

     public Set<Product> showProductByQuantity(){
        Set<Product> productByQuantity = new TreeSet<>(new ComparatorByQuantity());
        if (productList.isEmpty()){
            throw new IllegalStateException("A lista está vazia.");
        }
        else{
            productByQuantity.addAll(productList);
            return productByQuantity;
        }

    }
    
    

    public static void main(String[] args) {

        ProductRegistration products = new ProductRegistration();

        System.out.println("Adicionando produtos...");
        products.addProduct(1, "Arroz", 30.00, 3);
        products.addProduct(2, "Feijão", 10.00, 2);
        products.addProduct(3, "Caldo de galinha", 1.00, 10);
        products.addProduct(4, "Broa de Milho", 11.00, 5);
        products.addProduct(5, "Ovos", 15.00, 30);
        products.addProduct(5, "Farinha", 16.00, 3);
        
        
        System.out.println("Produtos por ordem alfabética: " + products.showProductByName());
        System.out.println("--------------");
        System.out.println("Produtos por ordem crescente (R$): " + products.showProductByPrice());
        System.out.println("--------------");
        System.out.println("Produtos por ordem de Quantidade crescente: " + products.showProductByQuantity());
        System.out.println("--------------");
    }
}

