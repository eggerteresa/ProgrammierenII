package OrchesterAbstract.OrchesteruebungHofer;

import java.util.ArrayList;

public class Orchester {

    ArrayList<Instrument> alleInstrumente= new ArrayList<>();


    public void addInstrument (Instrument instrument) {
        alleInstrumente.add(instrument);

    }

    public int playAll() {
        int sum = 0;
        for (int i = 0; i<alleInstrumente.size(); i++) {
            alleInstrumente.get(i).play();
            sum = sum + alleInstrumente.get(i).getLautstaerke(); // dann wieder auf alleInstrumente und Schleife zurückgreifen

        }

        return sum;
    }


}
