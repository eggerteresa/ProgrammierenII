package Tiere;

public class Lion extends Animal{
    public Lion(String color, int countEyes) {
        super(color, countEyes);
    }

    @Override
    public void walk() {
        System.out.println("löwe stolziert");
    }

    @Override
    public void makeNoise() {
        System.out.println("brüll");
    }




}
