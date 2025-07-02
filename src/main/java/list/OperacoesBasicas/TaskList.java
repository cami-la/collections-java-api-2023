package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
  //atributo
 
  private List<Task> tasksList;

  public TaskList() {
    this.tasksList = new ArrayList<>();

  }

  // métodos
  public void addTask(String description) {
    tasksList.add(new Task(description));
  }

  public void removeTask(String description) {
    List<Task> tasksToRemove = new ArrayList<>();
    for (Task task : tasksList) {
      if (task.getDescription().equalsIgnoreCase(description)) {
        tasksToRemove.add(task);
      }
    }
    tasksList.removeAll(tasksToRemove);
  }

  public int getTaskCount() {
    return tasksList.size(); // retorna o número de tarefas na lista
  }

  public void getTaskDescriptions() {
    System.out.println(tasksList);
    }
  
    // to string
  

  public static void main(String[] args) {
    

    TaskList taskList = new TaskList();
    System.out.println("Número de tarefas: " + taskList.getTaskCount());
    taskList.getTaskDescriptions();
    System.out.println("");


    taskList.addTask("Estudar Java");
    taskList.addTask("Fazer compras");
    taskList.addTask("Lavar o carro");
    System.out.println("Número de tarefas: " + taskList.getTaskCount());
    taskList.getTaskDescriptions();
    System.out.println("");

    taskList.removeTask("Fazer compras");
    System.out.println("Número de tarefas após remoção: " + taskList.getTaskCount());
    taskList.getTaskDescriptions();
  }



  }


  
  
  
