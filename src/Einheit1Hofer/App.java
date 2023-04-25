package Einheit1Hofer;

public class App {
    public static void main(String[] args) {

        //statische Attribute können ohne objekt (oder instanz) verwendet werden
        System.out.println(Hund.latinName);
        Hund.printLatinName();


        Beagle snoopy = new Beagle("Snoopy", 30, "Lasagne");

        snoopy.eatsLovedFood();

        snoopy.bellen("wuffiiiwufff heuuuul"); // snoopy hat seine eigene Bellen-Methode!!! ist ein Beagle!! - kommt aus der klasse beagle

        Hund d = new Hund("Baxter", 20);

        d.bellen("huuuuuuuuuu"); // ist ein Hund. kein spezieller Hund, kein Beagle, deshalb ist Methode anders!!


        //upcasting und downcasting


        Beagle freddie = new Beagle("freddie", 5, "gulasch");

//upcasting
        Hund doggo = freddie;

        doggo.bellen("wuffwuff"); // doggo - ist hund - also nur Methoden aus hund verfügbar. wenn freddie. dann sind die Beagle Methoden zur verfügung

//downcasting

      Hund doggo2 = new Beagle("Hubert", 3, "salami");

      // wir möchten sein lieblingsessen wissen: downcasting RISIKO

        Beagle b1 = (Beagle)doggo2;  // "Casten" und dann zuweisen - wenn doggo2 kein Beagle ist Problem1!
        // Casten - wir versuchen, ein objekt in ein anderes umzuwandeln
        b1.eatsLovedFood(); // Methoden aus beagle sind aufrufbar





    }
}
