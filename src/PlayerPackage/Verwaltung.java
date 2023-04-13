package PlayerPackage;

import friendlist.Friend;

import java.util.ArrayList;

public class Verwaltung {

    private ArrayList<Player> players = new ArrayList<>();

    public void add(Player p) {
        players.add(p);
    }


    public void removePlayer(Player p) {
        players.remove(p);
    }

    public void print() {
        for (Player p : players) {
            System.out.println(p);
        }

    }

    public void print(ArrayList<Player> players) {
        for (Player p : players) {
            System.out.println(p);
        }
// print Methode überladen

    }

    public ArrayList<Player> getPlayerById(int id) {
        ArrayList<Player> result = new ArrayList<>();

        for (int i = 0; i<players.size(); i++) {
            if (players.get(i).getId() == id){
                result.add(players.get(id));
            }
        } return result;
    }

    public int getPointsPerTeam(Team team) {
        int gesamtzahl
    }





}
