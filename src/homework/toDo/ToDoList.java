package homework.toDo;

public class ToDoList {
    private String name;
    private String description;
    // private Priority priority;
    private int priority;
    Person person;

    public ToDoList(String name, String description, int priority, Person person) {
        this.name = name;
        this.description = description;
        this.priority = priority;
        this.person = person;
    }

    public ToDoList(String name, String description, int priority) {
        this.name = name;
        this.description = description;
        this.priority = priority;
    }

    public ToDoList(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void highPriority() {
        if (priority > 0) {
            System.out.println("true");
        }else System.out.println("false");

    }

    public void mediumPriority() {
        if (priority == 0) {
            System.out.println("true");
        }
    }

    public void lowPriority() {
        if (priority < 0) {
            System.out.println("true");
        }else System.out.println("false");

    }

    @Override
    public String toString() {
        return "ToDoList{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", priority=" + priority +
                ", person=" + person +
                '}';
    }
}
