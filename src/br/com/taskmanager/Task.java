package src.br.com.taskmanager;

public class Task {
    private String title;
    private String description;
    private String assignee;
    private boolean completed;

    public Task(String title, String description, String assignee) {
        this.title = title;
        this.description = description;
        this.assignee = assignee;
        this.completed = false;
    }

    // getters and setters

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}

