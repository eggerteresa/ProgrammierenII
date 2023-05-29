package pruefungstest2musikanten.src.main.java.at.campus02.musikanten;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class Quartett {

    private ArrayList<Musikant> stadtmusikanten = new ArrayList<>();

    public Quartett() {
        this.stadtmusikanten = stadtmusikanten;
    }



    public ArrayList<Musikant> getStadtmusikanten() {
        return stadtmusikanten;
    }

    public void add(Musikant m) {
        stadtmusikanten.add(m);
    }


    public boolean istQuartett() {
        if (stadtmusikanten.size() == 4) {
            return true;
        } else {
            return false;
        }
    }

    public int gemeinsamRaeuberVerscheucht() {

        int summe = 0;
        for (int i = 0; i < stadtmusikanten.size(); i++) {
            summe = summe + stadtmusikanten.get(i).verscheucheRaeuber();
        }

        return summe;
    }

    public int gemeinsamRaeuberVerscheuchtIterator() {

        int summe = 0;
        Iterator<Musikant> it = stadtmusikanten.iterator();

        while (it.hasNext()) {
            summe = summe + it.next().verscheucheRaeuber();
        }
        return summe;
    }

    public double durchschnittlicheLautstaerke() {
        double durchschnittlicheLautstaerke = 0;
        for (Musikant m : stadtmusikanten) {
            durchschnittlicheLautstaerke = durchschnittlicheLautstaerke + m.spieleMusik();
        }
        durchschnittlicheLautstaerke = durchschnittlicheLautstaerke / stadtmusikanten.size();
        return durchschnittlicheLautstaerke;
    }

    public ArrayList<Musikant> getMusikantenInLautstaerkeBereich(double von, double bis) {
        ArrayList<Musikant> ergebnis = new ArrayList<>();

        for (Musikant m : stadtmusikanten) {
            if (m.spieleMusik() > von && m.spieleMusik() < bis) {
                ergebnis.add(m);
            }
        }
        return ergebnis;


    }

    public HashMap<Integer, Integer> getAnzahlMusikantenMitBeinAnzahl() {
        HashMap<Integer, Integer> ergebnis = new HashMap<>();


        for (Musikant m : stadtmusikanten) {
            int beinanzahl = m.getAnzahlBeine();
            if (ergebnis.containsKey(beinanzahl)) {
                ergebnis.put(m.getAnzahlBeine(), ergebnis.get(beinanzahl) + 1); // anzahl beine ist key, und value wird mitgezählt, bei allen tieren die so viele beine haben
            } else {
                ergebnis.put(beinanzahl, 1);
            } // sonst key ist beinanzahl, und value = tieranzahl = 1


        }  return ergebnis;
    }

        public void printLautStaerkeAbsteigend()
        {
            Collections.sort(stadtmusikanten, new LautstaerkeComparator());
            System.out.println(stadtmusikanten);
        }

    }

