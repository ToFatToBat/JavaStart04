package homework.toDo;

public class App {
    public static void main(String[] args) {
        Person person1 = new Person("Karol", "Papiernia");
        ToDoList zadanie1 = new ToDoList("Zakupy", "Domestos", -2,person1);
        ToDoList zadanie2 = new ToDoList("Zakupy chemii do detailingu", "ADBL Vampire, Fusso Soft99 Dark, ADBL Foam, Aqua APC", 3, person1);

        zadanie1.lowPriority();
        zadanie1.mediumPriority();
        zadanie1.highPriority();

        zadanie2.lowPriority();
        zadanie2.mediumPriority();
        zadanie2.highPriority();


    }
}
