package Getraenke;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Registrierkasse {
    private ArrayList<Getraenk> getraenke = new ArrayList<>();

   private static int verkaufteGetraenke =0;

    public Registrierkasse(ArrayList<Getraenk> getraenke) {
        this.getraenke = getraenke;
    }

    public void verkauft(Getraenk getraenk) {
        getraenke.add(getraenk);
        verkaufteGetraenke ++;
    }



    public static int getVerkaufteGetraenke() {

        return verkaufteGetraenke;

    }



   // Comparator <AnzahlZutatenComparator> comp = new Comparator<AnzahlZutatenComparator>() {


   // }
    public void printGetraenkeSortiertNachAnzahlZutaten(){
        //Sortieren nach Anzahl Zutaten - mit Comparator Klasse
        Collections.sort(getraenke, new AnzahlZutatenComparator());


    }
}
