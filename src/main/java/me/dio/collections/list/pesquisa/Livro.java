package me.dio.collections.list.pesquisa;

/**
 * Record Livro: Inmutabilidad nativa.
 */
public record Livro(String titulo, String autor, int anoPublicacao) {
    @Override
    public String toString() {
        return String.format("Livro[titulo=%s, autor=%s, ano=%d]", titulo, autor, anoPublicacao);
    }
}
