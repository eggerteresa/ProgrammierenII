package Quitschquak;

public class EntenMain {
    public static void main(String[] args) {


        BadeEnte ente1 = new BadeEnte("hubi", 150, 40);
        Flugente ente2 = new Flugente("flugsi", 300, 20);
        BadeEnte ente3 = new BadeEnte("badi", 30, 20);

        Entenhausen entenhausen = new Entenhausen();
        entenhausen.addEnte(ente1);
        entenhausen.addEnte(ente2);
        entenhausen.addEnte(ente3);

        System.out.println(entenhausen.getGruppierteEnten());


    }
}
