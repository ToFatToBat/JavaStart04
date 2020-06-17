package homework.toDo;

public class App {
    public static void main(String[] args) {
        Person person1 = new Person("Karol", "Papiernia");
        ToDoList zadanie1 = new ToDoList("Zakupy", "Domestos", 2,person1);

        zadanie1.lowPriority();
    }
}
