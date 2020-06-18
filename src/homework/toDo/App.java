package homework.toDo;

public class App {
    public static void main(String[] args) {
        Person person1 = new Person("Karol", "Papiernia");
        ToDoList zadanie1 = new ToDoList("Zakupy", "Domestos", Priority.LOW,person1);
        ToDoList zadanie2 = new ToDoList("Zakupy chemii do detailingu", "ADBL Vampire, Fusso Soft99 Dark, ADBL Foam, Aqua APC", Priority.HIGH, person1);

        System.out.println(zadanie1.lowPriority());
        System.out.println(zadanie1.mediumPriority());
        System.out.println(zadanie1.highPriority());


        System.out.println(zadanie2.lowPriority());
        System.out.println(zadanie2.mediumPriority());
        System.out.println(zadanie2.highPriority());



    }
}
