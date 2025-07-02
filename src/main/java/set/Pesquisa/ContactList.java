package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;



public class ContactList {

    private Set<Contact> contactsSetList;

    public ContactList() {
        this.contactsSetList = new HashSet<>();
    }
    
    public void addContact(String name, int phone){
        contactsSetList.add(new Contact(name, phone));
    }

    public void showContacts(){
        System.out.println("Lista de contatos: " + contactsSetList);
    }

    public Set<Contact> searchForName(String name){
        Set<Contact> contactName = new HashSet<>();
        if (!contactsSetList.isEmpty()){
            for(Contact person : contactsSetList){
                if (person.getName().equalsIgnoreCase(name)){
                    contactName.add(person);
                }
            }
        }

        return contactName;
        
        }

        

    public Contact updateContact (String name, int phoneNew) {
        Contact contactNew = null; 
        if(contactsSetList.isEmpty()){
            throw new RuntimeException("A lista está vazia.");
        }
        else {
            for (Contact person : contactsSetList) {
                if(person.getName().equals(name)){
                    person.setPhone(phoneNew);
                    contactNew = person;
                    break;
                }
            }
            return contactNew;    
            }
        }

    public static void main(String[] args) {

        ContactList contact = new ContactList();

        contact.showContacts();
        System.out.println("Adicionado contatos...");
        contact.addContact("Carla Santos", 99999999);
        contact.addContact("João Silva", 99999997);
        contact.addContact("Leon Kennedy", 98999997);
        contact.addContact("Maria Lourdes", 98999897);
        contact.addContact("Maria Souza", 98898896);
        contact.addContact("Maria Souza", 98895896); // repetido pra testar
        contact.showContacts();
        System.out.println("-----------");

        System.out.println("Procurando contatos...");
        Set<Contact> contactName = contact.searchForName("Maria Lourdes");
        System.out.println(contactName);
        System.out.println("-----------");

        // Atualizando Contato
        Contact contactNew = contact.updateContact("Maria Lourdes", 999989999);
        System.out.println("Contato Atualizado: " + contactNew);

        
    }

    }
    



