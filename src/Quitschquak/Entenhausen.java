package Quitschquak;

import pruefungstest2musikanten.src.main.java.at.campus02.musikanten.Musikant;

import java.util.*;

public class Entenhausen {

    private ArrayList<Ente> enten;

    public Entenhausen() {
     enten = new ArrayList<>();
    }

    public void addEnte(Ente e) {
        enten.add(e);
    }

    public Map<Integer, List<Ente>> getGruppierteEnten() {
        Map <Integer, List <Ente>> entenGruppen = new HashMap<>();

        int steuergruppe1 = 100;
        int steuergruppe2 = 200;
        int steuergruppe3 = 300;
        List <Ente> ente100 = new ArrayList<>();
        List <Ente> ente200 = new ArrayList<>();
        List <Ente> ente300 = new ArrayList<>();


        for (Ente e : enten) {
            //int gesamtgewicht = e.getFullWeight();
            if (e.getFullWeight() <= 100) {
                ente100.add(e);
                 entenGruppen.put(steuergruppe1, ente100);
            }
            if (e.getFullWeight() > 100 && e.getFullWeight()<=200){
                ente200.add(e);
            entenGruppen.put(steuergruppe2, ente200);
            }
            if (e.getFullWeight() >200 && e.getFullWeight()<=300)
                ente300.add(e);
               entenGruppen.put(steuergruppe3, ente300);
        }
        return entenGruppen;
    }



}
