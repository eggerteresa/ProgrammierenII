package Animal;

public class Papagei extends Animal{

    public Papagei(String name, int beinanzahl, String augenfarbe) {
        super(name, beinanzahl, augenfarbe);
    }

    @Override
    public void move(int meters) {
        System.out.println("Der Papagei " + name+ " fliegt " + meters + " weit" );

    }

    @Override
    public void makeNoise(String withComment) {
        System.out.println("Papagei spricht:  " + withComment);
    }
}

