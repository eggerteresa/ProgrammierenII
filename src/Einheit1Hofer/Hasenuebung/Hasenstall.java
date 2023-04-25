package Einheit1Hofer.Hasenuebung;

import java.util.ArrayList;

public class Hasenstall {

    private ArrayList<Hase> hasen = new ArrayList<>();


    public void addHase (Hase hase){
        hasen.add(hase);
    }

    public void alleHoppeln () {

//        for (Hase h : hasen){
//            h.hasehoppelt(20);
//        }

        for (int i = 0; i<hasen.size(); i++) {
            hasen.get(i).hasehoppelt(20);
        }

        // Iterator <Hase> hasenIterator = all.Iterator();
        // while(hasenIterator.hasNext()) {
        // Hase h = hasenIterator.next();
        //h.hoppeln();
    }


}
