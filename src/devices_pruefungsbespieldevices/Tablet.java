package devices_pruefungsbespieldevices;

public class  Tablet extends Device{

protected boolean arCamera = false;

    public Tablet(String name, Processor processor, int releaseYear, int nrProduced, boolean arCamera) {
        super(name, processor, releaseYear, nrProduced);
        this.arCamera = arCamera;
    }

    public boolean isArCamera() {
        return arCamera;
    }

    public void setArCamera(boolean arCamera) {
        this.arCamera = arCamera;
    }

    @Override
    public String toString() {
        return "Tablet " +
                 name + '\'' +": " +
                nrProduced +
                '}';
    }

    @Override
    public double calculateProductionCost() {
        double sum = 0;
         switch (processor.getGeneration()) {
             case 1:
                 if (processor.getNrCores() == 1) {
                     sum = 150;
                 }
                 if (processor.getNrCores() >=2) {
                     sum = 200;

                 }
                 break;

             case 2:
             if (processor.getNrCores() <=3) {
                 sum = 350;
             }
             if (processor.getNrCores() >3 && processor.getNrCores() <8) {
                 sum = 400;

             }
             if (processor.getNrCores() >= 8) {
                 sum = 450;

             }
                 break;
             case 3:
                 sum = 700;
                 break;

         }

        if (arCamera == true) {
            sum = sum +50;
        }

        return sum*nrProduced;
    }



    @Override
    public double calculateSupportCostForAYear(int year) {
       double suppcost= nrProduced*50;
       int diff = year - releaseYear;

       if (diff>0 && diff <=10) {
           suppcost = suppcost *((10-diff)/10);
       }

       if (diff >10) {
           suppcost = 0;
       }

        return suppcost;
       //return nrProduced* (50 * (1-diff *0.1))); kürzer möglich
    }
}