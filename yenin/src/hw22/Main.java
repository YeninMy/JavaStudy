package hw22;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        Logger.logger.adjustLevel(Logger.getLevelFromFile());
        final String pathLogs = "yenin/src/hw22/logs.txt";
        Logger.createFile(pathLogs);
        Logger.write(Level.DEBUG, "0");
        Logger.write(Level.INFO, "1");
        Logger.write(Level.WARNING, "2");
        Logger.write(Level.ERROR, "3");



    }
}
