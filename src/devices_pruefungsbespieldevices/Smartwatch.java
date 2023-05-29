package devices_pruefungsbespieldevices;

public class  Smartwatch extends Device {

    protected int nrWristSizes;

    public Smartwatch(String name, Processor processor, int releaseYear, int nrProduced, int nrWristSizes) {
        super(name, processor, releaseYear, nrProduced);
        this.nrWristSizes = nrWristSizes;
    }

    public int getNrWristSizes() {
        return nrWristSizes;
    }

    public void setNrWristSizes(int nrWristSizes) {
        this.nrWristSizes = nrWristSizes;
    }

    @Override
    public String toString() {
        return "Smartwatch{" +
               name + '\'' + ": " +
                nrProduced +
                '}';
    }

    @Override
    public double calculateProductionCost() {

        return (nrProduced* (100 +(nrWristSizes-1)*10));

    }

    @Override
    public double calculateSupportCostForAYear(int year) {


        return processor.getNrCores()*10*nrProduced;
    }
}