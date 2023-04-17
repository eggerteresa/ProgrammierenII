package PlayerPackage;

import java.util.ArrayList;
import java.util.Iterator;

public class TeamsVerwaltung {

    private ArrayList<Team> teams = new ArrayList<>(); // soll Liste von Teams haben. so ohne konstruktor


    public void add(Team t) {
        teams.add(t);
    }
//    public void print() {
//        Iterator<Team> it = teams.iterator();
//        while (it.hasNext()) {
//            System.out.println(it.next());
//            System.out.println(teams.toString());
//        }
//        System.out.println();
//        it.print();
//
//    }

    public void print() {
        for (Team t : teams) {
            System.out.println(t);
            t.print(); // Print Methode aus Klasse Team
        }
        System.out.println();


    }


    public Team getWinnerTeam() {
        Team winner = null;
        int points = 0;

        for (Team t : teams) { // geht auch mit normalem for-Loop, dann t.get(i).getpointsperteam
            if (t.getPointsPerTeam() > points) {
                winner = t; // dieses Team wird winner
                points = t.getPointsPerTeam();  // neu abspeichern, damit wir es beim nächsten mal damit vergleichen können
            }

        }
        return winner;

    }

    public Player getBestPlayer() { // zwei schleifen durchlaufen: Player und Teams
        Player best = null;
        int points = 0;


        for (Team t : teams) { //Schleife 1 - 1 Team jeweils - hat liste mit playern
            // oder for (int i = 0; i < teams.size(); i++){
            //for (int j=0; teams.get(i).getPlayers().size();j++) {
            // if (teams.get(i).getPlayers().get(j).getPoints() > points) {
            // SIEHE IHRE MITSCHRIFT!!!
            for (Player p : t.getPlayers()) { //Schleife 2 - teams hat liste
                if (p.getPoints() > points) {
                    best = p;
                    points = p.getPoints();
                }
            }
        }
        return best;
    }

    public Player getPlayerById(int id) {
        for (Team t : teams) {
            for (Player p : t.getPlayers()) {
                if (p.getId() == id) {
                    return p;
                }
            }
        }
        return null;
    }


}
