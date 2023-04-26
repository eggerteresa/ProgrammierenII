package OrchesterAbstract.OrchesteruebungHofer;

public class Trompete extends Instrument {

    public Trompete(int lautstaerke) {
        super(lautstaerke);
    }

    @Override
    public int play() {
        System.out.println("Die Trompete wird gespielt und geträllert");
        return getLautstaerke();
    }
}
