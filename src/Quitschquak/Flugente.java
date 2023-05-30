package Quitschquak;

public class Flugente extends Ente{

    protected int gewichtFedern;

    public Flugente(String name, int gewicht, int gewichtFedern) {
        super(name, gewicht);
        this.gewichtFedern = gewichtFedern;
    }

    @Override
    public String toString() {
        return "Flugente{" +
                "gewichtFedern=" + gewichtFedern +
                "gesamtgewicht =" + getFullWeight() +
                '}';
    }

    @Override
    public int getFullWeight() {
        return gewichtFedern+gewicht;
    }

    @Override
    public String makeNoise() {
        return null;
    }
}
