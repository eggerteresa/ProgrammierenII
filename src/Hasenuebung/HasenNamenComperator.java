package Hasenuebung;

import java.util.Comparator;

public class HasenNamenComperator implements Comparator<Hase> {

    @Override
    public int compare(Hase o1, Hase o2) {
        return o1.name.compareTo(o2.name);
        // mit zwei Kriterien
//        int ret = o1.name.compareTo(o2.name); // wenn man es sehr häufig braucht, dann besser so
//        if (ret ==0) {
//
//
//        }
//        else {
//            return ret;
//        }

    }
}
