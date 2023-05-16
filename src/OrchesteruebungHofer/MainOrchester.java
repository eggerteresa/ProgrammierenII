package OrchesteruebungHofer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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

        List<Instrument> instrumente = new ArrayList<>();

        instrumente.add(geige1);
        instrumente.add(gitarre1);
        instrumente.add(trompete1);
        instrumente.add(klarinette1);



        System.out.println(instrumente);
        //collection sortieren

        System.out.println(" -----");

        //müsste man noch toString Methode implementieren , sortieren mit comparable

        Collections.sort(instrumente);

        System.out.println((instrumente));



        //Comparator ausprobieren

        List <Instrument> instrumente3 = new ArrayList<>();

        instrumente3.add(new Geige(10, 100, "Hansi"));
        instrumente3.add(new Geige(10, 80, "Hansi2"));
        instrumente3.add(new Geige(10, 1000, "Gigi"));
        instrumente3.add(new Gitarre(10, 500, "Helli"));
        instrumente3.add(new Gitarre(10, 33, "Hubsi"));
        instrumente3.add(new Klarinette(10));
        instrumente3.add(new Klarinette(5 ));


        System.out.println(instrumente3);
        System.out.println("-----");
//Achtung anders: comparator angeben:
Collections.sort(instrumente3, new InstrumentNameValueComparator());
        System.out.println((instrumente3));


    }
}
