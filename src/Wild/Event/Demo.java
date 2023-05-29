package Wild.Event;

public class Demo {
    public static void main(String[] args) {
        Event e1 = new Event (EventType.KONZERT, "Event1", "Graz", 38.9);
        Event e2 = new Event(EventType.REISE, "Event2", "London",234.6);
        Event e3 = new Event(EventType.KONZERT, "Event3", "Wien", 33.4);
        Event e4 = new Event(EventType.KONZERT, "Event3", "Wien", 33.4);

        EventCalendar eventCalendar = new EventCalendar();
        eventCalendar.add(e1);
        eventCalendar.add(e2);
        eventCalendar.add(e3);


        eventCalendar.print();

        Event event2 = eventCalendar.getByTitle("Event2");
        System.out.println(event2);
        System.out.println(eventCalendar.getByTitle("Event2"));

        System.out.println(eventCalendar.getByType(EventType.KONZERT));
        eventCalendar.add(e4);
        System.out.println(eventCalendar.getByOrt("Wien"));

        System.out.println(eventCalendar.getMostExpensive());
    eventCalendar.removeExpensive3(230.0); // Entfernt teuerstes Wild.Event
eventCalendar.print(); // gibt Eventkalender mit allen Events aus
    }
}
