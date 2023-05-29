package pruefungstest2musikanten.src.main.java.at.campus02.musikanten;

public class Hund extends Musikant {
	protected double bellLautstaerke;
	public Hund(int aB, Instrument i , double bellLautstaerke) {
	super(aB, i);
	this.bellLautstaerke = bellLautstaerke;
	}

	@Override
	public String toString() {
		return "Hund " + bellLautstaerke +  " verscheucht: " + verscheucheRaeuber() +" Musiziert: " + spieleMusik();

	}

	@Override
	public int verscheucheRaeuber() {
		int verschaeuchteRaeuber = 0;
		if (bellLautstaerke > instrument.getLautstaerke()) {
			verschaeuchteRaeuber = (int)bellLautstaerke ;
		}
		else { verschaeuchteRaeuber = (int) instrument.getLautstaerke();}
		return verschaeuchteRaeuber;
	}

	@Override
	public double spieleMusik() {
		double lautstaerke = (bellLautstaerke + instrument.getLautstaerke()) /2;
		return lautstaerke;
	}
}
