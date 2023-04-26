package Einheit1Hofer.Animal;

public abstract class Animal {

    protected String name;
    protected int beinanzahl;
    protected String augenfarbe;


    public Animal(String name, int beinanzahl, String augenfarbe) {
        this.name = name;
        this.beinanzahl = beinanzahl;
        this.augenfarbe = augenfarbe;
    }

    public void printAnimalDescription() {
        System.out.println(name + " Beine: " + beinanzahl + " Augenfarbe: "+ augenfarbe);


    }

    public abstract void move (int meters); //Abstrakte Methode ohne Methodenkörper nur mit Strichpunkt

    public abstract void makeNoise (String withComment);



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBeinanzahl() {
        return beinanzahl;
    }

    public void setBeinanzahl(int beinanzahl) {
        this.beinanzahl = beinanzahl;
    }

    public String getAugenfarbe() {
        return augenfarbe;
    }

    public void setAugenfarbe(String augenfarbe) {
        this.augenfarbe = augenfarbe;
    }
}
