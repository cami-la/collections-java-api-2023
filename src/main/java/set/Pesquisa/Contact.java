package main.java.set.Pesquisa;

import java.util.Objects;

public class Contact {

    //  Cada contato possui atributos como nome e número de telefone. 

    private String name;
    private int phone;

    
    // Construtor
    public Contact(String name, int phone) {
        this.name = name;
        this.phone = phone;
    }
    


    public String getName() {
        return name;
    }
    public int getPhone() {
        return phone;
    }
    public void setPhone(int phone) {
        this.phone = phone;
    }

    // para Não repetir contatos
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof Contact contact)) return false;
        return Objects.equals(getName(), contact.getName());
    } 
    @Override
    public int hashCode() {
        return Objects.hash(getName());
  }

    @Override
    public String toString() {
        return String.format("[Nome: %s | Tel: %d ]", name, phone);
        
    }

    

}
