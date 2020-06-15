package zajecia.car1;

public class App {
    public static void main(String[] args) {


        Car car1 = new Car("Vw", 200, 50);
        CarControler carControler = new CarControler(car1);


        System.out.println(car1.toString());
        carControler.increaseSpeed(20);
        System.out.println(car1.toString());
        carControler.turbo();
        System.out.println(car1.toString());
    }
}
