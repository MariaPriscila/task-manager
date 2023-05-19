package src.br.com.taskmanager;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<src.br.com.taskmanager.Task> tasks;

    public TaskManager() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(src.br.com.taskmanager.Task task) {
        tasks.add(task);
    }

    public void removeTask(src.br.com.taskmanager.Task task) {
        tasks.remove(task);
    }

    public List<src.br.com.taskmanager.Task> getTasks() {
        return tasks;
    }

    public List<src.br.com.taskmanager.Task> getTasksByAssignee(String assignee) {
        List<src.br.com.taskmanager.Task> tasksByAssignee = new ArrayList<>();
        for (src.br.com.taskmanager.Task task : tasks) {
            if (task.getAssignee().equals(assignee)) {
                tasksByAssignee.add(task);
            }
        }
        return tasksByAssignee;
    }

    public void markTaskAsCompleted(Task task) {
        task.setCompleted(true);
    }
}
