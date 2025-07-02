package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class ContactsList {

 //Atributo
    private Map <String, Integer> contactMap;

    public ContactsList() {
        this.contactMap = new HashMap<>();
    }

    public void addContact(String name, Integer phone){
        contactMap.put(name, phone);
    }

    public void removeContact (String name){
        if(contactMap.isEmpty()){
            throw new IllegalStateException("A lista está vazia.");
        }
        else{
            contactMap.remove(name);
        }
    }

    public void showContacts(){
        if (contactMap.isEmpty()){
            System.out.println("A lista está vazia: " + contactMap);
            System.out.println("-----------------");
        }
        else {
         System.out.println("Lista de contatos: " + contactMap);
         System.out.println("------------");
        }
    }
    
    public Integer searchByName(String name){
        Integer numberByName = null;
        if (contactMap.isEmpty()){
            throw new IllegalStateException("A lista está vazia.");
        }
        else {
            numberByName = contactMap.get(name);
            System.out.println("Retornando númeto de telefone: " + numberByName);
            return numberByName;
        }


    }

    public static void main(String[] args) {
        
        ContactsList contacts = new ContactsList();

        contacts.showContacts();

        contacts.addContact("Maria", 999990000);
        contacts.addContact("Jonas", 99999808);
        contacts.addContact("Mariana", 97997808);
        contacts.addContact("Vinicius", 97797888);
        contacts.addContact("Bárbara", 977977777);
        contacts.addContact("Jonas", 90909090); // para verificar 
        contacts.addContact("José", 90909090); // para verificar

        contacts.showContacts();

        contacts.removeContact("Mariana");
        contacts.showContacts();

        contacts.searchByName("Maria");
    }

    
}
