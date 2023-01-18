package onlineSchool;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Lecture> lectures = new ArrayList<>();
        lectures.add(new Lecture(0, "Массиви", new Homework(0, "Реалізуйте массив")));
        List<Homework> homeworks = new ArrayList<>();
        homeworks.add(lectures.get(0).getHomework());
        homeworks.get(0).setAdditionalMaterials(new AdditionalMaterials(0, "Arrays Tutorial",
                ResourceType.VIDEO));
        List<AdditionalMaterials> additionalMaterialsList = new ArrayList<>();
        additionalMaterialsList.add(homeworks.get(0).getAdditionalMaterials());

        lectures.add(new Lecture(1, "Enum", new Homework(1, "Реалізуйте Enum клас")));
        homeworks.add(lectures.get(1).getHomework());
        homeworks.get(1).setAdditionalMaterials(new AdditionalMaterials(1, "Enum Tutorial",
                ResourceType.URL));
        additionalMaterialsList.add(homeworks.get(1).getAdditionalMaterials());

        lectures.add(new Lecture(2, "Інтерфейс", new Homework(2, "Реалізуйте Інтерфейс")));
        homeworks.add(lectures.get(2).getHomework());
        homeworks.get(2).setAdditionalMaterials(new AdditionalMaterials(2, "Інтерфейс Tutorial",
                ResourceType.BOOK));
        additionalMaterialsList.add(homeworks.get(2).getAdditionalMaterials());

        lectures.add(new Lecture(3, "Коллекції", new Homework(3, "Реалізуйте Лист")));
        homeworks.add(lectures.get(3).getHomework());
        System.out.println("Лекції на курсі: ");
        lectures.forEach(System.out::println);

        System.out.println("Домашні завдання до лекцій: ");
        homeworks.forEach(System.out::println);

        System.out.println("Додаткові Матеріали: ");
        additionalMaterialsList.forEach(System.out::println);

        System.out.println("Щоб додати додаткові матеріали до 4-ої Лекції виберіть тип додаткових матеріалів:");
        System.out.println("1 - URL");
        System.out.println("2 - VIDEO");
        System.out.println("3 - BOOK");

        Scanner scanner = new Scanner(System.in);
        final int i = scanner.nextInt();
        ResourceType rType = null;
        switch (i) {
            case 1:
                rType = ResourceType.URL;
                System.out.println("Обраний тип - URL");
                break;
            case 2:
                rType = ResourceType.VIDEO;
                System.out.println("Обраний тип - VIDEO");
                break;
            case 3:
                rType = ResourceType.BOOK;
                System.out.println("Обраний тип - BOOK");
                break;
            default:
                System.out.println("Некорректне значення.");
        }

        System.out.println("Введіть назву додаткових матеріалів:");
        Scanner scanner1 = new Scanner(System.in);
        String aName = scanner1.nextLine();


        additionalMaterialsList.add(new AdditionalMaterials(3));
        additionalMaterialsList.get(3).setName(aName);
        additionalMaterialsList.get(3).setResourceType(rType);
        homeworks.get(3).setAdditionalMaterials(additionalMaterialsList.get(3));

        System.out.println("Ви успішно додали додаткові матеріали до 4-ої Лекції: ");
        System.out.println(additionalMaterialsList.get(3));


    }
}
