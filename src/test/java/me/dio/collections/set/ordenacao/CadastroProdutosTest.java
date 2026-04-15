package me.dio.collections.set.ordenacao;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.*;

@DisplayName("Suite de Pruebas de Ingeniería - CadastroProdutos (Java 25 Ready)")
class CadastroProdutosTest {

    private CadastroProdutos cadastro;

    @BeforeEach
    void setUp() {
        cadastro = new CadastroProdutos();
        cadastro.adicionarProduto(1L, "Smartphone", 1000.0, 10);
        cadastro.adicionarProduto(2L, "Notebook", 1500.0, 5);
        cadastro.adicionarProduto(3L, "Mouse", 30.0, 20);
        cadastro.adicionarProduto(4L, "Teclado", 50.0, 15);
    }

    @Test
    @DisplayName("Debe validar inmutabilidad de la colección devuelta")
    void deveValidarInmutabilidad() {
        final Set<Produto> produtosPorPreco = cadastro.exibirProdutosPorPreco();
        assertThatThrownBy(() -> produtosPorPreco.add(new Produto(5L, "Monitor", 800.0, 2)))
                .isExactlyInstanceOf(UnsupportedOperationException.class);
    }

    @Test
    @DisplayName("Debe soportar estrés de lectura concurrente con Virtual Threads y recolectar futuros")
    void deveSuportarLeituraConcorrenteComVirtualThreads() throws Exception {
        int numeroDeHilos = 1000;
        
        try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
            List<Callable<Boolean>> tareas = IntStream.range(0, numeroDeHilos)
                .mapToObj(i -> (Callable<Boolean>) () -> {
                    Set<Produto> ordenados = cadastro.exibirProdutosPorPreco();
                    assertThat(ordenados).hasSize(4);
                    assertThat(ordenados.iterator().next().preco()).isEqualTo(30.0);
                    return true;
                })
                .toList();

            List<Future<Boolean>> futuros = executor.invokeAll(tareas);
            
            for (Future<Boolean> f : futuros) {
                assertThat(f.get()).isTrue(); 
            }
        }
    }

    @Test
    @DisplayName("Debe validar el orden determinista por nombre (Natural Order)")
    void deveValidarOrdenacaoNatural() {
        Set<Produto> porNome = cadastro.exibirProdutosPorNome();
        assertThat(porNome)
                .extracting(Produto::nome)
                .containsExactly("Mouse", "Notebook", "Smartphone", "Teclado");
    }

    @Test
    @DisplayName("Debe desempatar por código en compareTo para evitar pérdida de datos")
    void deveDesempatarPorCodigoNoCompareTo() {
        cadastro.adicionarProduto(10L, "Smartphone", 2000d, 1);
        
        Set<Produto> todos = cadastro.exibirProdutosPorNome();
        assertThat(todos).hasSize(5);
        assertThat(todos).extracting(Produto::codigo).contains(1L, 10L);
    }
}
