package hw25;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;


public class Lecture {
    private int id;
    private String topic;
    private Homework homework;

    private LocalDateTime date = LocalDateTime.now();

    public LocalDateTime getDate() {
        return date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public Homework getHomework() {
        return homework;
    }

    public void setHomework(Homework homework) {
        this.homework = homework;
    }

    public Lecture() {
    }

    public Lecture(int id, String topic, Homework homework) {
        this.id = id;
        this.topic = topic;
        this.homework = homework;
        this.homework.setDeadline(getDate().plusDays(1).withHour(12).withMinute(00));
    }

    DateTimeFormatter lecFormatter = DateTimeFormatter.ofPattern("MMM d, EEEE HH:mm:ss", Locale.ENGLISH);

    @Override
    public String toString() {
        return "Lecture{" +
                "id = " + id +
                ", date = " + lecFormatter.format(date) +
                ", topic = '" + topic + '\'' +
                "\n" + homework +
                '}';
    }
}