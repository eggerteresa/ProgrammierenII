package Animal;

public class Giraffe extends Animal{

    protected int fleckenanzahl;


    public Giraffe(String name, int beinanzahl, String augenfarbe) {
        super(name, beinanzahl, augenfarbe);
        fleckenanzahl = 40; //typische Giraffe hat 40 Flecken
    }

    public Giraffe(String name, int beinanzahl, String augenfarbe, int fleckenanzahl) {
        super(name, beinanzahl, augenfarbe);
        this.fleckenanzahl = fleckenanzahl;

    }

    public void praesentiertFlecken() {
        System.out.println("Giraffe " + name + " hat " + fleckenanzahl + " Flecken");
    }


    @Override
    public void move(int meters) {
        System.out.println("Giraffe " + name + " stolziert " + meters + " weit");
    }

    @Override
    public void makeNoise(String withComment) {
        System.out.println("schmatzschmatz: " + withComment);

    }
}
