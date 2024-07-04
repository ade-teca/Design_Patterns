package composite;

// Client
public class TaskManagementApp {
    public static void main(String[] args) {
        // Creating simple tasks
        Task simpleTask1 = new SimpleTask("Código terminado");
        Task simpleTask2 = new SimpleTask("Escrever documentação");

        // Creating a task list
        TaskList projectTasks = new TaskList("Tarefas");
        projectTasks.addTask(simpleTask1);
        projectTasks.addTask(simpleTask2);

        // Nested task list
        TaskList phase1Tasks = new TaskList("Fase 1 da tarefa");
        phase1Tasks.addTask(new SimpleTask("Design"));
        phase1Tasks.addTask(new SimpleTask("Implementação"));

        projectTasks.addTask(phase1Tasks);

        // Displaying tasks
        projectTasks.display();
    }
}
