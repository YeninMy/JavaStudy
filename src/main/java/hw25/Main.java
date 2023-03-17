package hw25;


public class Main {
    public static void main(String[] args) {
        Logger.createFile(Logger.pathLogs);
        Lecture lec1 = new Lecture(1, "Arrays", new Homework(1, "do something"));
        Logger.write(lec1);
        Lecture lec2 = new Lecture(2, "Lists", new Homework(2, "do it again"));
        Logger.write(lec2);
        Logger.readText(Logger.pathLogs);
    }

}
