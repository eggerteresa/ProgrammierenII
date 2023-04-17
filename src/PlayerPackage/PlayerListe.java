package PlayerPackage;

import java.util.ArrayList;
import java.util.HashMap;

public class PlayerListe {

    HashMap<Player, Integer > playerList = new HashMap<>();

    public HashMap<Player, Integer> getPlayerList() {
        return playerList;
    }

    public void addOrUpdate(Player p, int points) {

            if (playerList.get(p) == null) {
                playerList.put( p, points);
            }
            else {
                playerList.put(p, playerList.get(p)+points);

            }
            p.setPoints(playerList.get(p));
        }



    public ArrayList<Player> getPlayerWithPoints(int points) {


        return null;
    }



}
