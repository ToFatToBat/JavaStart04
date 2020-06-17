package homework.toDo;

public enum Priority {
    HIGH("Wysoki"), MEDIUM("Sredni"), LOW("Niski");

    private final String description;

    Priority(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
