package hw25;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class Homework {

    private int id;
    private String task;
    private LocalDateTime deadline;

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

    public LocalDateTime getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDateTime deadline) {
        this.deadline = deadline;
    }

    public Homework() {
    }

    public Homework(int id, String task) {
        this.id = id;
        this.task = task;
    }
    DateTimeFormatter deadlineFormatter = DateTimeFormatter.ofPattern("MMM d, HH:mm", Locale.ENGLISH);
    @Override
    public String toString() {
        return "Homework{" +
                "id = " + id +
                ", deadline = " + deadlineFormatter.format(deadline) +
                ", task = '" + task + '\'' +
                '}';
    }
}
