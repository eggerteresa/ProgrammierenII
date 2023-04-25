package Einheit1Hofer;

public class Beagle extends Hund { // Bezug zur Elternklasse

    public String lovedFood;

    public Beagle(String name, int alter, String lovedFood) { //Konstruktor - übernimmt die Variablen automatisch
        super(name, alter); // rufe hier Konstruktor aus Elternklasse auf,
        this.lovedFood = lovedFood;
    }


    public String getLovedFood() {
        return lovedFood;
    }

    public void setLovedFood(String lovedFood) {
        this.lovedFood = lovedFood;
    }

    // Neue Methoden
    public void eatsLovedFood () {
        System.out.println(getName() + "(" + alter + ") isst " + lovedFood );
    }


// Methode override überschreiben
    @Override // überschreibt Methode in Basisklasse - checkt, ob uns kein Fehler passiert
    public void bellen(String wuff) { // kann mir hier aber eigene Methoden kreieren, bzw. spezieller gestalten
        System.out.println(getName() + " bellt und jammert " + wuff);
    }


}
