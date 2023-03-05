package hw20;

import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Person> persons = new ArrayList<>();
        List<Lecture> lectures = new ArrayList<>();
        List<Homework> homeworks = new ArrayList<>();
        List<AdditionalMaterials> additionalMaterialsList = new ArrayList<>();

        persons.add(new Person(0, Role.TEACHER, "Vadya", "Bedrytzkiy"));
        LogService.writeLogs(persons.get(0), Level.INFO);
        persons.add(new Person(1, Role.STUDENT, "Dima", "Prikolchyk"));
        LogService.writeLogs(persons.get(1), Level.WARNING);
        persons.add(new Person(2, Role.STUDENT, "Sveta", "Zhuravel"));
        LogService.writeLogs(persons.get(2), Level.INFO);
        persons.add(new Person(3, Role.STUDENT, "Denis", "Berezin"));
        LogService.writeLogs(persons.get(3), Level.WARNING);
        persons.add(new Person(4, Role.STUDENT, "Vadim", "Vasenin"));
        LogService.writeLogs(persons.get(4), Level.INFO);

        ComparatorByPesonLastName comparatorByPesonLastName = new ComparatorByPesonLastName();
        Collections.sort(persons, comparatorByPesonLastName);

        lectures.add(new Lecture(0, "Массиви", new Homework(0, "Реалізуйте массив")));
        LogService.writeLogs(lectures.get(0), Level.INFO);
        homeworks.add(lectures.get(0).getHomework());
        homeworks.get(0).setAdditionalMaterials(new AdditionalMaterials(0, "Arrays Tutorial",
                ResourceType.VIDEO));
        LogService.writeLogs(homeworks.get(0), Level.WARNING);
        additionalMaterialsList.add(homeworks.get(0).getAdditionalMaterials());
        LogService.writeLogs(additionalMaterialsList.get(0), Level.INFO);

        lectures.add(new Lecture(1, "Enum", new Homework(1, "Реалізуйте Enum клас")));
        LogService.writeLogs(lectures.get(1), Level.INFO);
        homeworks.add(lectures.get(1).getHomework());
        homeworks.get(1).setAdditionalMaterials(new AdditionalMaterials(1, "Enum Tutorial",
                ResourceType.URL));
        LogService.writeLogs(homeworks.get(1), Level.INFO);
        additionalMaterialsList.add(homeworks.get(1).getAdditionalMaterials());
        LogService.writeLogs(additionalMaterialsList.get(1), Level.WARNING);
        lectures.add(new Lecture(2, "Інтерфейс", new Homework(2, "Реалізуйте Інтерфейс")));
        LogService.writeLogs(lectures.get(2), Level.INFO);
        homeworks.add(lectures.get(2).getHomework());
        homeworks.get(2).setAdditionalMaterials(new AdditionalMaterials(2, "Інтерфейс Tutorial",
                ResourceType.BOOK));
        LogService.writeLogs(homeworks.get(2), Level.WARNING);
        additionalMaterialsList.add(homeworks.get(2).getAdditionalMaterials());
        LogService.writeLogs(additionalMaterialsList.get(2), Level.INFO);

        LogService.ReadLogs();

//      LogService.clearLogs();  - для очистики файлу Логів.
    }
}
