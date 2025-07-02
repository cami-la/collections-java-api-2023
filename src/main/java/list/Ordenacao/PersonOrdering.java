package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import main.java.list.Ordenacao.Person.ComparatorByHeight;

public class PersonOrdering {

    private List<Person> person;

    // construtor
    public PersonOrdering() {
        this.person = new ArrayList<>();
    }

    


    public void addPerson (String name, int age, double height){
        person.add(new Person(name, height, age));
    }

    public List<Person> orderByAge(){
        List<Person> personByAge = new ArrayList<>(person);

        if (person.isEmpty()) {
            throw new IllegalStateException("A lista está vazia.");
        }
        else {
            Collections.sort(personByAge);
            return personByAge;
        }
    }

    public List<Person> orderByHeight(){
        List<Person> personByHeight = new ArrayList<>(person);
        if (person.isEmpty()) {
            throw new IllegalStateException("A lista está vazia.");
        }
        else {
            Collections.sort(personByHeight, new ComparatorByHeight());
            return personByHeight;
        }

    }
    @Override
    public String toString() {
        return "Lista de Pessoas:\n" +
            String.join("\n", 
                person.stream()
                    .map(p -> p.toString())
                    .toList()
            );
    }



    public static void main(String[] args) {
        
        PersonOrdering personOrder = new PersonOrdering();

        System.out.println(personOrder);
        System.out.println("------------");

        // Adcionando pessoas
        personOrder.addPerson("Carlos", 20, 1.80);
        personOrder.addPerson("Maria", 35, 1.60);
        personOrder.addPerson("João", 10, 1.20);
        personOrder.addPerson("Sarah", 16, 1.56);
        personOrder.addPerson("Daniel", 40, 1.75);

        System.out.println(personOrder);
        System.out.println("------------");

        //Order por idade
        System.out.println("Ordem por Idade: " + personOrder.orderByAge());
        System.out.println("------------");
        System.out.println("Ordem por tamanho:" +personOrder.orderByHeight());

    }


    


    


}
