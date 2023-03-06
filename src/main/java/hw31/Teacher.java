package hw31;

import lombok.Getter;
import lombok.Setter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

@Setter
@Getter
public class Teacher {
    private int id;
    private String name;

    private String email;

    public Teacher(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
        writeTeacher(Teacher.this, Path.of(Logger.pathLogs));
        teachers.add(Teacher.this);
    }

    public static void writeTeacher(Teacher teacher,Path path) {
        try {
            final Path p1 = path;
            final LocalDateTime now = LocalDateTime.now();
            final DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm", Locale.ENGLISH);
            final String date = dateFormatter.format(now) + " ";
            final String message = "Teacher added: ";
            final String teacherLog = teacher.toString();
            Files.write(p1, date.getBytes(), StandardOpenOption.APPEND);
            Files.write(p1, message.getBytes(), StandardOpenOption.APPEND);
            Files.write(p1, teacherLog.getBytes(), StandardOpenOption.APPEND);
            Files.write(p1, System.getProperty("line.separator").getBytes(), StandardOpenOption.APPEND);
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }
    public static List<Teacher> teachers = new ArrayList<>();

    public static Teacher getById(int id) {
        for (Teacher teacher : teachers) {
            if (teacher.getId() == id) {
                return teacher;
            }
        }
        return null;
    }

    public boolean isEmailValid() {
        if (getEmail().contains("@")) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return id == teacher.id && Objects.equals(name, teacher.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
