package hw27;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Lecture {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Lecture(int id, String name) {
        this.id = id;
        this.name = name;
        try {
            final Path p1 = Paths.get(Logger.pathLogs);
            final LocalDateTime d = LocalDateTime.now();
            final DateTimeFormatter logsFormatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss", Locale.ENGLISH);
            final String date = logsFormatter.format(d) + " ";
            final String logsId = " id= " + id + ":";
            final String logsName = " " + name;
            final String message = "Lecture added";
            final String message2 = " " + message + ":";
            Files.write(p1, date.getBytes(), StandardOpenOption.APPEND);
            Files.write(p1, message2.getBytes(), StandardOpenOption.APPEND);
            Files.write(p1, logsId.getBytes(), StandardOpenOption.APPEND);
            Files.write(p1, logsName.getBytes(), StandardOpenOption.APPEND);
            Files.write(p1, System.getProperty("line.separator").getBytes(), StandardOpenOption.APPEND);
            System.out.println(message);
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Lecture{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
