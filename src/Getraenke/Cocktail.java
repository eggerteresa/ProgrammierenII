package Getraenke;

import java.util.ArrayList;

public class Cocktail extends Getraenk{

    protected ArrayList<Fluessigkeit> bestandteile;

    public Cocktail(String name, ArrayList<Fluessigkeit> bestandteile) {
        super(name);
        this.bestandteile = bestandteile;
    }

    @Override
    public boolean brennt() {
        return false;
    }

    @Override
    public int getAnzahlZutaten() {
        return 0;
    }

    @Override
    public boolean beinhaltetAlkohol() {
        return false;
    }

    @Override
    public double mengeInMl() {
        return 0;
    }
}
