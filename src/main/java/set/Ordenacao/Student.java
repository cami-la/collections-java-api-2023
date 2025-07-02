package main.java.set.Ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Student implements Comparable<Student>{

    //Cada aluno terá atributos como nome, matrícula e nota.
    private String name;
    private long registration;
    private double averageGrade;
    
    public Student(String name, long registration, double averageGrade) {
        this.name = name;
        this.registration = registration;
        this.averageGrade = averageGrade;
    }

    public String getName() {
        return name;
    }

    public Long getRegistration() {
        return registration;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    @Override
    public String toString() {
        return String.format("[Nome: %s | Matrícula: %d | Nota: %.2f ]", name, registration, averageGrade);
    }

    // equals e hashcode: cada aluno tem uma matricula única
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Student student)) 
            return false;
        return getRegistration() == student.getRegistration();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRegistration());
    }

    // Comparar studante por nome
    @Override
    public int compareTo(Student student) {
         return name.compareToIgnoreCase(student.getName()); 
    }
    
    // Comparar por média 
    public static class ComparatorByAverage implements Comparator<Student>{
        @Override
        public int compare(Student s1, Student s2) {
            return Double.compare(s1.getAverageGrade(), s2.getAverageGrade());
        }

    }

    
}
