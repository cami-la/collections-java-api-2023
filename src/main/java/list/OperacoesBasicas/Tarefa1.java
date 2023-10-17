package main.java.list.OperacoesBasicas;

public class Tarefa1 {
    //atributo
    private String descricao;

    public Tarefa1(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }

    //este método toString(), cria um template para impressão de métodos que us
    @Override
    public String toString() {
        return descricao;
    }
}
