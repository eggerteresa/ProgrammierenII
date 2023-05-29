package Getraenke;

public class LongDrink extends Getraenk{
    protected Fluessigkeit spiritouse;
    protected Fluessigkeit filler;


    public LongDrink(String name, Fluessigkeit spiritouse, Fluessigkeit filler) {
        super(name);
        this.spiritouse = spiritouse;
        this.filler = filler;
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
