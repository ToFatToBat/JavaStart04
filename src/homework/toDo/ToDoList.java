package homework.toDo;

import static homework.toDo.Priority.*;

public class ToDoList {
    private String name;
    private String description;
    private Priority priority;
    // private int priority;
    Person person;

    public ToDoList(String name, String description, Priority priority, Person person) {
        this.name = name;
        this.description = description;
        this.priority = priority;
        this.person = person;
    }

    public ToDoList(String name, String description, Priority priority) {
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

    public boolean highPriority() {
        if (priority == HIGH) {
            return true;
        } else return false;
    }

    public boolean mediumPriority() {
        if (priority == MEDIUM) {
            return true;
        }else return false;
    }

    public boolean lowPriority() {
        if (priority == LOW) {
            return true;
        }else return false;

    }

    @Override
    public String toString() {
        return "ToDoList{" +
                "name='" + name + '\'' +
                ", description= '" + description + '\'' +
                ", priority=" + priority +
                ", person=" + person +
                '}';
    }
}
