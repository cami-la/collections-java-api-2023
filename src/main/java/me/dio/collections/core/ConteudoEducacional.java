package me.dio.collections.core;

/**
 * Patrón: Sealed Classes (Java 17+)
 * Define una jerarquía cerrada y segura de contenidos educativos.
 * Solo las subclases permitidas pueden heredar de esta base, garantizando exhaustividad.
 */
public sealed interface ConteudoEducacional permits Aula, Laboratorio, Desafio {
    String titulo();
    int cargaHoraria();
    
    // Método default para procesamiento común amigable con OpenJ9
    default String formatarRelatorio() {
        return String.format("[%s] %s (%dh)", this.getClass().getSimpleName(), titulo(), cargaHoraria());
    }
}

/**
 * Record Aula: Representa una lección teórica.
 */
record Aula(String titulo, int cargaHoraria, String videoUrl) implements ConteudoEducacional {}

/**
 * Record Laboratorio: Representa una práctica guiada.
 */
record Laboratorio(String titulo, int cargaHoraria, String stackTecnologica) implements ConteudoEducacional {}

/**
 * Record Desafio: Representa una evaluación de código.
 */
record Desafio(String titulo, int cargaHoraria, double dificuldade) implements ConteudoEducacional {}
