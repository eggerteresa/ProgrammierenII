package Eventkalender;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class EventKalender {

    ArrayList<Event> events;

    public EventKalender() {
       events = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "EventKalender{" +
                "events=" + events +
                '}';
    }

    public ArrayList<Event> getEvents() {
        return events;
    }

    public void setEvents(ArrayList<Event> events) {
        this.events = events;
    }

    public void addEvents(Event e) {
        events.add(e);
    }

    public Event getByTitle(String title) {

        for (Event e : events) {
            if (e.equals(title)) {

                //System.out.println(e);
                return e;
            }
        }
        return null;
    }

    public ArrayList<Event> getByOrt(String ort) {

        ArrayList<Event> eventsOrt = new ArrayList<>();

        for (Event e : events) {
            if (e.getOrt().equals(ort)) {
                //System.out.println(e);
                eventsOrt.add(e);

            }
        }
        return eventsOrt;
    }


    public ArrayList<Event> getByEintrittsPreis(double min, double max) {

        ArrayList<Event> ergebnis = new ArrayList<>();

        for (Event e : events) {
            double preis = e.getEintrittspreis();
            if (preis >= min && preis <= max) {
                ergebnis.add(e);
            }
        }
        return ergebnis;

    }


    public Event getMostExpensivebyOrt(String ort) {
        Event ergebnis = null;


        for (Event e : events) {
            if (e.getOrt().equals(ort) && (ergebnis == null || e.getEintrittspreis() > ergebnis.getEintrittspreis())) {
                 ergebnis = e;

            }
        }
        return ergebnis;
    }

    public double getAvgPreisByOrt(String ort) {
        double erg = 0;
        int zaehler = 0;
        for (Event e : events) {
            if (e.getOrt().equals(ort)) {
                erg = erg + e.getEintrittspreis();
                zaehler = zaehler + 1;
            }


        }
        erg = erg / zaehler;
        return erg;


    }

    public HashMap<String, Integer> getCountEventsByOrt() {
        HashMap<String, Integer> ergebnis = new HashMap<>();


        for (Event e : events) {

            if (ergebnis.containsKey(e.getOrt())) {
                // ort already in hashmap
                ergebnis.put(e.getOrt(), 1 + ergebnis.get(e.getOrt()));
            } else {
                // ort not in hashmap
                ergebnis.put(e.getOrt(), 1);


            }



        } return ergebnis;
    }

    public HashMap <String, Double > getSumPriceEventsbyOrt() {
        HashMap <String, Double> ergebnis = new HashMap<>();


        for (Event e: events) {
            if(ergebnis.containsKey(e.getOrt())) {
                ergebnis.put(e.getOrt(), e.getEintrittspreis() + ergebnis.get(e.getOrt()));
            }
            else {

                ergebnis.put(e.getOrt(), e.getEintrittspreis());
            }
        }



        return ergebnis;
    }


}
