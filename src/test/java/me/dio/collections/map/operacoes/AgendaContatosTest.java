package me.dio.collections.map.operacoes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.assertj.core.api.Assertions.*;

@DisplayName("Suite de Pruebas de Ingeniería - AgendaContatos (Modern Map API)")
class AgendaContatosTest {

    private AgendaContatos agenda;

    @BeforeEach
    void setUp() {
        agenda = new AgendaContatos();
        agenda.adicionarContato("Camila", 123456);
        agenda.adicionarContato("João", 5665);
    }

    @Test
    @DisplayName("Debe retornar un Optional vacío al buscar contacto inexistente")
    void deveRetornarOptionalVazioParaContatoInexistente() {
        Optional<Integer> resultado = agenda.pesquisarPorNome("Maria");
        
        assertThat(resultado).isEmpty();
    }

    @Test
    @DisplayName("Debe encontrar contacto existente usando Optional (Java 8+)")
    void deveEncontrarContatoExistente() {
        Optional<Integer> resultado = agenda.pesquisarPorNome("Camila");
        
        assertThat(resultado).isPresent().hasValue(123456);
    }

    @Test
    @DisplayName("Debe actualizar el teléfono si el nombre ya existe")
    void deveAtualizarTelefoneExistente() {
        agenda.adicionarContato("Camila", 999999);
        
        Optional<Integer> resultado = agenda.pesquisarPorNome("Camila");
        assertThat(resultado).isPresent().hasValue(999999);
    }
}
