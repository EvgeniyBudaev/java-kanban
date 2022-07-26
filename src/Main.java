import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Manager manager = new Manager();

        System.out.println("*** Tests ***");
        manager.createTask(new Task("Описание-1", "Task-1", Status.NEW));
        manager.createTask(new Task("Описание-2", "Task-2", Status.NEW));
        manager.createEpic(new Epic("Описание-1", "Epic-1", Status.NEW));
        manager.createEpic(new Epic("Описание-2", "Epic-2", Status.NEW));
        manager.createSubtask(new Subtask("Описание-1", "Subtask-1", Status.NEW, 3));
        manager.createSubtask(new Subtask("Описание-2", "Subtask-2", Status.NEW, 3));
        manager.createSubtask(new Subtask("Описание-3", "Subtask-3", Status.NEW, 4));

        System.out.println("--- Get all tasks ---");
        Map<Integer, Task> tasks = manager.getAllTasks();
        System.out.println(tasks);

        System.out.println("--- Get all epics ---");
        Map<Integer, Epic> epics = manager.getAllEpics();
        System.out.println(epics);

        System.out.println("--- Get all subtasks ---");
        Map<Integer, Subtask> subtasks = manager.getAllSubtasks();
        System.out.println(subtasks);

        System.out.println("--- Update ---");
        Task task = manager.getTaskById(1);
        task.setStatus(Status.IN_PROGRESS);
        Subtask subtask = manager.getSubtaskById(5);
        subtask.setStatus(Status.IN_PROGRESS);
        manager.updateSubtask(subtask);
        Epic epic = manager.getEpicById(3);
        System.out.println(epic);

        System.out.println("--- Delete task ---");
        manager.deleteTaskById(1);
        manager.printTasks();
        System.out.println("--- Delete epic ---");
        manager.deleteEpicById(3);
        manager.printEpics();

//        System.out.println("*** Task ***");
//        System.out.println("--- Create task ---");
//        manager.createTask(new Task("Описание-1", "Task-1", Status.NEW));
//        manager.createTask(new Task("Описание-2", "Task-2", Status.NEW));
//        manager.printTasks();
//        System.out.println("--- Get all tasks ---");
//        Map<Integer, Task> tasks = manager.getAllTasks();
//        System.out.println(tasks);
//        System.out.println("--- Get task by id ---");
//        Task task = manager.getTaskById(1);
//        System.out.println(task);
//        System.out.println("--- Update task ---");
//        task.setStatus(Status.IN_PROGRESS);
//        manager.updateTask(task);
//        System.out.println(task);
//        System.out.println("--- Delete task by id ---");
//        manager.deleteTaskById(1);
//        System.out.println(tasks);
//        System.out.println("--- Delete all tasks ---");
//        manager.deleteAllTasks();
//        manager.printTasks();
//        System.out.println();

//        System.out.println("*** Epic ***");
//        System.out.println("--- Create epic ---");
//        manager.createEpic(new Epic("Описание-1", "Epic-1", Status.NEW));
//        manager.createEpic(new Epic("Описание-2", "Epic-2", Status.NEW));
//        manager.printEpics();
//        System.out.println("--- Get all epics ---");
//        Map<Integer, Epic> epics = manager.getAllEpics();
//        System.out.println(epics);
//        System.out.println("--- Get epic by id ---");
//        Epic epic = manager.getEpicById(3);
//        System.out.println(epic);
//        System.out.println("--- Update epic ---");
        //epic.setStatus(Status.IN_PROGRESS);
//        manager.updateEpic(epic);
//        System.out.println(epic);
//        System.out.println("--- Delete epic by id ---");
//        manager.deleteEpicById(1);
//        manager.printEpics();
//        System.out.println("--- Delete all epics ---");
//        manager.deleteAllEpics();
//        manager.printEpics();
//        System.out.println();

//        System.out.println("*** Subtask ***");
//        System.out.println("--- Create subtask ---");
//        manager.createSubtask(new Subtask("Описание-1", "Subtask-1", Status.NEW, 3));
//        manager.createSubtask(new Subtask("Описание-2", "Subtask-2", Status.NEW, 3));
//        manager.createSubtask(new Subtask("Описание-3", "Subtask-3", Status.NEW, 4));
//        manager.createSubtask(new Subtask("Описание-4", "Subtask-4", Status.NEW, 4));
//        manager.printSubtasks();
//        System.out.println("--- Get all subtasks by epic id ---");
//        Map<Integer, Subtask> subtasksByEpicId = manager.getAllSubtasksByEpicId(3);
//        System.out.println(subtasksByEpicId);
//        System.out.println("--- Get all subtasks ---");
//        Map<Integer, Subtask> subtasks = manager.getAllSubtasks();
//        System.out.println(subtasks);
//        System.out.println("--- Get subtask by id ---");
//        Subtask subtask = manager.getSubtaskById(5);
//        System.out.println(subtask);
//        System.out.println("--- Update subtask ---");
//        subtask.setStatus(Status.IN_PROGRESS);
//        manager.updateSubtask(subtask);
//        System.out.println(subtask);
//        System.out.println("--- Delete subtask by id ---");
//        manager.deleteSubtaskById(5);
//        manager.printSubtasks();
//        System.out.println("--- Delete all subtasks ---");
//        manager.deleteAllSubtasks();
//        manager.printSubtasks();
    }
}
