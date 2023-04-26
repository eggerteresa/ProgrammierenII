package OrchesteruebungHofer;

public class Gitarre extends Instrument{ //ableiten von Basisklasse
    public Gitarre(int lautstaerke) { //Konstruktor gibt Parameter weiter
        super(lautstaerke);
    }


    @Override
    public int play() { // Überschreiben der play Methode
        System.out.println("Die Gitarre wird gezupft");
        return getLautstaerke();
    }
}
