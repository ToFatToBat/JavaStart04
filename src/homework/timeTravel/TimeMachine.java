package homework.timeTravel;

public class TimeMachine {

    public void backInTime(Person person) {
        person.setAge(person.getAge() - 1);
    }

    public void timeTravel (Person person, int yearsToTravel) {
        person.setAge(person.getAge() + yearsToTravel);
    }
}
