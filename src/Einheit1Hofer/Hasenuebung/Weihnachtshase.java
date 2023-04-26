package Einheit1Hofer.Hasenuebung;

public class Weihnachtshase extends Hase{

    public Weihnachtshase(String name) {
        super(name);
    }

    public void  verteileGeschenke(String beschreibung) {
        System.out.println(getName() + " verteilt "+ beschreibung + " Geschenke");
    }

    @Override
    public void party(String drink, String cake) {
        System.out.println("Weihnachtshase " + getName() + " bringt ganz viele Geschenke zur Party ");
    }
}
