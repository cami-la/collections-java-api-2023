package me.dio.collections.list.ordenacao;

import java.util.Comparator;

/**
 * Record Pessoa: Inmutabilidad nativa y reducción de boilerplate.
 */
public record Pessoa(String nome, int idade, double altura) implements Comparable<Pessoa> {

    @Override
    public int compareTo(Pessoa p) {
        return Integer.compare(this.idade, p.idade());
    }

    /**
     * Factory method para un Comparator fluído por altura.
     */
    public static Comparator<Pessoa> porAltura() {
        return Comparator.comparingDouble(Pessoa::altura);
    }

    @Override
    public String toString() {
        return String.format("Pessoa[nome=%s, idade=%d, altura=%.2f]", nome, idade, altura);
    }
}
