package devices_pruefungsbespieldevices;

public class Smartphone extends Device {

    protected int nrCameras;

    public Smartphone(String name, Processor processor, int releaseYear, int nrProduced, int nrCameras) {
        super(name, processor, releaseYear, nrProduced);
        this.nrCameras = nrCameras;
    }

    @Override
    public String toString() {
        return "Smartphone{" +

                name + '\'' + ": " +
                nrProduced +
                '}';
    }

    @Override
    public double calculateProductionCost() {

        double sum = 0;

        sum = sum + (processor.getGeneration() * 100) + (nrCameras * 20);

        if (nrProduced >= 100000) {
            sum = sum * 0.9;
        }
        if (nrProduced >= 1000000) {
            sum = sum * 0.8;
        }

        return sum * nrProduced;
    }

    @Override
    public double calculateSupportCostForAYear(int year) {
        int diffYears = year -releaseYear;

        double suppcost = 0;

        if (diffYears==0 || diffYears==1) {
            return 0;}

        else suppcost = processor.getGeneration() * 40;
        return suppcost * nrProduced;
    }
}