package hw31;

import lombok.Getter;
import lombok.Setter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;


@Getter
@Setter
public class Lecture {
    private int id;
    private String name;

    private Teacher teacher;

    public Lecture(int id, String name, Teacher teacher) {
        this.id = id;
        this.name = name;
        this.teacher = teacher;
        try {
            final Path p1 = Paths.get(Logger.pathLogs);
            final LocalDateTime now = LocalDateTime.now();
            final DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm", Locale.ENGLISH);
            final String date = dateFormatter.format(now) + " ";
            final String message = "Lecture added: ";
            final String lectureLog = Lecture.this.toString();
            Files.write(p1, date.getBytes(), StandardOpenOption.APPEND);
            Files.write(p1, message.getBytes(), StandardOpenOption.APPEND);
            Files.write(p1, lectureLog.getBytes(), StandardOpenOption.APPEND);
            Files.write(p1, System.getProperty("line.separator").getBytes(), StandardOpenOption.APPEND);
        } catch (
                IOException e) {
            e.printStackTrace();
        }
        lectures.add(Lecture.this);
    }

    public static List<Lecture> lectures = new ArrayList<>();
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lecture lecture = (Lecture) o;
        return id == lecture.id && Objects.equals(name, lecture.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Lecture{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", teacher=" + teacher +
                '}';
    }
}
