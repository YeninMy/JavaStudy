package hw28;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.stream.Collectors;

public class Person {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    public static List<Person> persons = new ArrayList<>();

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        final Path p1 = Paths.get(Logger.pathLogs);
        final LocalDateTime d = LocalDateTime.now();
        final DateTimeFormatter logsFormatter =
                DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss", Locale.ENGLISH);
        final String date = logsFormatter.format(d) + " ";
        final String level = "INFO:";
        String message = null;
        if (this.email != null) {
            message = "Email changed";
        } else {
            message = "Email set";
        }
        String message2 = " " + this.firstName + " " + this.lastName + " " + message
                + " to: " + email;
        this.email = email;
        try {
            Files.write(p1, date.getBytes(), StandardOpenOption.APPEND);
            Files.write(p1, level.getBytes(), StandardOpenOption.APPEND);
            Files.write(p1, message2.getBytes(), StandardOpenOption.APPEND);
            Files.write(p1, System.getProperty("line.separator").getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(message + ": " + email);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Person(int id, String firstName, String lastName, String email) {
        Set<String> mails = persons.stream()
                .map(Person::getEmail)
                .collect(Collectors.toSet());
        boolean noneMatch = mails.stream()
                .noneMatch(map -> map.equals(email));
        if (noneMatch) {
            this.email = email;
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
            try {
                final Path p1 = Paths.get(Logger.pathLogs);
                final LocalDateTime d = LocalDateTime.now();
                final DateTimeFormatter logsFormatter =
                        DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss", Locale.ENGLISH);
                final String date = logsFormatter.format(d) + " ";
                final String logsId = " id= " + id + ":";
                final String logsFirstName = " " + firstName;
                final String logsLastName = " " + lastName;
                final String logsMail = " " + email;
                final String message = "Person added";
                final String message2 = " " + message + ":";
                Files.write(p1, date.getBytes(), StandardOpenOption.APPEND);
                Files.write(p1, message2.getBytes(), StandardOpenOption.APPEND);
                Files.write(p1, logsId.getBytes(), StandardOpenOption.APPEND);
                Files.write(p1, logsFirstName.getBytes(), StandardOpenOption.APPEND);
                Files.write(p1, logsLastName.getBytes(), StandardOpenOption.APPEND);
                Files.write(p1, logsMail.getBytes(), StandardOpenOption.APPEND);
                Files.write(p1, System.getProperty("line.separator").getBytes(), StandardOpenOption.APPEND);
                System.out.println(message);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Invalid values");
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

