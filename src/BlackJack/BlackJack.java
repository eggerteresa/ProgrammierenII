package BlackJack;

import java.util.HashMap;
import java.util.Map;

public class BlackJack {
    private Map<Player, Integer> players;

    public BlackJack() {
        players = new HashMap<Player, Integer>();
    }

    boolean add(Player player) {
        int kartenwert = 0;

        if (players.containsKey(player)) {
            return false;

        } else {
            players.put(player, kartenwert);
        }

        return true;
    }

    boolean addCard(Player player, Integer cardValue) {

        if (!players.containsKey(player)) {
            return false;
        } else {
            Integer value = players.get(player);
            value = value + cardValue;
            players.put(player, value);
        }
        return true;
    }

    Integer getValue(Player player) {
        Integer getValue = 0;
        if (!players.containsKey(player)) {
            return getValue;
        }
        if (players.containsKey(player)) {
            return players.get(player); //.get gibt value zurück!
        }
        return players.get(player);
    }

    public Player getWinner() {
        Player winner = null;
        int punkte = -1;

        for (Player p : players.keySet()) {
            int punktePlayer = players.get(p); // gibt value also punkte zurück
            if (punktePlayer <= 21) {
                if (punktePlayer > punkte) {
                    punkte = punktePlayer;
                    winner = p;

                } else {
                    if (punktePlayer == punkte) {
                        winner = null;
                    }
                }
            }


        } return winner;


    }

    @Override
    public String toString() {
        String tostring = "";

        for (Player p : players.keySet()) {
            tostring = tostring + p.getName() + " , Kartenwert: " +  players.get(p);
        }
        return tostring;


}

}
