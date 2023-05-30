package Tiere;

public class Dog extends Animal{

    protected String name;

    public Dog(String color, int countEyes, String name) {
        super(color, countEyes);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void walk() {
        System.out.println("hund läuft");
    }

    @Override
    public void makeNoise() {
        System.out.println("wuffwuff");

    }
}
