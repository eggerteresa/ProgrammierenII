package Wild.Einheit1_120423;

public class Student {
    private String firstName;
    private String lastName;
    private Class[] classes;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.classes = new Class[3]; // Class Array mit 3 initialisieren
    }

    public void enroll(Class c) { // Ein Objekt als Parameter übergeben
        if (extracted(c)) return; // steigt aus der Methode aus // fügt sich automatisch hier ein extracted methode

           if (!c.maxCapacityReached()) {
        if (classes[classes.length -1] != null) {
            classes = increaseClassArray(); // Wenn kein Platz mehr ist, machen wir mehr Platz
     c.enroll();
      classes [classes.length -1] = c;
        } else {
            for (int i = 0; i< classes.length; i++) {
                if (classes[i] == null) {
                    c.enroll();
                    classes[i] = c;
                    System.out.println("Kurs angemeldet");
                    break;
                }
            } }
        }

        if (!c.maxCapacityReached()) { // max capacity noch nicht erreicht!
            for (int i = 0; i < classes.length; i++) {
                if (classes[i] == null) {
                    c.enroll();
                    classes[i] = c; // neue Klasse c wird in den Array eingefügt
                    System.out.println("Kurs angemeldet");
                    break; // steigt hier aus und überspringt die nächsten zwei geschwungenen klammern
                }
            }
        } else {
            System.out.println(" Keine Anmeldung mehr möglich ");
        }

    }
    // Wir machen mehr platz im ARray
    private Class [] increaseClassArray() {
        Class[] temp = new Class[classes.length +1];
        for (int i = 0; i< classes.length; i++) {
            temp[i] = classes [i];
        }
        return temp;
    }



// extract Method (Teil in Methode Markieren und extract Method:
    private boolean extracted(Class c) {
        for (int i = 0; i < classes.length; i++) { // Wir schauen, ob er nicht schon angemeldet ist
            if (classes[i] != null) {
                if (classes[i].getName().equals(c.getName())) {
                    System.out.println(c.getName() + "Bereits angemeldet");
                    return true;
                }
            }
        }
        return false;
    }

    public void printClasses() {
        for (int i = 0; i < classes.length; i++) {
            System.out.println(classes[i]);
        }

    }

    // Methode, damit statt Ortangabe im Array auch String herauskommt
    @Override
    public String toString() {
        return "Student {" +
                "firstName ='" + firstName + '\'' +
                ", lastName ='" + lastName + '\'' +
                // ",  classes=" + Arrays.toString(classes) + // zeigt auch inhalt der Klasse an
                '}';
    }
}
