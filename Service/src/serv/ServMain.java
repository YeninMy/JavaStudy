package serv;

import data.Role;
import data.Person;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import data.DalMain;

import static data.Data.persons;

public class ServMain {
    public static void main(String[] args) {
        DalMain.main(args);
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