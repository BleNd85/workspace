package exam;

public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = TaskManager.getInstance();

        Task task1 = new Task("Task 1", new HighPriority());
        Task task2 = new Task("Task 2", new MediumPriority());
        Task task3 = new Task("Task 33", new MediumPriority());

        taskManager.getAllTasks().addTask(task1);
        taskManager.getAllTasks().addTask(task2);
        taskManager.getAllTasks().addTask(task3);

        task1.setPriorityStrategy(new LowPriority());

        TaskMemento memento1 = task1.createMemento();

        taskManager.getAllTasks().removeTask(task1);

        taskManager.getAllTasks().addTask(memento1.getState());

        for (Task task : taskManager.getAllTasks().getTasks()) {
            System.out.println("Task: " + task.getName() + ", Priority: " + task.getPriority());
        }
    }
}
