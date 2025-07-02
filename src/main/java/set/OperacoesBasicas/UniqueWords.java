package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class UniqueWords {


 private Set<String> uniqueWordsSet;

 public UniqueWords() {
    this.uniqueWordsSet = new HashSet<>();

 }


 public void addWord(String word){
    uniqueWordsSet.add(word);

 }

 // Remover palavras.
public void removeWord(String word){
    String wordToRemove = null;
    
    for (String w : uniqueWordsSet){
        if (w.equals(word)) {
            wordToRemove = w;
            break;
        }
    }
    if (wordToRemove != null) {
        uniqueWordsSet.remove(wordToRemove);
    }
}

public boolean checkWord (String word){
    if (uniqueWordsSet.isEmpty()) {
        throw new RuntimeException("A lista está vazia.");
    }
    else{
        if (uniqueWordsSet.contains(word)){
            System.out.println("A palavra \"" + word + "\" está presente no conjunto.");
            return true;
        } else {
            System.out.println("A palavra \"" + word + "\" NÃO está presente no conjunto.");
            return false;
        }
    }
    
}

public void printUniqueWords (){
     System.out.println(uniqueWordsSet);
}
 
public static void main(String[] args) {
    
    UniqueWords wordsSet = new UniqueWords();
    System.out.println("Lista de palavras únicas:");
    wordsSet.printUniqueWords();
    System.out.println("----------------------");

    System.out.println("Adicionando palavras...");
    wordsSet.addWord("Terra");
    wordsSet.addWord("Sol");
    wordsSet.addWord("Lua");
    wordsSet.addWord("Lua"); // repetida para testar
    wordsSet.addWord("Marte");
    System.out.println("Lista de palavras únicas:");
    wordsSet.printUniqueWords();
    System.out.println("----------------------");


    System.out.println("Removendo palavras...");
    wordsSet.removeWord("Lua");
    wordsSet.printUniqueWords();
    System.out.println("----------------------");


    wordsSet.checkWord("Sol");
    wordsSet.checkWord("Mercúrio");
    System.out.println("----------------------");

}
}
