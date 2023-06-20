package main.java.set.Ordenacao;

import java.util.*;

public class GerenciadorAlunos {
  //atributos
  private Set<Aluno> alunos;

  public GerenciadorAlunos() {
    this.alunos = new HashSet<>();
  }

  public void adicionarAluno(Aluno aluno) {
    alunos.add(aluno);
  }

  public void removerAlunoPorMatricula(long matricula) {
    Iterator<Aluno> iterator = alunos.iterator();
    while (iterator.hasNext()) {
      Aluno next = iterator.next();
      if (next.getMatricula() == matricula) {
        iterator.remove();
      }
    }
  }

  public Set<Aluno> getAlunos() {
    return alunos;
  }

  public void exibirAlunosPorNome() {
    Set<Aluno> alunosPorNome = new TreeSet<>(alunos);
    System.out.println(alunosPorNome);
  }

  public void exibirAlunosPorNota() {
    Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorNota());
    alunosPorNota.addAll(alunos);
    System.out.println(alunosPorNota);
  }

  public static void main(String[] args) {
    GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();
    gerenciadorAlunos.adicionarAluno(new Aluno("Aluno 1", 123456l, 6d));
    gerenciadorAlunos.adicionarAluno(new Aluno("Aluno 2", 1234567l, 8d));
    gerenciadorAlunos.adicionarAluno(new Aluno("Aluno 3", 12345678l, 1d));
    gerenciadorAlunos.adicionarAluno(new Aluno("Aluno 4", 123456789l, 9d));
    gerenciadorAlunos.exibirAlunosPorNome();
    gerenciadorAlunos.exibirAlunosPorNota();
  }
}
