package PruefungProgrammierenI;

public class PersonenTest {
    public static void main(String[] args) {


        Personenverwaltung pv1 = new Personenverwaltung(5);
        pv1.fuegePersonHinzu(new Person(1, "Max"));
        Person p = pv1.lieferePersonMitId(1);
        System.out.println(p);
        pv1.fuegePersonHinzu(new Person(2, "Anna"));
        pv1.fuegePersonHinzu(new Person(3,"Susi"));






    }


}
