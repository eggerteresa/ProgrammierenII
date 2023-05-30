package Vergleichen_Kindergarten;

import java.util.Comparator;

public class AlphabeticalComarator implements Comparator <Kind> {


    @Override
    public int compare(Kind o1, Kind o2) {
  int s = o1.getZuname().compareTo(o2.getZuname());
        if (s == 0){
   s = o1.getVorname().compareTo(o2.getVorname());}
       return s;
    }


//   andere lösung: auch möglich lt. lösung:
//    public int compare (Kind o1, Kind o2) {
//        String o1.name = o1.getVorname() + " " + o1.getZuname();
//        String o2.name = o2.getVorname() + " " + o2.getZuname();
//
//        return o1Name.compareTo(o2Name);
//    }
}
