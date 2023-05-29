package Getraenke;

public abstract class Getraenk implements Brennbar {

    protected String name;

    public Getraenk(String name) {
        super(); //warum hier super?
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + ": " + getAnzahlZutaten() + " (" +mengeInMl() + "ml, " +beinhaltetAlkohol() +", und " + brennt() + ") ";
    }

    public abstract int getAnzahlZutaten();

    public abstract boolean beinhaltetAlkohol();

    public abstract double mengeInMl();


}
