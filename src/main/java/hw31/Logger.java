package hw31;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Logger {
    static final String pathLogs = "src/main/java/hw31/logs.txt";

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
    public static void readText(final String path) throws NoSuchFileException{
        try {
            final Path p = Paths.get(path);
            final List<String> strings = Files.readAllLines(p);
            for (String string : strings) {
                System.out.println(string);
            }
        } catch (IOException e) {
            throw new NoSuchFileException(path);
        }
    }
    public static List logsToList(final String path) throws NoSuchFileException{
        List<String> strings = null;
        try {
            final Path p = Paths.get(path);
            strings = Files.readAllLines(p);
        } catch (IOException e) {
            throw new NoSuchFileException(path);
        }
        return strings;
    }
}

