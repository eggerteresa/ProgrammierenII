package Hasenuebung;

public class Osterhase extends Hase{

    public Osterhase(String name) {
        super(name);
    }

    public void versteckeOstereier(int anzahl) {
        System.out.println(getName() + " versteckt " + anzahl + " Ostereier");

    }

    public Osterhase(String name, int alter) {
        super(name, alter);
    }

    @Override
    public void hasehoppelt(int meter) {
        System.out.println(getName() + " hoppelt "+ meter + " meter weit und springt herum");
    }
}
