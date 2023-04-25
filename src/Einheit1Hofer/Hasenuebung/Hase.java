package Einheit1Hofer.Hasenuebung;

public class Hase {
    private String name;



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
}
