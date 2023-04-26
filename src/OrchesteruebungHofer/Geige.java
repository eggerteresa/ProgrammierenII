package OrchesteruebungHofer;

public class Geige extends Instrument{

    public Geige(int lautstaerke) {
        super(lautstaerke);
    }

    @Override
    public int play() {
        System.out.println("Die Geige wird gestrichen");
        return getLautstaerke();
    }
}
