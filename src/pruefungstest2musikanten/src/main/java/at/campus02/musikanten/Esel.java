package pruefungstest2musikanten.src.main.java.at.campus02.musikanten;

public class Esel extends Musikant {
	protected double trittkraft;



	public Esel(int aB, Instrument i, double trittkraft) {
		super(aB, i); //hier aB und i einfügen
		this.trittkraft = trittkraft;
	}

	public double getTrittkraft() {
		return trittkraft;
	}

	@Override
	public String toString() {
		return "Esel " + trittkraft + " verscheucht: " + verscheucheRaeuber() +" Musiziert: " + spieleMusik();

	}

	@Override
	public int verscheucheRaeuber() {
		int verscheuchteRaeuber = anzahlBeine * (int)trittkraft;

		return verscheuchteRaeuber;
	}

	@Override
	public double spieleMusik() {
		double lautstaerke = instrument.getLautstaerke();
		return lautstaerke;
	}
}
