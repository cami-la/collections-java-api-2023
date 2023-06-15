# SET

<p align="center">
<img src="../../../../assets/image/set-interface-hierarchy.png" alt="Set interface hierarchy Java"><br>
<a href="https://data-flair.training/blogs/collection-framework-in-java/">Hierarchy of Collection Framework in Java </a>
</p>

- A interface `Set` é uma coleção que não pode conter elementos duplicados.
- Essa interface representa o conceito matemático de um conjunto e é usada para representar conjuntos, como um baralho de cartas.
- A plataforma Java possui três implementações de `Set` de uso geral: `HashSet`, `TreeSet` e `LinkedHashSet`.
- A interface `Set` não permite acesso aleatório a um elemento na coleção.
- Para percorrer os elementos de um `Set`, você pode usar um iterador ou um loop foreach.

> ##### *HashSet*: O HashSet é uma implementação da interface Set que armazena os elementos em uma tabela hash. Ele não mantém uma ordem específica dos elementos. A principal vantagem do HashSet é que ele oferece um desempenho de busca muito eficiente, pois usa funções hash para indexar os elementos. No entanto, a ordem em que os elementos são adicionados pode não ser preservada ao percorrer o conjunto.

> ##### *TreeSet*: O TreeSet é uma implementação da interface Set que armazena os elementos em uma árvore binária balanceada. Isso significa que os elementos são armazenados em uma ordem classificada e são mantidos automaticamente em ordem crescente. A principal vantagem do TreeSet é que os elementos são sempre retornados na ordem classificada, o que facilita a obtenção de elementos em uma determinada ordem. No entanto, a busca e a inserção são um pouco mais lentas em comparação com o HashSet.

> ##### *LinkedHashSet*: O LinkedHashSet é uma implementação da interface Set que mantém a ordem de inserção dos elementos, além de usar uma tabela hash para obter um bom desempenho de busca. Ele é semelhante ao HashSet, mas também mantém uma lista duplamente vinculada que preserva a ordem de inserção. Isso permite que os elementos sejam percorridos na ordem em que foram adicionados. O LinkedHashSet é útil quando você precisa manter a ordem de inserção dos elementos e também ter um bom desempenho de busca.

### Referências:

[1] "Collections in Java Tutorial." DigitalOcean Community. Disponível em: https://www.digitalocean.com/community/tutorials/collections-in-java-tutorial.

[2] "Java™ Platform, Standard Edition 17 API Specification - Class Set." Oracle. Disponível em: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Set.html.

# Fixando os Conhecimentos

Exercícios:

1. Operações Básicas com Set
2. Pesquisa em Set
3. Ordenação nas Set

## Operações Básicas com Set

### 1. Conjunto de Alunos
<p>Crie uma classe chamada "ConjuntoAlunos" que possui um conjunto de objetos do tipo "Aluno" como atributo. Cada aluno possui atributos como nome, idade e matrícula. Implemente os seguintes métodos:

- `adicionarAluno(Aluno aluno)`: Adiciona um aluno ao conjunto.
- `removerAlunoPorMatricula(String matricula)`: Remove um aluno do conjunto com base em sua matrícula.
- `verificarAluno(Aluno aluno)`: Verifica se um aluno está presente no conjunto.
- `exibirAlunos()`: Exibe todos os alunos do conjunto.
</p>

### 2. Conjunto de Números Primos
<p>
Crie uma classe chamada "ConjuntoNumerosPrimos" que possui um conjunto de números inteiros primos como atributo. Implemente os seguintes métodos:

- `adicionarNumeroPrimo(int numero)`: Adiciona um número primo ao conjunto.
- `removerNumeroPrimo(int numero)`: Remove um número primo do conjunto.
- `verificarNumeroPrimo(int numero)`: Verifica se um número está presente no conjunto de números primos.
- `exibirNumerosPrimos()`: Exibe todos os números primos do conjunto.
</p>

### 3. Conjunto de Palavras Únicas
<p>
Crie uma classe chamada "ConjuntoPalavrasUnicas" que possui um conjunto de palavras únicas como atributo. Implemente os seguintes métodos:

- `adicionarPalavra(String palavra)`: Adiciona uma palavra ao conjunto.
- `removerPalavra(String palavra)`: Remove uma palavra do conjunto.
- `verificarPalavra(String palavra)`: Verifica se uma palavra está presente no conjunto.
- `exibirPalavrasUnicas()`: Exibe todas as palavras únicas do conjunto.
</p>

----

## Pesquisa em Set

### 1. Agenda de Contatos
<p>
Crie uma classe chamada "AgendaContatos" que possui um conjunto de objetos do tipo "Contato" como atributo. Cada contato possui atributos como nome e número de telefone. Implemente os seguintes métodos:

- `adicionarContato(Contato contato)`: Adiciona um contato à agenda.
- `removerContato(Contato contato)`: Remove um contato da agenda, se estiver presente.
- `exibirContatos()`: Exibe todos os contatos da agenda.
- `pesquisarPorNome(String nome)`: Pesquisa contatos pelo nome e retorna uma lista com os contatos encontrados.
- `contarContatos()`: Conta o número total de contatos na agenda.
- `obterContato(String nome)`: Retorna o contato com o nome especificado, se estiver presente.
- `atualizarNumeroContato(String nome, String novoNumero)`: Atualiza o número de telefone de um contato específico.
</p>

### 2. Lista de Tarefas
<p>
Crie uma classe chamada "ListaTarefas" que possui um conjunto de objetos do tipo "Tarefa" como atributo. Cada tarefa possui um atributo de descrição e um atributo booleano para indicar se a tarefa foi concluída ou não. Implemente os seguintes métodos:

- `adicionarTarefa(Tarefa tarefa)`: Adiciona uma nova tarefa à lista.
- `removerTarefa(Tarefa tarefa)`: Remove uma tarefa da lista, se estiver presente.
- `exibirTarefas()`: Exibe todas as tarefas da lista.
- `contarTarefas()`: Conta o número total de tarefas na lista.
- `obterTarefasConcluidas()`: Retorna uma lista com as tarefas concluídas.
- `obterTarefasPendentes()`: Retorna uma lista com as tarefas pendentes.
- `marcarTarefaConcluida(Tarefa tarefa)`: Marca uma tarefa como concluída.
- `marcarTarefaPendente(Tarefa tarefa)`: Marca uma tarefa como pendente.
- `limparListaTarefas()`: Remove todas as tarefas da lista.
</p>

### 3. Lista de Compras
<p>
Crie uma classe chamada "ListaCompras" que possui um conjunto de objetos do tipo "Item" e quantidade como atributos. Cada item possui atributos como nome e valor. Implemente os seguintes métodos:

- `adicionarItem(Item item)`: Adiciona um item à lista de compras.
- `removerItem(Item item)`: Remove um item da lista de compras, se estiver presente.
- `exibirItens()`: Exibe todos os itens da lista de compras.
- `pesquisarPorNome(String nome)`: Pesquisa itens pelo nome e retorna uma lista com os itens encontrados.
- `contarItens()`: Conta o número total de itens na lista de compras.
- `obterValorTotal()`: Calcula e retorna o valor total de todos os itens da lista.
- `atualizarQuantidadeItem(Item item, int quantidade)`: Atualiza a quantidade de um item específico.
</p>

---

## Ordenação em Set

### 1. Cadastro de Produtos
<p>
Crie uma classe chamada "CadastroProdutos" que possui um conjunto de objetos do tipo "Produto" como atributo. Cada produto possui atributos como nome, preço e quantidade. Implemente os seguintes métodos:

- `adicionarProduto(Produto produto)`: Adiciona um produto ao cadastro.
- `removerProduto(Produto produto)`: Remove um produto do cadastro, se estiver presente.
- `exibirProdutosPorNome()`: Exibe todos os produtos do cadastro em ordem alfabética pelo nome.
- `exibirProdutosPorPreco()`: Exibe todos os produtos do cadastro em ordem crescente de preço.
- `exibirProdutosPorQuantidade()`: Exibe todos os produtos do cadastro em ordem decrescente de quantidade.
</p>

### 2. Lista de Tarefas por Prioridade
<p>
Crie uma classe chamada "ListaTarefas" que possui um conjunto de objetos do tipo "Tarefa" como atributo. Cada tarefa possui atributos como descrição e prioridade. Implemente os seguintes métodos:

- `adicionarTarefa(Tarefa tarefa)`: Adiciona uma tarefa à lista.
- `removerTarefa(Tarefa tarefa)`: Remove uma tarefa da lista, se estiver presente.
- `exibirTarefasPorDescricao()`: Exibe todas as tarefas da lista em ordem alfabética pela descrição.
- `exibirTarefasPorPrioridade()`: Exibe todas as tarefas da lista em ordem crescente de prioridade.
</p>

### 3.  Lista de Alunos por Nota
<p>
Crie uma classe chamada "ListaAlunos" que possui um conjunto de objetos do tipo "Aluno" como atributo. Cada aluno possui atributos como nome e nota. Implemente os seguintes métodos:

- `adicionarAluno(Aluno aluno)`: Adiciona um aluno à lista.
- `removerAluno(Aluno aluno)`: Remove um aluno da lista, se estiver presente.
- `exibirAlunosPorNome()`: Exibe todos os alunos da lista em ordem alfabética pelo nome.
- `exibirAlunosPorNota()`: Exibe todos os alunos da lista em ordem decrescente de nota.
</p>

---
### Dúvidas e Suporte

Caso você tenha alguma dúvida, problema ou sugestão, fique à vontade para abrir uma issue no repositório. Espero conseguir te ajudar! (: