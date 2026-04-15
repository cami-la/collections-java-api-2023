package me.dio.collections.list.operacoes;

/**
 * Representa uma tarefa no sistema.
 * Utiliza Record (Java 14+) para imutabilidade nativa e redução de boilerplate.
 */
public record Tarefa(String descricao) {
    @Override
    public String toString() {
        return descricao;
    }
}
