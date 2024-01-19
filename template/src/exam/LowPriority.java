package exam;

public class LowPriority implements PriorityStrategy {
    @Override
    public String getPriority() {
        return "Low";
    }
}