package Wild.Event;

import java.util.ArrayList;
import java.util.Iterator;

public class EventCalendar {
    private ArrayList<Event> events = new ArrayList<>();

    public EventCalendar() {
        events = new ArrayList<>();
    }

    public void add (Event e) {
        events.add(e);
    }

    public void print () {
        for (Event e : events) {
            System.out.println(e);
        }
        System.out.println();
    }
    public void print (ArrayList<Event> events) { // Scope - kann passieren, dass man Variablen verdeckt??
      for ( Event e : events) {// von außen übergeben, nicht das selbe wie oben
          System.out.println(e);
      }
        System.out.println();


    }

    public Event getByTitle(String title) {
        Event result = null;
        for (Event e: events) {
            String eventTitle = e.getTitle();
            if (e.getTitle().equals(title)) {
                result= e;
                break;
            }
        } return result;
    }


    public ArrayList<Event> getByType(EventType type) {
        ArrayList<Event> result = new ArrayList<>();
        for (int i = 0; i < events.size(); i++) {
            if (events.get(i).getType() == type) { // equals geht auch
                result.add(events.get(i));
            }
        }
        return result;
    }

    public ArrayList<Event> getByOrt(String ort) {
        ArrayList<Event> result = new ArrayList<>();
        for (int i = 0; i < events.size(); i++) {
            if (events.get(i).getOrt() == ort) { // equals geht auch
                result.add(events.get(i));
            }
        }
        return result;
    }


    public Event getMostExpensive() {
        double price=events.get(0).getPreis();
        Event result = events.get(0);

        for (Event e : events) {
            if (e.getPreis()>price) {
                price = e.getPreis();
                result = e; //Wichtig!! sonst falsches ergebnis!!
            }
        }return result;
    }

    public void removeExpensive3(double limit){
        Iterator<Event> it = events.iterator();
        while (it.hasNext()) {
            Event event = it.next();
            if (event.getPreis()>limit) {
                it.remove();
            }
        }
    }


}
