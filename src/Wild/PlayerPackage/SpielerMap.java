package Wild.PlayerPackage;

import java.util.HashMap;
import java.util.Map;

public class SpielerMap {

    Map<Spieler, Integer> player = new HashMap<>();

    public void addOrUpdate(Spieler s, int points) {
        int p = player.get(s);
        if (p == 0) {
            player.put(s, points);
        } if ( p!=0) {
            player.put(s, player.get(s) + points);
        }
    }

    public Map<Spieler, Integer> getPlayer() {
        return player;
    }
}
