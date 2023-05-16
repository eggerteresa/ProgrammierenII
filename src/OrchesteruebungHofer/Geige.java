package OrchesteruebungHofer;

public class Geige extends Instrument{

    public Geige(int lautstaerke) {
        super(lautstaerke);
    }

    public Geige(int lautstaerke, double value, String nickName) {
        super(lautstaerke, value, nickName);
    }

    @Override
    public int play() {
        System.out.println("Die Geige wird gestrichen");
        return getLautstaerke();
    }
}
