package me.dio.collections.set.ordenacao;

import java.util.Comparator;
import java.util.Objects;

/**
 * Record Produto: Inmutabilidad nativa.
 * Refactor de Portabilidad: Desempate en compareTo para evitar pérdida de elementos en TreeSet.
 */
public record Produto(long codigo, String nome, double preco, int quantidade) 
        implements Comparable<Produto> {

    /**
     * Contrato Comparable Robusto:
     * Si los nombres son iguales, utiliza el código como desempate (Unique Identifier).
     * Esto evita que un TreeSet considere dos productos diferentes como "iguales" solo por el nombre.
     */
    @Override
    public int compareTo(Produto p) {
        int result = this.nome.compareToIgnoreCase(p.nome());
        if (result == 0) {
            return Long.compare(this.codigo, p.codigo());
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produto produto)) return false;
        return codigo == produto.codigo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }

    public static Comparator<Produto> porPreco() {
        return Comparator.comparingDouble(Produto::preco)
                .thenComparingLong(Produto::codigo); // Desempate por código en el comparador también
    }

    @Override
    public String toString() {
        return String.format("Produto[id=%d, nome=%s, preco=%.2f]", codigo, nome, preco);
    }
}
