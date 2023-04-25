package PlayerPackage;

public class PlayerDemo {
    public static void main(String[] args) {

        Team t1 = new Team("a");
        t1.add(new Player("andi", t1, 20));
        t1.add(new Player("susal", t1, 30));
        t1.add(new Player("michi", t1, 50));
        t1.add(new Player("nora", t1, 50));
        t1.add(new Player("kata", t1, 50));
        t1.add(new Player("aurelie", t1, 50));

        Team t2 = new Team("b");
        t2.add(new Player("andi", t2, 20));
        t2.add(new Player("susi", t2, 30));
        t2.add(new Player("michi", t2, 50));
        t2.add(new Player("roman", t2, 0));
        t2.add(new Player("hannah", t2, 60));
        t2.add(new Player("kathi", t2, 30));

        Team t3 = new Team("c");
        t3.add(new Player("andi", t3, 20));
        t3.add(new Player("susanne", t3, 30));
        t3.add(new Player("michi", t3, 50));
        t3.add(new Player("hans", t3, 90));
        t3.add(new Player("gabi", t3, 9));
        t3.add(new Player("agnes", t3, 5));


        TeamsVerwaltung verwaltung = new TeamsVerwaltung();
        verwaltung.add(t1);
        verwaltung.add(t2);
        verwaltung.add(t3);

        System.out.println("Das Gewinnerteam ist: " +verwaltung.getWinnerTeam());
        System.out.println("Der beste Spieler ist: " +verwaltung.getBestPlayer());
        System.out.println("Spieler 7 ist: " +verwaltung.getPlayerById(7));
       //verwaltung.print();
        System.out.println(t3.equals(t2)); // vergleicht die zwei teams mit hascode und equals

        PlayerListe liste1 = new PlayerListe();

        Player player4 = new Player("susi");

        liste1.addOrUpdate(player4, 24);
        System.out.println(liste1.getPlayerList());

        SpielerMap spielermap = new SpielerMap();
       // spielermap.addOrUpdate( 23);

    }
}
