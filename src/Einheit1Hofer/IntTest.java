package Einheit1Hofer;

public class IntTest {

    public static void main(String[] args) {
        int a1 = 12;

        Integer a2 = new Integer(13); // komplexer Referenztyp
        Integer a3 = 14; //autoboxing

        System.out.println(a1);
        System.out.println(a2);
        String test = "55";
        System.out.println(test +5); //Ergibt aber nur 555
        int testalszahl = Integer.parseInt(test);
        System.out.println(testalszahl +5); // rechnet es dann tatsächlich zusammen, weil vorher String zu zahl umgewandelt



    }

}
