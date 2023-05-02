package Sortieren;

import java.util.Comparator;

public class Frucht implements Comparable<Frucht> {
    protected String name;
    protected double gewicht;
    protected boolean frisch;

    public Frucht(String name, double gewicht, boolean frisch) {
        this.name = name;
        this.gewicht = gewicht;
        this.frisch = frisch;
    }

    @Override
    public int compareTo(Frucht o) {
        if (this.gewicht < o.gewicht){
            return -1;}
        if (this.gewicht > o.gewicht){
            return  +1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Frucht{" +
                "name='" + name + '\'' +
                ", gewicht=" + gewicht +
                ", frisch=" + frisch +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGewicht() {
        return gewicht;
    }

    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }

    public boolean isFrisch() {
        return frisch;
    }

    public void setFrisch(boolean frisch) {
        this.frisch = frisch;
    }
}
