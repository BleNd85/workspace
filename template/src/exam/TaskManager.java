package exam;

public class TaskManager {
    private static TaskManager instance;
    private TaskList allTasks;

    private TaskManager() {
        allTasks = new TaskList("All Tasks");
    }

    public static TaskManager getInstance() {
        if (instance == null) {
            instance = new TaskManager();
        }
        return instance;
    }

    public TaskList getAllTasks() {
        return allTasks;
    }

}

