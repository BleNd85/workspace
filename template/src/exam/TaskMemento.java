package exam;

public class TaskMemento {
    private Task state;

    public TaskMemento(Task task) {
        this.state = new Task(task);
    }

    public Task getState() {
        return state;
    }
}
