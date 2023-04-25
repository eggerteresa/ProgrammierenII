package Einheit1Hofer.Hasenuebung;

public class Osterhase extends Hase{

    public Osterhase(String name) {
        super(name);
    }

    public void versteckeOstereier(int anzahl) {
        System.out.println(getName() + " versteckt " + anzahl + " Ostereier");

    }

    @Override
    public void hasehoppelt(int meter) {
        System.out.println(getName() + " hoppelt "+ meter + " meter weit und springt herum");
    }
}
