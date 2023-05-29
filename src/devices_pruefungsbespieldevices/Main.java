package devices_pruefungsbespieldevices;

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


    }
}
