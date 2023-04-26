package OrchesteruebungHofer;

public class MainOrchester {

    public static void main(String[] args) {
        Instrument instrument1 = new Instrument(5);
        instrument1.play();

        Trompete trompete1 = new Trompete(20);

        trompete1.getLautstaerke();
        trompete1.play();

        Geige geige1 = new Geige(14);
        geige1.play();

        Klarinette klarinette1 = new Klarinette(15);
        klarinette1.play();

        Gitarre gitarre1 = new Gitarre(12);
        gitarre1.play();




        Orchester orchester = new Orchester();
        orchester.addInstrument(trompete1); // Hier passiert automatisch ein Upcast
        orchester.addInstrument(geige1);
        orchester.addInstrument(klarinette1);
        orchester.addInstrument(gitarre1);


        System.out.println("Das ganze Orchester spielt: ");
        System.out.println("Die Lautstärke aller Instrumente ist: " + orchester.playAll());

    }
}
