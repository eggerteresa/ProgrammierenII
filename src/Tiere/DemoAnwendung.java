package Tiere;

public class DemoAnwendung {
    public static void main(String[] args) {

        Frog quaxi = new Frog("gruen", 2);
        quaxi.makeNoise();
        quaxi.walk();
        System.out.println("quaxi zu animal");
  Animal quaxiAsAnimal = quaxi;
  quaxiAsAnimal.makeNoise();
  quaxiAsAnimal.walk();
  quaxi.makeNoise();
  quaxi.walk();




    }
}
