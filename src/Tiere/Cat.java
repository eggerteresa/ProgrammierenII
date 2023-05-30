package Tiere;

public class Cat extends Animal{
    protected String name;

    public Cat(String color, int countEyes, String name) {
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
        System.out.println("katze schleicht");
    }

    @Override
    public void makeNoise() {
        System.out.println("katze miaut");

    }
}
