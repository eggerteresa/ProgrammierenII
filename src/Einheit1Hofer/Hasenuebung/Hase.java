package Einheit1Hofer.Hasenuebung;

public class Hase  implements Comparable<Hase>,  GoesToParty  {
    protected String name;
    protected int alter;

    protected int karottenzahl;

    public Hase(String name, int alter, int karottenzahl) {
        this.name = name;
        this.alter = alter;
        this.karottenzahl = karottenzahl;
    }

    public Hase(String name, int alter) {
        this.name = name;
        this.alter = alter;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public void haseschlaeft () {
        System.out.println(name + " schläft im Moos");
    }

    public void hasefrisst() {
        System.out.println(name + " frisst Karotten");
    }

    public void hasehoppelt( int meter) {
        System.out.println(name + " hoppelt " + meter + " meter weit durch den Wald");
    }

    public Hase(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void party(String drink, String cake) {
        System.out.println(name + " geht zur Party und isst " + cake + " und trinkt " + drink);
    }

    @Override
    public String toString() {
        return "Hase{" +
                "name='" + name + '\'' +
                ", alter=" + alter +
                ", karottenzahl=" + karottenzahl +
                '}';
    }

    @Override
    public int compareTo(Hase o) {
        if(this.alter < o.alter) {
            return -1;
        }
        if (this.alter > o.alter) {
            return 1;
        }
        if (this.karottenzahl<o.karottenzahl) {
            return -1;
        }
        if (this.karottenzahl > o.karottenzahl) {
            return 1;
        }
        return 0; //alter muss gleich sein, schauen auf zweites kriterium
    }
}
