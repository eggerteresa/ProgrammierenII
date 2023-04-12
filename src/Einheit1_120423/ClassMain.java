package Einheit1_120423;

public class ClassMain {
    public static void main(String[] args) {

        Class c = new Class("Englisch", 160, 3, 19);
        Class ma = new Class("Mathe", 160, 3, 19);
        Class d = new Class("Deutsch", 160, 3, 19);
        Class r = new Class("xx", 160, 3, 19);


        c.maxCapacityReached();
        c.enroll();

        // private Variablen: NUR mit getname/ GETTER aendern!


        Student s = new Student("Max", "Muster");

        System.out.println(s); //
        s.enroll(c);

        Student m = new Student("Susi", "Kahn");
        System.out.println(m);
        m.enroll(c);

        Student n = new Student("Merle","Grunau");
        System.out.println(n);
        n.enroll(c);

        Student p = new Student("Aurelie","Zouaoui");
        System.out.println(p);
        p.enroll(ma);

        p.enroll(d);

        p.enroll(c);

p.enroll(r);

    }




}

