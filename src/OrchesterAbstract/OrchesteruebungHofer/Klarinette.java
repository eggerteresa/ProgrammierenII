package OrchesterAbstract.OrchesteruebungHofer;

public class Klarinette extends Instrument {

    public Klarinette(int lautstaerke) {
        super(lautstaerke);
    }

    @Override
    public int play() {
        System.out.println("Die Klarinett spielt dueduegarsonett");
        return getLautstaerke();
    }
}
