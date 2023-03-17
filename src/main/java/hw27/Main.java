package hw27;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) throws IOException {
        Logger.createFile(Logger.pathLogs);
        List<Teacher> teachers = new ArrayList<>();
        teachers.add(new Teacher(1, "Vlad", "Bedrytskiy"));
        Lecture l1 = new Lecture(1, "Arrays");
        teachers.add(new Teacher(2, "Bogdan", "Shelest"));
        teachers.add(new Teacher(3, "Sveta", "Zhuravel"));
        Lecture l2 = new Lecture(2, "Enum");
        teachers.add(new Teacher(4, "Vadim", "Vasenin"));
        teachers.add(new Teacher(5, "Yura", "Poloskun"));
        teachers.add(new Teacher(6, "Dima", "Prikolchic"));
        Lecture l3 = new Lecture(3, "List");
        teachers.add(new Teacher(7, "Nastya", "Ponomarenko"));
        teachers.add(new Teacher(8, "Ruslan", "Chailo"));
        teachers.add(new Teacher(9, "Lena", "Rybnizkaya"));
        teachers.add(new Teacher(10, "Luke", "Lalor"));

        Lecture l4 = null;
        Optional<Lecture> optionalLecture = Optional.ofNullable(l4);
        l4 = optionalLecture.orElse(new Lecture(4,"Streams"));

        teachers.stream()
                .sorted((t1, t2) -> t1.getLastName().compareTo(t2.getLastName()))
                .filter(t -> t.getLastName().toLowerCase().substring(0,1).matches("[abcdfghijklm]"))
                .forEach(System.out::println);

        Files.lines(Paths.get(Logger.pathLogs))
                .filter(s -> s.contains("Lecture"))
                .forEach(System.out::println);
    }
}
