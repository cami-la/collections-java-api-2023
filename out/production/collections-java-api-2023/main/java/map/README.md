# MAP

<p align="center">
<img src="../../../../assets/image/map-interface-hierarchy.png" alt="Map interface hierarchy Java"><br>
<a href="https://data-flair.training/blogs/collection-framework-in-java/">Hierarchy of Collection Framework in Java </a>
</p>

- A interface `Map` é usada para mapear dados na forma de chaves e valores.
- O `Map` do Java é um objeto que mapeia chaves para valores.
- Um `Map` não pode conter chaves duplicadas: cada chave pode mapear para no máximo um valor.
- A plataforma Java possui três implementações gerais de `Map`: `HashMap`, `TreeMap` e `LinkedHashMap`.
- As operações básicas do `Map` são: put (inserir), get (obter), containsKey (verificar se contém uma chave), containsValue (verificar se contém um valor), size (obter o tamanho) e isEmpty (verificar se está vazio).

> ##### *HashTable* é uma implementação antiga da interface Map no Java que é sincronizada e thread-safe, tornando-a adequada para uso em ambientes concorrentes. Ela não permite chaves ou valores nulos e os elementos não são mantidos em uma ordem específica.

> ##### *LinkedHashMap*, por outro lado, é uma implementação da interface Map que preserva a ordem de inserção dos elementos. Cada elemento possui referências ao próximo e ao anterior, formando uma lista encadeada. Isso permite que os elementos sejam iterados na ordem em que foram inseridos. Além disso, o LinkedHashMap também permite chaves ou valores nulos.

> ##### *HashMap* é uma implementação da interface Map que não mantém uma ordem específica dos elementos. Ele armazena os elementos internamente usando uma função de hash para melhorar a eficiência das operações de pesquisa e acesso. O HashMap também permite chaves ou valores nulos.

### Referências:

[1] "Collections in Java Tutorial." DigitalOcean Community. Disponível em: https://www.digitalocean.com/community/tutorials/collections-in-java-tutorial.

[2] "Java™ Platform, Standard Edition 17 API Specification - Class Map." Oracle. Disponível em: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Map.html.

<br>

# Fixando os Conhecimentos

Exercícios:

1. Operações Básicas com Map
3. Pesquisa em Map
4. Ordenação nas Map

## Operações Básicas com Map

### 1. Agenda de Contatos
<p>
Crie uma classe chamada "AgendaContatos" que utilize um Map para armazenar os contatos. Cada contato possui um nome como chave e um número de telefone como valor. Implemente os seguintes métodos:

- `adicionarContato(String nome, String telefone)`: Adiciona um contato à agenda, associando o nome do contato ao número de telefone correspondente.
- `removerContato(String nome)`: Remove um contato da agenda, dado o nome do contato.
- `exibirContatos()`: Exibe todos os contatos da agenda, mostrando o nome e o número de telefone de cada contato.
- `pesquisarPorNome(String nome)`: Pesquisa um contato pelo nome e retorna o número de telefone correspondente.
</p>

### 2.  Dicionário
<p>
Crie uma classe chamada "Dicionario" que utilize um Map para armazenar palavras e suas respectivas definições. Implemente os seguintes métodos:

- `adicionarPalavra(String palavra, String definicao)`: Adiciona uma palavra e sua definição ao dicionário, associando a palavra à sua definição correspondente.
- `removerPalavra(String palavra)`: Remove uma palavra do dicionário, dado o termo a ser removido.
- `exibirPalavras()`: Exibe todas as palavras e suas definições do dicionário, mostrando cada palavra seguida de sua respectiva definição.
- `pesquisarPorPalavra(String palavra)`: Pesquisa uma palavra no dicionário e retorna sua definição correspondente.
</p>

### 3. Estoque de Produtos
<p>
Crie uma classe chamada "EstoqueProdutos" que utilize um Map para armazenar produtos e suas quantidades em estoque. Cada produto possui um nome como chave e um valor inteiro representando a quantidade em estoque como valor. Implemente os seguintes métodos:

- `adicionarProduto(String nome, int quantidade)`: Adiciona um produto ao estoque, juntamente com a quantidade disponível.
- `removerProduto(String nome)`: Remove um produto do estoque, dado o nome do produto.
- `exibirProdutos()`: Exibe todos os produtos e suas quantidades em estoque, mostrando o nome do produto seguido de sua quantidade disponível.
- `pesquisarPorProduto(String nome)`: Pesquisa um produto no estoque e retorna a quantidade disponível correspondente.
</p>

---

## Pesquisa em Map

### 1. Estoque de Produtos com Preço

Crie uma classe chamada "EstoqueProdutos" que utilize um Map para armazenar os produtos, suas quantidades em estoque e seus respectivos preços. Cada produto possui um nome como chave e um objeto Produto como valor, contendo quantidade e preço. Implemente os seguintes métodos:

- `adicionarProduto(String nome, int quantidade, double preco)`: Adiciona um produto ao estoque, juntamente com a quantidade disponível e o preço.
- `removerProduto(String nome)`: Remove um produto do estoque, dado o nome do produto.
- `exibirProdutos()`: Exibe todos os produtos, suas quantidades em estoque e preços.
- `calcularValorTotalEstoque()`: Calcula e retorna o valor total do estoque, considerando a quantidade e o preço de cada produto.
-  `obterProdutoMaisCaro()`: Retorna o produto mais caro do estoque, ou seja, aquele com o maior preço.
- `obterProdutoMaisBarato()`: Retorna o produto mais barato do estoque, ou seja, aquele com o menor preço.
- `obterProdutoMaiorQuantidadeValorTotalNoEstoque()`: Retorna o produto que está em maior quantidade no estoque, considerando o valor total de cada produto (quantidade * preço).

### 2. Contagem de Palavras
<p>
Crie uma classe chamada "ContagemPalavras" que utilize um Map para armazenar as palavras e a quantidade de vezes que cada palavra aparece em um texto. Implemente os seguintes métodos:

- `adicionarPalavra(String palavra)`: Adiciona uma palavra à contagem.
- `removerPalavra(String palavra)`: Remove uma palavra da contagem, se estiver presente.
- `exibirContagemPalavras()`: Exibe todas as palavras e suas respectivas contagens.
- `encontrarPalavraMaisFrequente()`: Encontra a palavra mais frequente no texto e retorna a palavra e sua contagem.
</p>

### 3. Controle de Alunos
<p>
Crie uma classe chamada "ControleAlunos" que utilize um `Map` para armazenar os alunos e suas respectivas notas. Cada aluno é representado por um objeto da classe "Aluno", que possui atributos como matrícula, nome e uma lista de notas. Implemente os seguintes métodos:

- `adicionarAluno(Aluno aluno)`: Adiciona um aluno ao controle de alunos. A matrícula do aluno é utilizada como chave no Map.
- `removerAluno(String matricula)`: Remove um aluno do controle, dado o número de matrícula.
- `adicionarNota(String matricula, double nota)`: Adiciona uma nota ao aluno especificado, utilizando a matrícula como identificador.
- `removerNota(String matricula, double nota)`: Remove uma nota do aluno especificado, utilizando a matrícula como identificador.
- `exibirNotas(String matricula)`: Exibe todas as notas do aluno especificado, utilizando a matrícula como identificador.
- `calcularMedia(String matricula)`: Calcula a média das notas do aluno especificado, utilizando a matrícula como identificador, e retorna o valor.
- `exibirMelhorAluno()`: Encontra o aluno com a maior média e retorna seu nome, matrícula e média.
</p>

---

## Ordenação nos Map

### 1. Agenda de Eventos

Crie uma classe chamada "AgendaEventos" que utilize um `Map` para armazenar os eventos e suas respectivas datas. Cada evento é representado por um objeto da classe "Evento", que possui atributos como nome e uma lista de atrações. Implemente os seguintes métodos:

- `adicionarEvento(Evento evento)`: Adiciona um evento à agenda.
- `removerEvento(String nome)`: Remove um evento da agenda, dado o nome do evento.
- `exibirAgenda()`: Exibe a agenda de eventos em ordem crescente de data.
- `obterProximoEvento()`: Retorna o próximo evento que ocorrerá.
- `contarEventosNoMes(int mes, int ano)`: Retorna a quantidade de eventos que ocorreram em um determinado mês e ano.
- `contarAtracoes(String nomeAtracao)`: Retorna a quantidade de vezes que uma determinada atração se apresentou em todos os eventos da agenda.

### 2. Ranking de Alunos
<p>
Crie uma classe chamada "RankingAlunos" que utilize um Map para armazenar os alunos e suas respectivas notas. Cada aluno é representado por um objeto da classe "Aluno", que possui atributos como nome e nota. Implemente os seguintes métodos:

- `adicionarAluno(Aluno aluno)`: Adiciona um aluno ao ranking.
- `removerAluno(String nome)`: Remove um aluno do ranking, dado o nome do aluno.
- `exibirRanking()`: Exibe o ranking dos alunos em ordem decrescente de nota.
- `exibirMelhorAluno()`: Retorna o aluno com a maior nota.
</p>

### 3. Livraria Online
<p>
Crie uma classe chamada "LivrariaOnline" que representa uma livraria online. Essa classe utiliza um Map para armazenar os livros disponíveis na livraria, utilizando o ISBN (International Standard Book Number) como chave e um objeto da classe "Livro" como valor.

A classe "Livro" possui atributos como título, autor e preço. Através da classe "LivrariaOnline", implemente os seguintes métodos:

- `adicionarLivro(Livro livro)`: Adiciona um livro à livraria, utilizando o ISBN como chave no Map.
- `removerLivro(String ISBN)`: Remove um livro da livraria, dado o ISBN do livro.
- `exibirLivrosOrdenadosPorPreco()`: Exibe os livros da livraria em ordem crescente de preço.
- `pesquisarLivrosPorAutor(String autor)`: Retorna uma lista de todos os livros escritos por um determinado autor.
- `obterLivroMaisCaro()`: Retorna o livro mais caro disponível na livraria.
- `exibirLivroMaisBarato()`: Retorna o livro mais barato disponível na livraria.
</p>

### Dúvidas e Suporte

Caso você tenha alguma dúvida, problema ou sugestão, fique à vontade para abrir uma issue no repositório. Espero conseguir te ajudar! (: