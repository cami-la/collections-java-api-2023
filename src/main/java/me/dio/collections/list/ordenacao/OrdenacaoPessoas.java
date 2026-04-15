package me.dio.collections.list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.SequencedCollection;
import java.util.stream.Collectors;

/**
 * Classe para ordenação de pessoas.
 * Implementa Sequenced Collections (Java 21+) y Streams para lógica moderna.
 */
public class OrdenacaoPessoas {
    private final List<Pessoa> pessoaList;

    public OrdenacaoPessoas() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    /**
     * Ordena la lista por edad usando Streams.
     */
    public List<Pessoa> ordenarPorIdade() {
        if (pessoaList.isEmpty()) throw new IllegalStateException("A lista está vazia!");
        
        return pessoaList.stream()
                .sorted()
                .collect(Collectors.collectingAndThen(
                        Collectors.toList(), 
                        Collections::unmodifiableList
                ));
    }

    /**
     * Ordena la lista por altura usando Comparator fluido.
     */
    public List<Pessoa> ordenarPorAltura() {
        if (pessoaList.isEmpty()) throw new IllegalStateException("A lista está vazia!");

        return pessoaList.stream()
                .sorted(Pessoa.porAltura())
                .collect(Collectors.collectingAndThen(
                        Collectors.toList(), 
                        Collections::unmodifiableList
                ));
    }

    /**
     * Exemplo de uso de Sequenced Collection para inverter a ordem.
     */
    public List<Pessoa> obtenerListaInvertida() {
        return (List<Pessoa>) ((SequencedCollection<Pessoa>) pessoaList).reversed().stream()
                .collect(Collectors.toUnmodifiableList());
    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

        ordenacaoPessoas.adicionarPessoa("Alice", 20, 1.56);
        ordenacaoPessoas.adicionarPessoa("Bob", 30, 1.80);
        ordenacaoPessoas.adicionarPessoa("Charlie", 25, 1.70);
        ordenacaoPessoas.adicionarPessoa("David", 17, 1.56);

        System.out.println("Por Idade: " + ordenacaoPessoas.ordenarPorIdade());
        System.out.println("Por Altura: " + ordenacaoPessoas.ordenarPorAltura());
    }
}
