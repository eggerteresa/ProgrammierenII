package Einheit1Hofer.Hasenuebung;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class HaseMain {
    public static void main(String[] args) {


        Hase h1 = new Hase("hasi", 10, 50);

        h1.hasefrisst();
        h1.hasehoppelt(10);
        h1.haseschlaeft();


        Osterhase h2 = new Osterhase("osterhäschen fritzi", 33);

        h2.versteckeOstereier(40);
        h2.hasehoppelt(30);
        h2.hasefrisst();
        h2.haseschlaeft();


        Weihnachtshase h3 = new Weihnachtshase("weihnachtshase klausi", 40);
        h3.verteileGeschenke(" wunderschöne tolle weihnachts- ");
        h3.hasehoppelt(20);

        Hasenstall stall1 = new Hasenstall();
        stall1.addHase(h1);
        stall1.addHase(h2);
        stall1.addHase(h3);

        stall1.alleHoppeln();

// Party
        ArrayList<GoesToParty> allemiteinladung = new ArrayList<>(); // hier speichern wir alle Hasen rein, die wir einladen
        allemiteinladung.add(h1);
        allemiteinladung.add(h2);
        allemiteinladung.add(h3);
        allemiteinladung.add(new Hase("hasenbaer", 14, 34));
        allemiteinladung.add(new Igel()); // Igel hinzufügen zu ArrayList und gleichzeitig anlegen eines Igels


        for (int i = 0; i < allemiteinladung.size(); i++) {
            allemiteinladung.get(i).party("Karottenwasser", "karottenkuchen");
        }

        ArrayList<Hase> hasenliste = new ArrayList<>();
        hasenliste.add(h1);
        hasenliste.add(h2);
        hasenliste.add(h3);
        hasenliste.add(new Hase("susi", 3, 35));
        hasenliste.add(new Hase("susi", 5, 35));


        System.out.println("hasenliste ungeordnet");
        System.out.println(hasenliste);

        System.out.println("-------");

        System.out.println("hasenliste sortiert");
        Collections.sort(hasenliste);
        System.out.println(hasenliste);


        // Mit Comparator andere Sortierung abfragen
        Collections.sort(hasenliste, new HasenNamenComperator()); //Comperator aufrufen
        System.out.println(hasenliste);


    }
}
