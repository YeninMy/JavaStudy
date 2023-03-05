package hw29;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Logger.createFile(Logger.pathLogs);
        Person t1 = new Person(1, "Vadya", "Bedrytskiy", "vb@gmail.com", Role.TEACHER);
        Person t2 = new Person(2, "Bogdan", "Shelest", "bs@gmail.com", Role.TEACHER);
        Person t3 = new Person(3, "Dima", "Prikolchic", "dp@gmail.com", Role.TEACHER);
        Lecture.lectures.add(new Lecture(1, "Integer", t1));
        Lecture.lectures.add(new Lecture(2, "Enum", t2));
        Lecture.lectures.add(new Lecture(3, "Arrays", t2));
        Lecture.lectures.add(new Lecture(4, "Stream p.1", t3));
        Lecture.lectures.add(new Lecture(5, "Stream p.2", t3));
        Lecture.lectures.add(new Lecture(6, "Stream p.3", t3));
        Person s1 = new Person(4, "Vadym", "Vasenin", "vv@gmail.com", Role.STUDENT);
        Person s2 = new Person(5, "Sveta", "Zhuravel", "sz@gmail.com", Role.STUDENT);
        Person s3 = new Person(6, "Dima", "Ananiev", "da@gmail.com", Role.STUDENT);
        Person s4 = new Person(7, "Andriy", "Yazenko", "ay@gmail.com", Role.STUDENT);
        Person s5 = new Person(8, "Vasya", "Odyn", "vo@gmail.com", Role.STUDENT);
        Person s6 = new Person(9, "Gena", "Telesh", "gt@gmail.com", Role.STUDENT);
        Person s7 = new Person(10, "Yulia", "Telesh", "yt@gmail.com", Role.STUDENT);
        Person s8 = new Person(11, "Ksysha", "Zhuravel", "kz@gmail.com", Role.STUDENT);
        Person s9 = new Person(12, "Denis", "Berezin", "db@gmail.com", Role.STUDENT);
        Person s10 = new Person(13, "Misha", "Yenin", "my@gmail.com", Role.STUDENT);
        List<Person> persons = Arrays.asList(t1, t2, t3, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10);
        Material m1 = new Material(1, Type.VIDEO);
        Material m2 = new Material(2, Type.URL);
        Material m3 = new Material(3, Type.VIDEO);
        Material m4 = new Material(4, Type.BOOK);
        Material m5 = new Material(5, Type.URL);
        Material m6 = new Material(6, Type.VIDEO);
        Material m7 = new Material(7, Type.BOOK);
        Material m8 = new Material(8, Type.VIDEO);
        Material m9 = new Material(9, Type.URL);
        Material m10 = new Material(10, Type.VIDEO);
        Lecture.getById(1).setMaterials(Arrays.asList(m1, m2));
        Lecture.getById(2).setMaterials(Arrays.asList(m3, m4));
        Lecture.getById(3).setMaterials(Arrays.asList(m5, m6, m7));
        Lecture.getById(4).setMaterials(Arrays.asList(m8));
        Lecture.getById(5).setMaterials(Arrays.asList(m9));
        Lecture.getById(6).setMaterials(Arrays.asList(m10));

        System.out.println("Lectures grouped by Teacher:");
        Map<Person, List<Lecture>> map1 = Lecture.lectures.stream()
                .sorted((l1, l2) -> l1.getPerson().getFirstName().compareTo(l2.getPerson().getFirstName()))
                .collect(Collectors.groupingBy(Lecture::getPerson));
        map1.entrySet().forEach(System.out::println);


        System.out.println("Materials grouped by Lecture:");
        Map<List<Material>, List<Lecture>> map2 = Lecture.lectures.stream()
                .collect(Collectors.groupingBy(Lecture::getMaterials));
        map2.entrySet().stream()
                .sorted(Comparator.comparingInt(entry -> entry.getValue().get(0).getId()))
                .forEach(System.out::println);


        System.out.println("Persons emails:");
        Map<String, String> map3 = persons.stream()
                .sorted((p1, p2) -> p1.getEmail().compareTo(p2.getEmail()))
                .collect(Collectors.toMap(
                        Person::getEmail,
                        p -> p.getFullName()));
        map3.entrySet().stream()
                .sorted(Comparator.comparing(Map.Entry::getKey))
                .forEach(System.out::println);

        System.out.println("Students emails from list:");
        List<String> studentsEmails = persons.stream()
                .filter(p -> p.getRole() != Role.TEACHER)
                .sorted(Comparator.comparing(Person::getEmail))
                .map(Person::getEmail)
                .collect(Collectors.toList());

        for (String s : studentsEmails) {
            try {
                final Path p1 = Paths.get(Logger.pathLogs);
                Files.write(p1, s.getBytes(), StandardOpenOption.APPEND);
                Files.write(p1, System.getProperty("line.separator").getBytes(), StandardOpenOption.APPEND);
            } catch (
                    IOException e) {
                e.printStackTrace();
            }
        }
        Logger.readText(Logger.pathLogs);
    }
}