package BlackJack;

public class DemoBJ {

    public static void main(String[] args) {

        Player p = new Player("hansi", 23);
        Player pa = new Player("hubsi", 32);

        BlackJack bj = new BlackJack();

        bj.add(p);
        bj.add(pa);

        System.out.println( bj.toString());
        bj.addCard(p, 2);
        bj.addCard(pa, 10);
        System.out.println( bj.toString());
        System.out.println( " p hat soviele punkte: "); System.out.println( bj.getValue(p));
        System.out.println("der gewinner ist " +bj.getWinner() + bj.getValue(pa));

    }
}
