public class Task {
    private String description;
    private int priority; // 1: High, 2: Medium, 3: Low

    // Constructor mới: có description và priority
    public Task(String description, int priority) {
        this.description = description;
        this.priority = priority;
    }

    // Getter cho description
    public String getDescription() {
        return description;
    }

    // Getter cho priority
    public int getPriority() {
        return priority;
    }
}
