package Quitschquak;

public class BadeEnte extends Ente{

    protected int gewichtWasser;

    public BadeEnte(String name, int gewicht, int gewichtWasser) {
        super(name, gewicht);
        this.gewichtWasser = gewichtWasser;
    }

    @Override
    public String toString() {
        return "BadeEnte{" +
                "gewichtWasser=" + gewichtWasser +
                "gesamtgewicht =" + getFullWeight() +
                '}';
    }

    @Override
    public int getFullWeight() {
        return gewichtWasser+gewicht;
    }

    @Override
    public String makeNoise() {
        return null;
    }
}
