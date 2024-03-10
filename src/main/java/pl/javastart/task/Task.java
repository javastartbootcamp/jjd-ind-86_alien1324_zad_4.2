package pl.javastart.task;

public class Task {
    private final String name;
    private final String info;
    private int priority;
    private Person worker;

    public Task(String name, String info, int priority, Person worker) {
        this(name, info, priority);
        this.worker = worker;
    }

    public Task(String name, String info, int priority) {
        this(name, info);
        this.priority = priority;
    }

    public Task(String name, String info) {
        this.name = name;
        this.info = info;
    }

    public boolean highPriority() {
        return priority > 0;
    }

    public boolean mediumPriority() {
        return priority == 0;
    }

    public boolean lowPriority() {
        return priority < 0;
    }

    public Person getWorker() {
        return worker;
    }

    public String getName() {
        return name;
    }

    public String getInfo() {
        return info;
    }
}
