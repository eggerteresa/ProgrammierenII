package OrchesterAbstract.OrchesteruebungHofer;

public abstract class Instrument {

    private int lautstaerke;

    public abstract int play();




    public Instrument(int lautstaerke) {
        this.lautstaerke = lautstaerke;
    }

    public int getLautstaerke() {
        return lautstaerke;
    }

    public void setLautstaerke(int lautstaerke) {
        this.lautstaerke = lautstaerke;
    }
}
