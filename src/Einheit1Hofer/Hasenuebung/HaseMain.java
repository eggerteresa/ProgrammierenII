package Einheit1Hofer.Hasenuebung;

public class HaseMain {
    public static void main(String[] args) {


        Hase h1 = new Hase("hasi");

        h1.hasefrisst();
        h1.hasehoppelt(10);
        h1.haseschlaeft();


        Osterhase h2 = new Osterhase("osterhäschen fritzi");

        h2.versteckeOstereier(40);
        h2.hasehoppelt(30);
        h2.hasefrisst();
        h2.haseschlaeft();


        Weihnachtshase h3 = new Weihnachtshase("weihnachtshase klausi");
        h3.verteileGeschenke(" wunderschöne tolle weihnachts- ");
        h3.hasehoppelt(20);

Hasenstall stall1 = new Hasenstall();
stall1.addHase(h1);
stall1.addHase(h2);
stall1.addHase(h3);

stall1.alleHoppeln();



    }
}
