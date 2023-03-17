package hw25;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;

public class Logger {

    static final String pathLogs = "yenin/src/hw25/logs.txt";

    public static void createFile(final String path) {
        try {
            final Path p = Paths.get(path);
            if (Files.exists(p)) {
                System.out.println("This file exists: " + p);
            } else {
                final Path done = Files.createFile(p);
                System.out.println("File created: " + done);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void write(final Lecture lecture) {
        try {
            final Path p1 = Paths.get(pathLogs);
            LocalDateTime d = LocalDateTime.now();
            DateTimeFormatter logsFormatter = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss:SSS", Locale.ENGLISH);
            String date = logsFormatter.format(d);
            Files.write(p1, System.getProperty("line.separator").getBytes(), StandardOpenOption.APPEND);
            Files.write(p1, date.getBytes(), StandardOpenOption.APPEND);
            Files.write(p1, System.getProperty("line.separator").getBytes(), StandardOpenOption.APPEND);
            Files.write(p1, lecture.toString().getBytes(), StandardOpenOption.APPEND);
            Files.write(p1, System.getProperty("line.separator").getBytes(), StandardOpenOption.APPEND);
            System.out.println("Written done.");
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }

    public static void readText(final String path) {
        try {
            final Path p = Paths.get(path);
            final List<String> strings = Files.readAllLines(p);
            for (String string : strings) {
                System.out.println(string);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

