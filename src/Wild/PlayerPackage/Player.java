package Wild.PlayerPackage;

import java.util.Objects;

public class Player {
    private int id; // gehört jedem Objekt extra!
    static int counter=0;
    private String name;
    private Team team; // ohne enum
    private int points;


    public Player(String name, Team team, int points) { // id brauchen wir nicht im constructor, weil es den counter übernimmt
        this.id = counter; // unsere id ist der counter
        this.name = name;
        this.team = team;
        this.points = points;
        counter ++; // counter erhöht sich nach jedem Objekt automatisch

    }

    public Player(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", name='" + name + '\'' +
             // Weglassen, sonst wird das mit ausgegeben!!!   ", team=" + team +
                " points=" + points +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return name.equals(player.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Player.counter = counter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) { // kommt Player.Team - player weglöschen
        this.team = team;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
