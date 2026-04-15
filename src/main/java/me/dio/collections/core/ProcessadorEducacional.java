package me.dio.collections.core;

import java.util.List;
import java.util.SequencedCollection;
import java.util.ArrayList;

/**
 * Senior Architect Pattern: Pattern Matching for switch (Java 21+)
 * Implementa el procesamiento exhaustivo de contenidos sin casting manual.
 */
public class ProcessadorEducacional {

    private final List<ConteudoEducacional> trilha;

    public ProcessadorEducacional() {
        this.trilha = new ArrayList<>();
    }

    public void adicionarConteudo(ConteudoEducacional conteudo) {
        trilha.add(conteudo);
    }

    /**
     * Procesa la trilha educativa usando Pattern Matching.
     * Elimina el 'boilerplate' de instanceof y casting.
     */
    public void processarTrilha() {
        trilha.forEach(conteudo -> {
            String resultado = switch (conteudo) {
                case Aula a -> "📺 Assistindo aula: " + a.titulo() + " em " + a.videoUrl();
                case Laboratorio l -> "🛠️ Praticando lab: " + l.titulo() + " usando " + l.stackTecnologica();
                case Desafio d -> "🔥 Desafio: " + d.titulo() + " [Dificuldade: " + d.dificuldade() + "]";
                // No se necesita default: el compilador garantiza que manejamos todos los tipos permitidos (Exhaustividad)
            };
            System.out.println(resultado);
        });
    }

    /**
     * Calcula la carga horaria total usando recursión o streams.
     */
    public int calcularCargaHorariaTotal() {
        return trilha.stream()
                .mapToInt(ConteudoEducacional::cargaHoraria)
                .sum();
    }

    public static void main(String[] args) {
        ProcessadorEducacional processador = new ProcessadorEducacional();
        
        processador.adicionarConteudo(new Aula("Java Collections", 2, "https://dio.me/java-25"));
        processador.adicionarConteudo(new Laboratorio("Refatorando para Records", 4, "OpenJ9 / IntelliJ"));
        processador.adicionarConteudo(new Desafio("Stress Test de Set", 1, 5.0));

        System.out.println("--- Iniciando Trilha Educacional Target 2026 ---");
        processador.processarTrilha();
        System.out.println("Carga Horária Total: " + processador.calcularCargaHorariaTotal() + " horas.");
    }
}
