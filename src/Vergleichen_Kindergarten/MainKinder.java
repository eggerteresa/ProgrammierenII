package Vergleichen_Kindergarten;

public class MainKinder {
    public static void main(String[] args) {

        Kind kind1 = new Kind("susi", "maier", 13);
        Kind kind2 = new Kind("stefan", "maier", 14);
        Kind kind3 = new Kind("ulrich", "huber", 9);
        Kind kind4 = new Kind("franka", "huber", 11);
        Kind kind5 = new Kind("nelli", "huber", 10);

        Kindergarten kindergruppe = new Kindergarten("bienchen");

        kindergruppe.addKind(kind1);
        kindergruppe.addKind(kind2);
        kindergruppe.addKind(kind3);
        kindergruppe.addKind(kind4);
        kindergruppe.addKind(kind5);

        kindergruppe.sortAlphabetical();
kindergruppe.sortAge();
    }
}
