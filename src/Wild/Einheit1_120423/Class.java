package Wild.Einheit1_120423;

public class Class {
    private String name;
    private int hours;
    private int maxCapacity;
    private int enrolledStudents;


    public Class(String name, int hours, int maxCapacity, int enrolledStudents) {
        this.name = name;
        this.hours = hours;
        this.maxCapacity = maxCapacity;
        this.enrolledStudents = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public int getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setEnrolledStudents(int enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }



    public boolean maxCapacityReached () { // könnte man auch mit boolean machen
boolean capfull= false;
        if(enrolledStudents<maxCapacity){
           // System.out.println("Es ist noch Platz");
            capfull=false;
        }
        if (enrolledStudents>=maxCapacity) {
          //  System.out.println("Der Kurs ist voll");
            capfull=true;
        }
        return capfull;
    }
    public void enroll() {
        if (maxCapacityReached()) {
            System.out.println("Schon voll!");
        } else {
            System.out.println("Angemeldet");
            enrolledStudents++;
        }
    }



}
