package devices_pruefungsbespieldevices;

import java.util.Comparator;

public class DeviceComparator implements Comparator<Device> {


    @Override
    public int compare(Device o1, Device o2) { //
        int s = Integer.compare(o1.getProcessor().getGeneration(), o2.getProcessor().getGeneration());
// hier sortieren wir eigentlich schon nach dem ersten Kriterium - Generation
        if (s == 0) {
            return Integer.compare(o1.getProcessor().getNrCores(), o2.getProcessor().getNrCores());
            //zweites Kriterium Anzahl der Kerne im Prozessor
        }
        return s;


    }


}