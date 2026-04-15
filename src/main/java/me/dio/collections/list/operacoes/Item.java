package me.dio.collections.list.operacoes;

/**
 * Representa um item em um carrinho de compras.
 * Utiliza Record (Java 14+) para imutabilidade nativa e redução de boilerplate.
 */
public record Item(String nome, double preco, int quantidade) {
    @Override
    public String toString() {
        return "Item{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }
}
