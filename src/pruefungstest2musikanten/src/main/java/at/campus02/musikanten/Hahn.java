package pruefungstest2musikanten.src.main.java.at.campus02.musikanten;

public class Hahn extends Musikant{
	protected int flugWeite;
	public Hahn(int aB, Instrument i , int flugWeite) {
super(aB, i);
this.flugWeite = flugWeite;
	}

	public int getFlugWeite() {
		return flugWeite;
	}

	@Override
	public String toString() {
		return "Hahn " + flugWeite + " verscheucht: " + verscheucheRaeuber() +" Musiziert: " + spieleMusik();
	}

	@Override
	public int verscheucheRaeuber() {
		int verschaeuchteRaeuber = 0;
		if (flugWeite <2) {
			verschaeuchteRaeuber = (int)instrument.getLautstaerke();
		}
		if (flugWeite >2 && flugWeite<6){
			switch (flugWeite) {
				case 2:
					verschaeuchteRaeuber= 6;
					break;
				case 3:
					verschaeuchteRaeuber=5;
					break;
					case 4:
					verschaeuchteRaeuber = 4;
					break;
				case 5:
					verschaeuchteRaeuber = 3;
					break;
				case 6:
					verschaeuchteRaeuber = 2;
					break;
			}
		}
		if (flugWeite > 6) {
			verschaeuchteRaeuber= 1;
		}
		return verschaeuchteRaeuber;
	}

	@Override
	public double spieleMusik() {
		double lautstaerke = instrument.getLautstaerke() + 2;
		lautstaerke = lautstaerke/flugWeite;
		return lautstaerke;
	}
}
