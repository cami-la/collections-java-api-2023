package me.dio.collections.set.ordenacao;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.SequencedSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 * Modernización del Gerenciador de Alunos usando Java 21+ SequencedSet.
 * Record Aluno garantiza inmutabilidad.
 */
public class GerenciadorAlunos {
    private final Set<Aluno> alunoSet;

    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, long matricula, double media) {
        alunoSet.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(long matricula) {
        alunoSet.removeIf(a -> a.matricula() == matricula);
    }

    /**
     * Ordenação Natural por Nome (Comparable).
     */
    public Set<Aluno> exibirAlunosPorNome() {
        return new TreeSet<>(alunoSet);
    }

    /**
     * Ordenação Customizada por Nota usando Streams.
     */
    public Set<Aluno> exibirAlunosPorNota() {
        return alunoSet.stream()
                .sorted(Aluno.porNota())
                .collect(Collectors.toUnmodifiableSet());
    }

    /**
     * Exemplo de uso de SequencedSet para ordem de inserção determinística.
     */
    public SequencedSet<Aluno> exibirAlunosOrdemInsercao() {
        return new LinkedHashSet<>(alunoSet);
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAluno("Alice", 123456L, 6.7);
        gerenciadorAlunos.adicionarAluno("Bob", 123457L, 9.0);
        gerenciadorAlunos.adicionarAluno("Charlie", 123458L, 5.0);
        gerenciadorAlunos.adicionarAluno("David", 123459L, 8.1);

        System.out.println("Alunos (HashSet): " + gerenciadorAlunos.alunoSet);
        System.out.println("Por Nome (Natural): " + gerenciadorAlunos.exibirAlunosPorNome());
        System.out.println("Por Nota (Custom): " + gerenciadorAlunos.exibirAlunosPorNota());
    }
}

/**
 * Record Aluno: Inmutabilidad nativa.
 * Identidad basada en matrícula.
 */
record Aluno(String nome, long matricula, double media) implements Comparable<Aluno> {
    @Override
    public int compareTo(Aluno a) {
        return nome.compareToIgnoreCase(a.nome());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aluno aluno)) return false;
        return matricula == aluno.matricula;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(matricula);
    }

    public static java.util.Comparator<Aluno> porNota() {
        return java.util.Comparator.comparingDouble(Aluno::media);
    }
}
