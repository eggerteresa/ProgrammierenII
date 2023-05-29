package Wild.PruefungProgrammierenI;

public class Personenverwaltung {


    private Person[] personen;
    private int anzahl = 0;

    public Personenverwaltung(int groesse) { // Konstruktor
        personen = new Person[groesse];
    }


    public void fuegePersonHinzu(Person p) {
        if (anzahl < personen.length) {
            personen[anzahl] = p;
            anzahl++;
        }
//      Wäre auch möglich:  for (int i = 0; i< personen.length; i++) {
//            if (personen [i] ==null) {
//                personen[i] = p;
//                break;
//            }
//        }
    }


    public Person lieferePersonMitId(int id) {
        for (int i = 0; i < personen.length; i++) {
            if (personen[i].getId() == id) {
                return personen[i];
            }
        }
        return null;
    }

    public void entfernePersonMitId(int id) {
        //so möglich:
        for (int i = 0; i < personen.length; i++) {
            if (personen[i] != null) { //prüft ob überhaupt etwas dort steht
                if (personen[i].getId() == id) {
                    personen[i] = null;
                    break;
                }
            }
        }
    }

}