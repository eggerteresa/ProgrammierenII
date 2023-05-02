package HashMap;


import Einheit1Hofer.Hasenuebung.Hase;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {

        HashMap<String, Hase> steuerHasen = new HashMap<>();

        Hase h1 = new Hase("Hansi");
        Hase h2 = new Hase("Susi");
        Hase h3 = new Hase("Franzi");

        //etwas ins hashMap geben
        steuerHasen.put("123H",h1);
        steuerHasen.put("124H",h2);
        steuerHasen.put("125H",h3);

        //Element auslesen durch angabe des Schlüssels
        System.out.println(steuerHasen.get("123H"));

        //Wenn schlüssel nicht vorhanden ist, kommt null zurück
        System.out.println(steuerHasen.get("Bloedsinn"));

        //Fragen, ob Schlüssel in Hashmap ist:
        System.out.println(steuerHasen.containsKey("123H"));
        //oder .get - schauen ob null

        //notfall, weil langsam:
        System.out.println(steuerHasen.containsValue(h1));


        //steuerHasen.put("123H", h2);
        //h1 wird mit h2 ersetzt - h1 ist nicht mehr in der Hashmap!

        //über hashmap iterieren

        for (Map.Entry<String, Hase> hase: steuerHasen.entrySet()) { // mit entry set bekomme ich einty
            System.out.println(hase.getKey());
            System.out.println(hase.getValue());
            Hase h = hase.getValue();
            h.hasehoppelt(20);
        }


//andere variante, iterieren über alle schlüsselelemente mit MEthode keySet, liefert alle schlüssel zurück
        for (String key: steuerHasen.keySet()){
            System.out.println(key);
            Hase h = steuerHasen.get(key); // erzeuge neue Variable die auf Objekt zeigt, damit kann ich Methoden aufrufen
            h.hasehoppelt(20);


        }


       // steuerHasen.getOrDefault()



       // für integer:
       // HashMap <Integer, Integer > intHashMap = new HashMap <Integer, Integer>();




    }
}
