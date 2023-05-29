package devices_pruefungsbespieldevices;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class DeviceDatabase {

    private ArrayList<Device> devices = new ArrayList<>();

    public ArrayList<Device> getDevices() {
        return devices = null;
    }


    public void addDevice(Device device) {
        devices.add(device);

    }

    public double calculateSumOfProductionCost() {
        double sum = 0;

        for (int i = 0; i < devices.size(); i++) {
            sum = sum + devices.get(i).calculateProductionCost();
        }

        //for (Device d: devices) { mit for-each schleife
        // sum.....


        return sum;
    }


    public Device findDeviceWithCheapestProductionCost() {
        double min = devices.get(0).calculateProductionCost();
        Device result = devices.get(0); // ist einfach das erste Objekt in der Arralist, und das vergleich tman dann
        double price = 0;
        for (int i = 0; i < devices.size(); i++) {
            price = devices.get(i).calculateProductionCost();
            if (price < min) {
                price = min;
                result = devices.get(i);

            }
        }
        return result;
    }

    public double calculateSupportCostUntilYear(Device device, int year) {
        double suppcost = 0;
        if (year < device.releaseYear) {
            suppcost = 0;
        }
        for (int i = device.releaseYear; i < year; ++i) {
            suppcost = suppcost + device.calculateSupportCostForAYear(i);
        }
        return suppcost;
    }

    public Device findDeviceWithHighestSupportCostUntil(int year) {

        double max = devices.get(0).calculateSupportCostForAYear(year); // null
        Device result = devices.get(0); // ist einfach das erste Objekt in der Arralist, und das vergleich tman dann
        // =-1 lt. lösung

        for (int i = 0; i < devices.size(); i++) {
            double cost = calculateSupportCostUntilYear(devices.get(i), year);

            if (cost > max) {
                max = cost;
                result = devices.get(i);
            }
        }
        return result;

    }

    public ArrayList<Device> findDevicesThatFulfillMinimumPerformance(HashMap<Integer, Integer> minimum) { // minimum integers werden eingegeben
        ArrayList<Device> result = new ArrayList<>();

        for (Device d : devices) {
          int procGeneration = d.getProcessor().getGeneration(); // legen uns hilfsvariable prozessorgeneration fest

          if (minimum.containsKey(procGeneration)) { //Fragen ab,ob hashmap bereits dieses prozessorgeneration enthält
              int procCores = d.getProcessor().getNrCores();  // Anzahl Prozessorkerne
              int minCores = minimum.get(procGeneration); //key ist prozessorgeneration
              if (procCores >=minCores) { // wenn Anzahl prozessorkerne größer oder gleich der anzahl ist die übergeben wird
                  result.add(d); // wird dieses device in die hashmap übergeben
              }

          }


        }


        return result;
    }





    public HashMap<String,Integer> numberDevicesGroupedbyConstructionCost(double lowBorder, double mediumBorder) {
        HashMap<String, Integer> ergebnis = new HashMap<>();

        ergebnis.put("low", 0); //werte sollen anzahl der Produkte sein - ergebnis.put und .get
        ergebnis.put("medium", 0);
        ergebnis.put("high", 0);

        for (Device d : devices) {
            double price = d.calculateProductionCost() / d.getNrProduced(); // kalkulierte Produktionskosten/ produzierte Anzahl
            if (price < lowBorder) {
                ergebnis.put("low", ergebnis.get("low") + 1); // zugehörigen value verändern
            }
            if (price > mediumBorder) {
                ergebnis.put("high", ergebnis.get("high") + 1);
            } else {
                ergebnis.put("medium", ergebnis.get("medium") + 1);

            }



        }return ergebnis;
    }

    public HashMap<String,Integer> numberDevicesGroupedbyConstructionCostZWEI(double lowBorder, double mediumBorder) {
        HashMap<String, Integer> ergebnis = new HashMap<>();

        int low = 0;
        int medium = 0;
        int high = 0;

        for (Device d : devices) {
            double price = d.calculateProductionCost() / d.getNrProduced(); // kalkulierte Produktionskosten/ produzierte Anzahl

            if (price < lowBorder) {
               low = low + 1; // zugehörigen value verändern
            }
            if (price > mediumBorder) {
              high = high +1;
            } else {
                medium = medium+1;

            }

            ergebnis.put("low", low); //werte sollen anzahl der Produkte sein - ergebnis.put und .get
            ergebnis.put("medium", medium);
            ergebnis.put("high",high);

        }return ergebnis;
    }





    public void sortedPrint() {
        Collections.sort(devices, new DeviceComparator());
            System.out.println(devices);
    }


}