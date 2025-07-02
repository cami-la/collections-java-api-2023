package main.java.list.Ordenacao;

import java.util.Comparator;

public class Person implements Comparable<Person>{

    // atributos
    private String name;
    private double height;
    private int age;
    
    // Construtor
    public Person(String name, double height, int age) {
        this.name = name;
        this.height = height;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }


    // comparable
    @Override
    public int compareTo(Person p) {
        return Integer.compare(age, p.getAge());
}
    


    // método to string
    
    @Override
    public String toString() {
        
        return String.format("[Nome: %s | Idade: %d | Altura: %.2f]", name, age, height);

    }
    
    
    // comparator para altura
    public static class ComparatorByHeight implements Comparator<Person> {
        @Override
        public int compare(Person p1, Person p2) {
            return Double.compare(p1.getHeight(), p2.getHeight());
        }
}
    

}
