package hw24;

import java.io.Serializable;

public class Homework implements Serializable {
    private int id;
    private String task;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public Homework(int id) {
        this.id = id;
    }

    public Homework(int id, String task) {
        this.id = id;
        this.task = task;
    }

    @Override
    public String toString() {
        return "Homework{" +
                "id=" + id +
                ", task='" + task + '\'' +
                '}';
    }
}
