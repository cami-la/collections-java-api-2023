package me.dio.collections.set.operacoes;

import java.util.Objects;

/**
 * Representa um convidado.
 * 
 * ATENÇÃO: Embora seja um Record, sobrescrevemos equals() e hashCode() 
 * para garantir que a identidade do Set seja baseada APENAS no código do convite,
 * conforme as regras de negócio de conjuntos de convidados.
 */
public record Convidado(String nome, int codigoConvite) {
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Convidado convidado)) return false;
        return codigoConvite == convidado.codigoConvite;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoConvite);
    }

    @Override
    public String toString() {
        return "Convidado{" +
                "nome='" + nome + '\'' +
                ", codigoConvite=" + codigoConvite +
                '}';
    }
}
