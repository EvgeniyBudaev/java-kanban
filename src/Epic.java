import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Epic extends Task {
    private final Map<Integer, Subtask> subTasksEpic = new HashMap<>() ;

    public Epic(String description, String name) {
        super(description, name);
    }

    public Map<Integer, Subtask> getSubTasksEpic() {
        return subTasksEpic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Epic epic = (Epic) o;
        return Objects.equals(subTasksEpic, epic.subTasksEpic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), subTasksEpic);
    }

    @Override
    public String toString() {
        return "Epic{" +
                "subTasksEpic=" + subTasksEpic +
                ", description='" + description + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", status=" + status +
                '}';
    }
}
