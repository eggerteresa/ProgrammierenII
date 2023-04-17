package PlayerPackage;

import friendlist.Friend;

import java.util.ArrayList;
import java.util.Iterator;

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

    public void print1() {
        Iterator<Player> it = players.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println();
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
        int sum = 0;
        for (int i = 0; i <players.size(); i++){
            if (players.get(i).getTeam() == team) {
                sum = sum + players.get(i).getPoints();
            }
        }
       System.out.println(sum);
        return sum;
   }

   public  int mostPoints() {
        int points = players.get(0).getPoints();
        Player result = players.get(0);
        for (int i = 0; i <players.size(); i++) {
            if (players.get(i).getPoints() > points) {
                points = players.get(i).getPoints();
            }
        }
        return points;
   }


   public Player getWinner() {
        Player player = players.get(0);
        int mostPoint = 0;
        for (int i =0; i<players.size(); i++) {
            if(players.get(i).getPoints() > mostPoint) {
                mostPoint = players.get(i).getPoints();
                player = players.get(i);
            }
        }
        return player;
   }




}
