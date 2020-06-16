package zajecia.homework.tv;

public class App {
    public static void main(String[] args) {
        Televisor televisor = new Televisor();

        televisor.status();
        televisor.turnOn();
        televisor.status();
        televisor.turnOff();
        televisor.status();
    }
}
