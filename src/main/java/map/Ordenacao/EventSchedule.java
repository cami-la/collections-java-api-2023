package main.java.map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class EventSchedule {

    private Map<LocalDate, Event> events;

    public EventSchedule() {
        this.events = new HashMap<>();
    }

    // métodos 
    //Adiciona um evento à agenda.
    public void addEvent(LocalDate date, String name, String atraction){
        events.put(date, new Event(name, atraction));

    }

    

    // exibirAgenda()`: Exibe a agenda de eventos em ordem crescente de data.
    public void showSchedule(){
        Map <LocalDate, Event> eventByDate = new TreeMap<>(events);
        System.out.println("Eventos: " + eventByDate);
        System.out.println("------------------");
    
    }

    public void nextEvent() {
    LocalDate today = LocalDate.now();
    Map<LocalDate, Event> nextEvent = new TreeMap<>(events);
    for (var entry : nextEvent.entrySet()) {   // var entry: percorre o mapa, no caso var é o tipo de dado que é uma entrada do mapa, ou seja, uma data e um evento.
        if (!entry.getKey().isBefore(today)) {   //getKey: pega a chave que é a data
            System.out.println("Próximo evento: " + entry.getKey() + entry.getValue());
            System.out.println("---------");
            return;
        }
    }
    System.out.println("Nenhum evento futuro encontrado.");
    System.out.println("---------");
}


    
    public static void main(String[] args) {

        EventSchedule eventsList = new EventSchedule();

        eventsList.addEvent(LocalDate.of(2025, Month.JULY, 15), "Conferência de Tecnologia parte 2", "Mudanças na Inteligência Artificial");
        eventsList.addEvent(LocalDate.of(2025, Month.AUGUST, 12), "Workshop de Tecnologia" ,"Aula prática de desenvolvimento");
        eventsList.addEvent(LocalDate.of(2025, Month.JULY, 10), "Lançamento de software", "Software novo que possui IA integrada");
        eventsList.addEvent(LocalDate.of(2025, Month.AUGUST, 1), "Seminário de Inteligência Artificial" ,"O futuro da IA");
        eventsList.addEvent(LocalDate.of(2025, Month.JUNE, 1), "Conferência de Tecnologia parte 1" ,"IA no setor da Saúde");
        
        eventsList.showSchedule();
        eventsList.nextEvent();
    }   
}
