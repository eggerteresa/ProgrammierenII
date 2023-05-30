package Eventkalender;

public class EventMain {
    public static void main(String[] args) {
        Event e1 = new Event("konzert1", "linz", 130);
        Event e2 = new Event("konzert2", "wien", 150);
        Event e3 = new Event("konzert3", "salzburg", 140);
        Event e4= new Event("konzert4", "linz", 200);
        Event e5 = new Event("konzert5", "wien", 100);


        EventKalender kalender = new EventKalender();

        kalender.addEvents(e1);
        kalender.addEvents(e2);
        kalender.addEvents(e3);
        kalender.addEvents(e4);
        kalender.addEvents(e5);

        System.out.println(kalender);
        System.out.println("events in linz");
        System.out.println(kalender.getByOrt("linz"));
        System.out.println("avg preis in linz");
        System.out.println(kalender.getAvgPreisByOrt("linz"));
        System.out.println("events");
        System.out.println(kalender.getEvents());
        System.out.println("events zwischen 100 und 140");
        System.out.println(kalender.getByEintrittsPreis(100, 140));
        System.out.println("events nach ort");
        System.out.println(kalender.getCountEventsByOrt());
        System.out.println("summe der Preise per Ort");
        System.out.println(kalender.getSumPriceEventsbyOrt());
        System.out.println("teuerstes in Wien");
        System.out.println(kalender.getMostExpensivebyOrt("wien"));

    }
}
