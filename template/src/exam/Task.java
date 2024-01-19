package exam;

public class Task {
    private String name;
    private PriorityStrategy priorityStrategy;

    public Task(String name, PriorityStrategy priorityStrategy) {
        this.name = name;
        this.priorityStrategy = priorityStrategy;
    }

    public Task(Task task) {
        this.name = task.name;
        this.priorityStrategy = task.priorityStrategy;
    }

    public String getName() {
        return name;
    }

    public void setPriorityStrategy(PriorityStrategy priorityStrategy) {
        this.priorityStrategy = priorityStrategy;
    }

    public String getPriority() {
        return priorityStrategy.getPriority();
    }

    public TaskMemento createMemento() {
        return new TaskMemento(this);
    }

    public void restoreFromMemento(TaskMemento memento) {
        this.name = memento.getState().getName();
        this.priorityStrategy = memento.getState().priorityStrategy;
    }
}
