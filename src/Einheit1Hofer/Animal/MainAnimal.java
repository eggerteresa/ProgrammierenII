package Einheit1Hofer.Animal;

import java.util.ArrayList;

public class MainAnimal {
    public static void main(String[] args) {

      // geht nicht - keine Instanz erzeugen möglich
        // Animal a = new Animal() {

        Giraffe georg = new Giraffe("Georg", 4, "braun", 43);
        Papagei polly = new Papagei("Polly", 2, "schwarz");

        polly.makeNoise("macht Geräusche nach");

        georg.praesentiertFlecken();

        //upcasten auf abstrakten basisklassentyp
         Animal g1 = georg;
         g1.makeNoise("er frisst so gern"); // in Basisklasse eben nur Basisklassenmethoden!


        ArrayList<Animal> zoo = new ArrayList<>(); // kann alles rein, was ein Animal ist - was von dieser Klasse abstammt! Egal welche Tierart noch dazukommt

        zoo.add(g1);
        zoo.add(polly);

        for (int i = 0; i<zoo.size(); i++) {
            zoo.get(i).move(100);
        }







    }
}
