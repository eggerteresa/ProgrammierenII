package OrchesteruebungHofer;

import Einheit1Hofer.Hasenuebung.Hase;

import java.util.Comparator;

public class InstrumentNameValueComparator implements Comparator<Instrument> {
    @Override
    public int compare(Instrument o1, Instrument o2) {
        int erg = o1.getNickName().compareTo(o2.getNickName());   //zuerst nach name sortieren, vorher getter erstellen, kommt 0, 1, -1 zurück
    if (erg !=0) { //Namen sind unterschiedlich
        return erg;
    }
    //Nicknamen sind wohl gleich
    // if (erg ==0) { kann man weglassen, weil:
       return Double.compare(o1.getValue(), o2.getValue());


    }
}


//    public int compare(Hase o1, Hase o2) {
//        return o1.name.compareTo(o2.name);
