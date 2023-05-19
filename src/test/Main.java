package src.test;

import src.br.com.taskmanager.Task;
import src.br.com.taskmanager.TaskManager;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();

        // Criar algumas tarefas
        Task task1 = new Task("Fazer compras", "Comprar itens essenciais", "Pedro");
        Task task2 = new Task("Pagar contas", "Efetuar pagamentos mensais", "Maria");

        // Adicionar tarefas ao gerenciador
        taskManager.addTask(task1);
        taskManager.addTask(task2);

        // Listar todas as tarefas
        List<Task> allTasks = taskManager.getTasks();
        System.out.println("Todas as tarefas:");
        for (Task task : allTasks) {
            System.out.println("Título: " + task.getTitle());
            System.out.println("Descrição: " + task.getDescription());
            System.out.println("Responsável: " + task.getAssignee());
            System.out.println("Concluída: " + task.isCompleted());
            System.out.println();
        }

        // Marcar uma tarefa como concluída
        taskManager.markTaskAsCompleted(task1);

        // Listar tarefas por responsável
        List<Task> tasksByAssignee = taskManager.getTasksByAssignee("Pedro");
        System.out.println("Tarefas de Pedro:");
        for (Task task : tasksByAssignee) {
            System.out.println("Título: " + task.getTitle());
            System.out.println("Descrição: " + task.getDescription());
            System.out.println("Responsável: " + task.getAssignee());
            System.out.println("Concluída: " + task.isCompleted());
            System.out.println();
        }
    }
}
