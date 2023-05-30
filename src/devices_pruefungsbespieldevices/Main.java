package devices_pruefungsbespieldevices;

import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // you can test your stuff however you like - it is not evaluated

        Processor processor = new Processor("prozessor1",2, 3);
        Processor p2 = new Processor("prozessor2", 3, 2);
        Smartphone phone1 = new Smartphone("handy", processor,2019,30, 1);
        Smartwatch smartwatch = new Smartwatch("watchi", p2, 2020, 20,5);
        Tablet tablet = new Tablet("tablettti", processor, 2018, 50,false);

        DeviceDatabase deviceDatabase = new DeviceDatabase();
        deviceDatabase.addDevice(phone1);
        deviceDatabase.addDevice(smartwatch);
        deviceDatabase.addDevice(tablet);

        deviceDatabase.sortedPrint();
        System.out.println("---------");

        System.out.println("ausgabe minimum processor"); //Methode fragt aber nur ab, ob generation passt und dann ob kerne dem minimum entsprechen
    HashMap <Integer,Integer > minimum = new HashMap<>();
    minimum.put(2,2);
    minimum.put(3,2);
        List<Device> d = deviceDatabase.findDevicesThatFulfillMinimumPerformance(minimum);
        System.out.println(d);


        System.out.println("test numberdevices");
        System.out.println(deviceDatabase.numberDevicesGroupedbyConstructionCost(200, 100));



    }
}
