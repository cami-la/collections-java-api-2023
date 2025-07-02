package main.java.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import main.java.set.Ordenacao.Student.ComparatorByAverage;

public class StudentManagement {

  private Set<Student> studentsList;

  public StudentManagement() {
    this.studentsList = new HashSet<>();
  }

  /*- `adicionarAluno(String nome, Long matricula, double media)`: Adiciona um aluno ao conjunto.
- `removerAluno(long matricula)`: Remove um aluno ao conjunto a partir da matricula, se estiver presente.
- `exibirAlunosPorNome()`: Exibe todos os alunos do conjunto em ordem alfabética pelo nome.
- `exibirAlunosPorNota()`: Exibe todos os alunos do conjunto em ordem crescente de nota.
- `exibirAlunos()`: Exibe todos os alunos do conjunto. */

  public void addStudent(String name, Long Registration, double averageGrade) {
    studentsList.add(new Student(name, Registration, averageGrade));
  }

  public void removeStudent(long registration) {
    Student studentToRemove = null;
    for (Student s : studentsList) {
      if (s.getRegistration() == registration) {
        studentToRemove = s;
        break;
      }
    }
    studentsList.remove(studentToRemove);
  }

  public void showAllStudents() {
    System.out.println("Lista de alunos: " + studentsList);
    System.out.println("------------");
  }

  public Set<Student> showStudentsByName() {
    Set<Student> studentName = new TreeSet<>(studentsList);
    if (studentsList.isEmpty()) {
      throw new IllegalStateException("A lista está vazia.");
    } else {
      System.out.println("------------");
      return studentName;
      
    }
  }

  public Set<Student> showStudentsByAverage() {
    Set<Student> studentAverage = new TreeSet<>(new ComparatorByAverage());
    if (studentsList.isEmpty()) {
      throw new IllegalStateException("A lista está vazia.");
    } else {
      studentAverage.addAll(studentsList);
      System.out.println("------------");
      return studentAverage;
    }
  }



  public static void main(String[] args) {
    StudentManagement student = new StudentManagement();

    student.showAllStudents();

    System.out.println("Adicionando Alunos....");
    student.addStudent("Maria", 1L, 8.00);
    student.addStudent("João", 1L, 8.00); // teste para ver se repete
    student.addStudent("Jonas", 8L, 7.00);
    student.addStudent("Carla", 3L, 5.00);
    student.addStudent("Carla", 4L, 6.00);
    student.addStudent("Vanessa", 5L, 1.00);
    student.addStudent("Jorge", 6L, 8.50);
    student.addStudent("Vania", 7L, 8.70);
    student.showAllStudents();

    System.out.println("Removendo Alunos....");
    student.removeStudent(3);
    student.removeStudent(5);
    student.showAllStudents();


    System.out.println("Exibindo Alunos por nome....");
    System.out.println("Ordem alfabética: " + student.showStudentsByName());


    System.out.println("Exibindo Alunos por média....");
    System.out.println("Ordem por média: " + student.showStudentsByAverage());
  }
}
