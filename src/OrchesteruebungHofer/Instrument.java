package OrchesteruebungHofer;

import java.util.Comparator;

public class Instrument implements Comparable<Instrument> {


    // weil wir das implementieren, müssen wir eine Methode umsetzen



    private int lautstaerke;
    private double value;//wert des instruments, damit wir vergleich können mit comparator
    private String nickName;



    public int play(){
        System.out.println("Das Instrument klingt");


      return lautstaerke;
    }




    public Instrument(int lautstaerke, double value, String nickName) { //ergänzen, damit wir mehrere Werte verlgeichen können
        this.lautstaerke = lautstaerke;
        this.value =value;
        this.nickName = nickName;
    }

    public Instrument(int lautstaerke) {
        this.lautstaerke = lautstaerke;
        nickName="Instrument";
        value = 0;
    }

    public int getLautstaerke() {
        return lautstaerke;
    }

    public void setLautstaerke(int lautstaerke) {
        this.lautstaerke = lautstaerke;
    }


    // kann man leicht einfügen, wenn plublic class Instruments rot unterwellt ist zeigt es das schon an
    @Override
    public int compareTo(Instrument o) {
        if (lautstaerke < o.lautstaerke){
            return -1;
        }
        if (lautstaerke > o.lautstaerke){
            return 1;
        }

        return 0;
    }

    public double getValue() {
        return value;
    }

    public String getNickName() {
        return nickName;
    }


    @Override
    public String toString() {
        return "Instrument{" +
                "lautstaerke=" + lautstaerke +
                ", value=" + value +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}
