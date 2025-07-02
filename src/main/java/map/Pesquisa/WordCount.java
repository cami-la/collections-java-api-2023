package main.java.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class WordCount {



    private Map<String, Integer> wordCount;

    // construtor
    public WordCount() {
        this.wordCount =  new HashMap<>();
    }
    

    // adicionar palavra
    public void addWord(String word, Integer count){
        wordCount.put(word, count);
    }
    
    // contagem de palavras
    public void showWordCount(){
        if(!wordCount.isEmpty()){
            System.out.println("Contagem de palavras: " + wordCount);
        }
        else{
            System.out.println("A lista está vazia");
        }
    }

    //remover palavras
    public void removeWord(String word){
        if(!wordCount.isEmpty()){
            System.out.println("Removendo palavra...");
            wordCount.remove(word);
        }
        else{
            System.out.println("A lista está vazia");
        }
        

    }
    //encontrarPalavraMaisFrequente()
    public String wordFrequency(){
        String wordString = null;
        int bigNumber = 0;

        if (!wordCount.isEmpty()) {
            for (String w : wordCount.keySet()){ // .keySet() retorna um conjunto de chaves (palavras) do mapa
                if(wordCount.get(w) > bigNumber){ //.get(w) retorna o valor inteiro associado à palavra
                    wordString = w;
                    bigNumber = wordCount.get(w);
                }

            }
        }
        System.out.printf("Palavra com maior contagem: " + wordString + " | Número: " + bigNumber);
        return wordString;
    }

    
    public static void main(String[] args) {
        
        WordCount count = new WordCount();

        count.showWordCount();

        count.addWord("C",1);
        count.addWord("Java",2);
        count.addWord("Python",3);
        count.addWord("JavaScript",6);
        count.addWord("C#",4);
        count.addWord("Assembly", 5);
        count.addWord("Ruby", 9);
        
        count.showWordCount();
        count.removeWord("Assembly");
        count.showWordCount();
        count.wordFrequency();
    }

}
