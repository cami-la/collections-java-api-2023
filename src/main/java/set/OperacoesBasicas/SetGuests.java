package main.java.set.OperacoesBasicas;


import java.util.HashSet;

import java.util.Set;

public class SetGuests {

    private Set<Guest> guestList;

    public SetGuests() {
        this.guestList = new HashSet<>();
    }

    public void addGuest (String name, int invitationCode){
        guestList.add(new Guest(name, invitationCode));
    }

    public void removeGuest (int invitationCode){
        Guest guestToRemove = null;
        for (Guest g : guestList){
            if(g.getInvitationCode() == invitationCode){
                guestToRemove = g;
                break;
            }
            
        }
        guestList.remove(guestToRemove);
    }
    
    // contar convidados com método set
    public int countGuests (){
        return guestList.size();
    }

    public void printGuests() {
        System.out.println("Agenda de contatos: " + guestList);
    }

    
    public static void main(String[] args) {
        
        SetGuests guests = new SetGuests();

        guests.printGuests();
        System.out.println("----------------");
        System.out.println("Adicionando convidados...");

        guests.addGuest("Camila", 1);
        guests.addGuest("Carlos", 2);
        guests.addGuest("Camila", 3);
        guests.addGuest("Renan", 4);
        guests.addGuest("Sarah", 5);
        guests.addGuest("Leon", 6);
        guests.addGuest("Lion", 6); // para verificar erro e se aparece na lista

        guests.printGuests();
        System.out.println("----------------");
        System.out.println("Número de convidados: " + guests.countGuests());
        
        System.out.println("----------------");
        System.out.println("Removendo convidados...");
        guests.removeGuest(3);

        guests.printGuests();
        System.out.println("----------------");
        System.out.println("Número de convidados: " + guests.countGuests());


    }
    


}
