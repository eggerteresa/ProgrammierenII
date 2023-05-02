package Sortieren;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Frucht f1 = new Frucht("Banane", 210, false);
        Frucht f2 = new Frucht("Mango", 350, true );
        Frucht f3 = new  Frucht ("Kirsche", 20, true);
        Frucht f4 = new  Frucht ("Ananas", 700, true);
        Frucht f5 = new  Frucht ("Apfel", 250, true);

         Frucht [] fruechteArray = {f1, f2, f3, f4, f5};
        System.out.println("unsortiert");
        System.out.println(Arrays.toString(fruechteArray));
        System.out.println("----------");


        System.out.println("sortiert");
        Arrays.sort(fruechteArray);
        System.out.println(Arrays.toString(fruechteArray));

        System.out.println("-----------");
        System.out.println("arrayliste");
        List<Frucht> fruchtliste = new ArrayList<>(); // mit strg draufklicken - infos erhalten
        fruchtliste.add(f1);
        fruchtliste.add(f2);
        fruchtliste.add(f3);
        fruchtliste.add(f4);
        fruchtliste.add(f5);

        System.out.println(fruchtliste);

        System.out.println("sortiert mit Collections.sort");
        Collections.sort(fruchtliste);
        System.out.println(fruchtliste);





    }
}
