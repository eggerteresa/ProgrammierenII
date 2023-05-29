package Wild.PlayerPackage;

import java.util.ArrayList;
import java.util.Iterator;

public class Team {

    private ArrayList<Player> players;
    private String name;

    public Team( String name) {
        this.players = new ArrayList<>();
        this.name = name;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {

        return "Team{" +
                " name='" + name + '\'' +
                ", Punkte='" + getPointsPerTeam() +
                '}';
    }


    public int getPointsPerTeam() { // Methode ohne Parameter. nicht aus Verwaltung aufrufen sondern hier brauche ich sie!
        int sum = 0;
        for (int i = 0; i <players.size(); i++){
                sum = sum + players.get(i).getPoints(); // get(i) nur bei normaler for-schleife!! bei for-each nur p.getPoints();
            }
       // System.out.println(sum); // sonst wird es jedesmal bei Methodenaufruf getWinnerTeam in TeamsVerwaltung ausgegeben!!!!
        return sum;
    }


    public void add(Player p) {
        players.add(p);
    }


    public void print() {
        Iterator<Player> it = players.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println();
    }







}
