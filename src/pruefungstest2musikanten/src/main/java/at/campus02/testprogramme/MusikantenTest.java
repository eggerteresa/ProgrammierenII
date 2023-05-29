package pruefungstest2musikanten.src.main.java.at.campus02.testprogramme;


import pruefungstest2musikanten.src.main.java.at.campus02.musikanten.*;

public class MusikantenTest {

	public static void main(String[] args) {
		// Testen Sie hier Ihr Beispiel

		Instrument geige = new Instrument("Geige", 10.3);
		Instrument triangel = new Instrument("triangel", 5.3);
		Instrument floete = new Instrument("floete", 6.8);
		Instrument trommel = new Instrument("trommel", 12);

		Esel esel = new Esel(4,geige,20);
		Hahn hahn = new Hahn(2, triangel, 5);
		Katze katze = new  Katze(4, floete, 5.6);
		Hund hund = new Hund(4,trommel,9.5 );

		Quartett quartett = new Quartett();
		quartett.add(esel);
		quartett.add(hahn);
		quartett.add(katze);
		quartett.add(hund);

		System.out.println(" ist ein quartett? "+ quartett.istQuartett());

		System.out.println(" Beinanzahl durchschnitt: " + quartett.getAnzahlMusikantenMitBeinAnzahl());
	 quartett.printLautStaerkeAbsteigend();

	}

}
