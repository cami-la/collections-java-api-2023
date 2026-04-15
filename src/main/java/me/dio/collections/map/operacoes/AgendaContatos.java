package me.dio.collections.map.operacoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * Modernización de la Agenda de Contatos usando Java 25.
 * Refactor de Sincronización Javadoc vs Código: Uso de 'put' o 'merge' como método atómico.
 */
public class AgendaContatos {
    private final Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    /**
     * Sincronización con Javadoc: Actualiza el contacto o lo añade de forma elegante.
     * En Java 25, 'put' ya es una operación eficiente sobre Map.
     */
    public void adicionarContato(String nome, Integer telefone) {
        // Opción 1: Put directo (sobrescribe si existe)
        agendaContatoMap.put(nome, telefone);
        
        // Opción 2 (Merge): Por si se desea lógica de desempate en el futuro
        // agendaContatoMap.merge(nome, telefone, (oldValue, newValue) -> newValue);
    }

    public void removerContato(String nome) {
        if (agendaContatoMap.isEmpty()) throw new IllegalStateException("A agenda está vazia.");
        agendaContatoMap.remove(nome);
    }

    public void exibirContatos() {
        if (agendaContatoMap.isEmpty()) {
            System.out.println("A agenda está vazia.");
            return;
        }
        agendaContatoMap.forEach((nome, telefone) -> 
            System.out.printf("Nome: %s | Telefone: %d%n", nome, telefone));
    }

    public Optional<Integer> pesquisarPorNome(String nome) {
        return Optional.ofNullable(agendaContatoMap.get(nome));
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.adicionarContato("Camila", 123456);
        agendaContatos.adicionarContato("João", 5665);
        agendaContatos.exibirContatos();
    }
}
