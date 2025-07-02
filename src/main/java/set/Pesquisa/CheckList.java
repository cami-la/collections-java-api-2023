package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class CheckList {

    private Set<Task> checkList;

    public CheckList() {
        this.checkList = new HashSet<>();

    }


    public void addTask(String description) {
        checkList.add(new Task(description, false));
    }

    public void removeTask(String description){
        Task taskToRemove = null;
        if (checkList.isEmpty()){
            throw new RuntimeException("A lista está vazia.");

        }else{
            for (Task task : checkList){
                if(task.getDescription().equalsIgnoreCase(description)){
                    taskToRemove = task;
                    break;
                }
            }
            checkList.remove(taskToRemove);
    }
    }

    public void showTasks(){
        System.out.println("Listas de tarefas: " + checkList);
        System.out.println("------------");
    }

    public int countTasks(){
        return checkList.size();
    }

    public void checkComplete(String description) {
    if (checkList.isEmpty()) {
        throw new RuntimeException("A lista está vazia.");
    } else {
        for (Task task : checkList) {
            if (task.getDescription().equalsIgnoreCase(description)) {
                task.setCompleted(true);
            }
        }
        
    }
}

    public void checkImcomplete(String description) {
    if (checkList.isEmpty()) {
        throw new RuntimeException("A lista está vazia.");

    } else {
        for (Task task : checkList) {
            if (task.getDescription().equalsIgnoreCase(description)) {
                task.setCompleted(false);
            }
        }
      
    }

}

     public Set<Task> completedTasks (){
        Set<Task> completedTasksList = new HashSet<>();
        if (!checkList.isEmpty()){
            for (Task taskC : checkList){
                if (taskC.isCompleted() == true) {
                    completedTasksList.add(taskC);
                }
            }
        }
        return completedTasksList;
        
    }


    public Set<Task> imcompletedTasks (){
        Set<Task> imcompletedTasksList = new HashSet<>();
        if (!checkList.isEmpty()){
            for (Task taskI : checkList){
                if (taskI.isCompleted() == false) {
                    imcompletedTasksList.add(taskI);
                }
            }
        }
        return imcompletedTasksList;
        
    }

    public void removeAllTasks (){
        System.out.println("--------------");
        System.out.println("Removendo Tarefas...");
        checkList.clear();
    }

    
    public static void main(String[] args) {
        
    CheckList taskList = new CheckList();

       taskList.showTasks();
       System.out.println("Adicionando tarefas...");
       taskList.addTask("Varrer o chão");
       taskList.addTask("Lavar Louça");
       taskList.addTask("Limpar o quarto");
       taskList.addTask("Limpar o banheiro");

       System.out.println("Número de tarefas: " + taskList.countTasks());
       taskList.showTasks();

       System.out.println("Removendo tarefas...");
       taskList.removeTask("Limpar o banheiro");
       System.out.println("Número de tarefas: " + taskList.countTasks());
       taskList.showTasks();

       System.out.println("Concluindo Tarefas...");
       taskList.checkComplete("Varrer o chão");
       taskList.checkComplete("Lavar Louça");
       System.out.println("Número de tarefas: " + taskList.countTasks());
       taskList.showTasks();

       System.out.println("Tarefas Pendentes...");
       taskList.checkImcomplete("Varrer o chão");
       System.out.println("Número de tarefas: " + taskList.countTasks());
       taskList.showTasks();

       System.out.println("Verificando Tarefas...");
       Set<Task> completed = taskList.completedTasks();
       System.out.println("Tarefas Completadas: " + completed);
       Set<Task> imcompleted = taskList.imcompletedTasks();
       System.out.println("Tarefas Pendentes: " + imcompleted);
       
       
       taskList.removeAllTasks();
       System.out.println("Número de tarefas: " + taskList.countTasks());
       taskList.showTasks();
       
    }
}
