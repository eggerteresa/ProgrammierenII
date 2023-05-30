package Tiere;

public class Frog extends Animal{
    public Frog(String color, int countEyes) {
        super(color, countEyes);
    }

    @Override
    public void walk() {
        System.out.println("frosch hüpft");
    }

    @Override
    public void makeNoise() {
        System.out.println("frosch quakt");

    }

}
