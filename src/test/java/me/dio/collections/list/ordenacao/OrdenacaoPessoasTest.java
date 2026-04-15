package me.dio.collections.list.ordenacao;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

@DisplayName("Suite de Pruebas de Ingeniería - OrdenacaoPessoas (Sequenced Collections)")
class OrdenacaoPessoasTest {

    private OrdenacaoPessoas ordenacao;

    @BeforeEach
    void setUp() {
        ordenacao = new OrdenacaoPessoas();
        ordenacao.adicionarPessoa("Alice", 20, 1.56);
        ordenacao.adicionarPessoa("Bob", 30, 1.80);
        ordenacao.adicionarPessoa("Charlie", 25, 1.70);
    }

    @Test
    @DisplayName("Debe validar el orden inverso usando Sequenced Collections (Java 21+)")
    void deveValidarOrdemInversa() {
        List<Pessoa> listaInversa = ordenacao.obtenerListaInvertida();
        
        // El último elemento añadido fue Charlie (insertion order)
        // Por lo tanto, el primero en la lista inversa debe ser Charlie
        assertThat(listaInversa.getFirst().nome()).isEqualTo("Charlie");
        assertThat(listaInversa.getLast().nome()).isEqualTo("Alice");
    }

    @Test
    @DisplayName("Debe validar ordenación fluida por altura")
    void deveValidarOrdenacaoPorAltura() {
        List<Pessoa> porAltura = ordenacao.ordenarPorAltura();
        
        assertThat(porAltura)
                .extracting(Pessoa::altura)
                .isSorted();
        
        assertThat(porAltura.getFirst().nome()).isEqualTo("Alice"); // 1.56
        assertThat(porAltura.getLast().nome()).isEqualTo("Bob");    // 1.80
    }
}
