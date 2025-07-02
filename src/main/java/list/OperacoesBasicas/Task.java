package main.java.list.OperacoesBasicas;

public class Task {

    private String description;

    public Task(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    // to string
    @Override
    public String toString() {
        return description;
    }
    
}
