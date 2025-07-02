package main.java.set.OperacoesBasicas;

import java.util.Objects;

public class Guest {

    private String name;
    private int invitationCode;
    
    //Construtor
    public Guest(String name, int invitationCode) {
        this.name = name;
        this.invitationCode = invitationCode;
    }

    //Get e set
    public String getName() {
        return name;
    }

    public int getInvitationCode() {
        return invitationCode;
    }

    @Override
    public String toString() {
        return String.format("[Nome: %s | Convite nº : %d ]", name, invitationCode);
    }

    // para evitar convites repertidos
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Guest guest)) return false;
        return getInvitationCode() == guest.getInvitationCode();
        
    }
        
    @Override
    public int hashCode() {
        return Objects.hash(getInvitationCode());
    }
}
