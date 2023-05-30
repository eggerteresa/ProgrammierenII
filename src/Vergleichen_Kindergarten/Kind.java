package Vergleichen_Kindergarten;

public class Kind {
    private String vorname;
    private String zuname;
    private int age;

    public Kind(String vorname, String zuname, int age) {
        this.vorname = vorname;
        this.zuname = zuname;
        this.age = age;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getZuname() {
        return zuname;
    }

    public void setZuname(String zuname) {
        this.zuname = zuname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Kind " +
                "vorname='" + vorname + '\'' +
                ", zuname='" + zuname + '\'' +
                ", age=" + age ;
    }
}
