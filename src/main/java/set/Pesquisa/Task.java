package main.java.set.Pesquisa;

public class Task {
    
    private String description;
    private boolean completed;
    
    // Construtor
    public Task(String description, boolean completed) {
        this.description = description;
        this.completed = completed;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    @Override
    public String toString() {
        return String.format("[Descrição: %s | Completado: %s]", description, completed);
    }

    
    

    

}
