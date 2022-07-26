import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Epic extends Task {
    private final Map<Integer, Subtask> subtasksEpic = new HashMap<>() ;

    public Epic(String description, String name, Status status) {
        super(description, name, status);
    }

    public Map<Integer, Subtask> getSubtasksEpic() {
        return subtasksEpic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Epic epic = (Epic) o;
        return Objects.equals(subtasksEpic, epic.subtasksEpic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), subtasksEpic);
    }

    @Override
    public String toString() {
        return "Epic{" +
                "subtasksEpic=" + subtasksEpic +
                ", description='" + description + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", status=" + status +
                '}';
    }
}
