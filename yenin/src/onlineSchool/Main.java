package onlineSchool;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Lecture> lectures = new ArrayList<>();
        lectures.add(new Lecture(0,"Массиви",new Homework(0,"Реалізуйте массив")));
        List<Homework> homeworks = new ArrayList<>();
        homeworks.add(lectures.get(0).getHomework());
        homeworks.get(0).setAdditionalMaterials(new AdditionalMaterials(0, "Arrays Tutorial",
                ResourceType.VIDEO));
        List<AdditionalMaterials> additionalMaterialsList = new ArrayList<>();
        additionalMaterialsList.add(homeworks.get(0).getAdditionalMaterials());

        lectures.add(new Lecture(1,"Enum",new Homework(1,"Реалізуйте Enum клас")));
        homeworks.add(lectures.get(1).getHomework());
        homeworks.get(1).setAdditionalMaterials(new AdditionalMaterials(1, "Enum Tutorial",
                ResourceType.URL));
        additionalMaterialsList.add(homeworks.get(1).getAdditionalMaterials());

        lectures.add(new Lecture(2,"Інтерфейс",new Homework(2,"Реалізуйте Інтерфейс")));
        homeworks.add(lectures.get(1).getHomework());
        homeworks.get(1).setAdditionalMaterials(new AdditionalMaterials(2, "Інтерфейс Tutorial",
                ResourceType.BOOK));
        additionalMaterialsList.add(homeworks.get(1).getAdditionalMaterials());

        System.out.println("Лекції на курсі: ");
        lectures.forEach(System.out::println);

        System.out.println("Домашні завдання до лекцій: ");
        homeworks.forEach(System.out::println);

        System.out.println("Додаткові Матеріали: ");
        additionalMaterialsList.forEach(System.out::println);


    }
}
