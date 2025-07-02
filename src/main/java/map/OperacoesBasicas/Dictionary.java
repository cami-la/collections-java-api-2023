package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
     /*Crie uma classe chamada "Dicionario" que utilize um Map 
     para armazenar palavras e suas respectivas definições. Implemente os seguintes métodos:

- `adicionarPalavra(String palavra, String definicao)`: 
Adiciona uma palavra e sua definição ao dicionário, associando a palavra 
à sua definição correspondente.
- `removerPalavra(String palavra)`: Remove uma palavra do dicionário, dado o termo a ser removido.
- `exibirPalavras()`: Exibe todas as palavras e suas definições do dicionário, 
mostrando cada palavra seguida de sua respectiva definição.
- `pesquisarPorPalavra(String palavra)`: Pesquisa uma palavra no dicionário e 
retorna sua definição correspondente. */

    private Map <String, String> engPorDicitionary;

    public Dictionary() {
        this.engPorDicitionary = new HashMap<>();
    }
    
    // adiciona palavra 
    public void addWord (String word, String meaning){
        engPorDicitionary.put(word, meaning);
    }

    // deleta palavra
    public void removeWord(String word) {
        if(!engPorDicitionary.isEmpty()) {
            engPorDicitionary.remove(word);
        }
        else{
            System.out.println("O dicionário está vazio");
            System.out.println("-----------");
        }
    }

    // exibir dicionário
    public void showDictionary (){
        if(!engPorDicitionary.isEmpty()) {
            System.out.println("Exibindo o dicionário: " + engPorDicitionary);
            System.out.println("-----------");
        }
        else{
            System.out.println("O dicionário está vazio");
            System.out.println("-----------");
        }
    }

    // pesquisa por palavra
    public String searchByWord (String word){
        String wordAndDescrption = engPorDicitionary.get(word);
        if(engPorDicitionary.isEmpty()) {
            System.out.println("O dicionário está vazio");
            System.out.println("-----------");
        }
        else{
            if (wordAndDescrption != null){
                System.out.println("Buscando a definição: " + wordAndDescrption);
                return wordAndDescrption;
            }
        }
        return "Palavra não encontrada no dicionário.";
    }


    
    public static void main(String[] args) {
        
        Dictionary dictionary= new Dictionary();

        dictionary.showDictionary();

        dictionary.addWord("Throw", "Jogar Fora, arremessar");
        dictionary.addWord("Have", "Ter, possuir ou verbo auxiliar do present perfect");
        dictionary.addWord("Do", "Fazer ou verbo auxiliar do present simple");
        dictionary.addWord("Did", "Fez (passado) ou verbo auxiliar do passado");
        dictionary.addWord("Can", "Lata (refrigerante) ou verbo modal (poder, probabilidade, permissão)");
 
        dictionary.showDictionary();

        dictionary.removeWord("Throw");
        dictionary.showDictionary();


        dictionary.searchByWord("Can");
      
    }


}
