package pruefungstest2musikanten.src.main.java.at.campus02.musikanten;

public class Katze extends Musikant{
	protected double kratzKraft;
	
	public Katze(int aB, Instrument i , double kratzKraft) {
super(aB, i);
this.kratzKraft = kratzKraft;
	}

	@Override
	public String toString() {
		return "Katze" + " verscheucht: " + verscheucheRaeuber() +" Musiziert: " + spieleMusik();
	}

	@Override
	public int verscheucheRaeuber() {
		int verschaeuchteRaeuber = (int) kratzKraft;

		if (anzahlBeine == 3) {
			verschaeuchteRaeuber= (int) kratzKraft/2;
		}
		if(anzahlBeine <= 2) {
			verschaeuchteRaeuber=1;
		}

		return verschaeuchteRaeuber;
	}

	@Override
	public double spieleMusik() {
		double lautstaerke = instrument.getLautstaerke();
		return lautstaerke;
	}
}
