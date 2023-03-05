package hw22;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Logger {
    private Level level;
    public static int lv;
    static final String pathLogs = "yenin/src/hw22/logs.txt";

    static Logger logger = new Logger(Level.ERROR);

    public Logger() {
    }

    public Logger(Level level) {
        this.level = level;
    }

    public Level getLevel() {
        return level;
    }

    public void adjustLevel(Level level) {
        this.level = level;
        if (level == Level.INFO) {
            lv = 1;
        }
        if (level == Level.WARNING) {
            lv = 2;
        }
        if (level == Level.ERROR) {
            lv = 3;
        }
        if (level == Level.OFF) {
            lv = 4;
        }
    }

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

    public static Level getLevelFromFile() {
        String s = null;
        try {
            final Path p = Paths.get("yenin/src/hw22/level.txt");
            final List<String> strings = Files.readAllLines(p);
            for (String string : strings) {
                s = string;
                break;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Level l = null;
        if (Objects.equals(s, "DEBUG")){
            l = Level.DEBUG;
        }
        if (Objects.equals(s, "INFO")){
            l = Level.INFO;
        }
        if (Objects.equals(s, "WARNING")){
            l = Level.WARNING;
        }
        if (Objects.equals(s, "ERROR")){
            l = Level.ERROR;
        }
        if (Objects.equals(s, "OFF")){
            l = Level.OFF;
        }
        return l;
    }

    public static void write(final Level level, final String message) {
        int lv2 = 0;
        if (level == Level.INFO) {
            lv2 = 1;
        }
        if (level == Level.WARNING) {
            lv2 = 2;
        }
        if (level == Level.ERROR) {
            lv2 = 3;
        }
        if (level == Level.OFF) {
            lv2 = 4;
        }
        if (lv2 <= Logger.lv) {
            try {
                final Path p1 = Paths.get(pathLogs);
                Date d = new Date();
                String date = " " + new Date();
                String l = level.toString() + ":";
                Files.write(p1, System.getProperty("line.separator").getBytes(), StandardOpenOption.APPEND);
                Files.write(p1, l.getBytes(), StandardOpenOption.APPEND);
                Files.write(p1, date.getBytes(), StandardOpenOption.APPEND);
                Files.write(p1, System.getProperty("line.separator").getBytes(), StandardOpenOption.APPEND);
                Files.write(p1, message.getBytes(), StandardOpenOption.APPEND);
                System.out.println("Written done: " + message);
            } catch (
                    IOException e) {
                e.printStackTrace();
            }
        }
    }
}
