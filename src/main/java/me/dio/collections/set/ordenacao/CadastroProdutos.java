package me.dio.collections.set.ordenacao;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 * Modernização do Cadastro de Produtos com Java 25.
 * Refactor de Consistencia: Preservación de orden determinista en Sets.
 */
public class CadastroProdutos {
    private final Set<Produto> productoSet;

    public CadastroProdutos() {
        this.productoSet = new HashSet<>();
    }

    public void adicionarProduto(long codigo, String nome, double preco, int cantidad) {
        productoSet.add(new Produto(codigo, nome, preco, cantidad));
    }

    /**
     * Ordenación Natural por Nombre (TreeSet usa el compareTo robusto).
     */
    public Set<Produto> exibirProdutosPorNome() {
        return new TreeSet<>(productoSet);
    }

    /**
     * Ordenación por Preço: Preservación de orden determinista.
     * Cambiamos a toCollection(LinkedHashSet::new) para que el orden del Stream se mantenga.
     */
    public Set<Produto> exibirProdutosPorPreco() {
        return productoSet.stream()
                .sorted(Produto.porPreco())
                .collect(Collectors.collectingAndThen(
                        Collectors.toCollection(LinkedHashSet::new), 
                        Collections::unmodifiableSet
                ));
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(1L, "Smartphone", 1000d, 10);
        cadastroProdutos.adicionarProduto(2L, "Notebook", 1500d, 5);
        cadastroProdutos.adicionarProduto(3L, "Mouse", 30d, 20);
        cadastroProdutos.adicionarProduto(4L, "Teclado", 50d, 15);

        System.out.println("Por Nome (Natural): " + cadastroProdutos.exibirProdutosPorNome());
        System.out.println("Por Preço (Custom & Ordered): " + cadastroProdutos.exibirProdutosPorPreco());
    }
}
