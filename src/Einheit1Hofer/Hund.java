package Einheit1Hofer;

public class Hund {

    public static String latinName= "Canis lupus familiaris";
    //ein statisches Attribut gibt es nur einmal, egal, wieviele Hunde-Objekte erzeugt werden

    private String name;
    protected int alter; // auf private können andere klasse nicht direkt zugreifen


    public Hund(String name, int alter) {
        this.name = name;
        this.alter = alter;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }



    public void bellen(String wuff) {
        System.out.println(name + " bellt " + wuff);

    }
    //Hat nichts mit Vererbung zu tun, static exkurs
    public static void printLatinName() {
        String hansi = "Hansi liebt Hunde";
        System.out.println(hansi);
        System.out.println(latinName);
        //System.out.println(alter); variable alter ist nicht static!!
    }
}
