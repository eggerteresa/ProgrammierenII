package OrchesteruebungHofer;

public class Instrument {

    private int lautstaerke;

    public int play(){
        System.out.println("Das Instrument klingt");


      return lautstaerke;
    }




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
