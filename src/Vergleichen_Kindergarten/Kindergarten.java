package Vergleichen_Kindergarten;

import java.util.ArrayList;
import java.util.Collections;

public class Kindergarten {
    private String klassenname;
    private ArrayList<Kind> kinder;

    public Kindergarten(String klassenname) {
        this.klassenname = klassenname;
       kinder = new ArrayList <> ();
    }

    public String getKlassenname() {
        return klassenname;
    }

    public void setKlassenname(String klassenname) {
        this.klassenname = klassenname;
    }

    public ArrayList<Kind> getKinder() {
        return kinder;
    }

    public void setKinder(ArrayList<Kind> kinder) {
        this.kinder = kinder;
    }

    public void addKind (Kind k) {
        kinder.add(k);
    }
    public void sortAlphabetical () {
        Collections.sort(kinder, new AlphabeticalComarator());
        System.out.println(kinder);
    }

    public void sortAge() {
Collections.sort(kinder, new AgeComparator());
        System.out.println(kinder);
    }

}
