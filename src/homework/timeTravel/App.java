package homework.timeTravel;

public class App {
    public static void main(String[] args) {
        Person person1 = new Person("Edek", "Sprzeglo", 21);
        TimeMachine timeMachine = new TimeMachine();


        System.out.println(person1.toString());
        timeMachine.backInTime(person1);
        System.out.println(person1.toString());
        timeMachine.timeTravel(person1, 25);
        System.out.println(person1.toString());
        timeMachine.timeTravel(person1, -45);
        System.out.println(person1.toString());

    }
}
