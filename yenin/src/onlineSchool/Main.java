package onlineSchool;


import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();
        persons.add(new Person(0, Role.TEACHER, "Vadya", "Bedrytzkiy"));
        persons.add(new Person(1, Role.STUDENT, "Dima", "Prikolchyk"));
        persons.add(new Person(2, Role.STUDENT, "Sveta", "Zhuravel"));
        persons.add(new Person(3, Role.STUDENT, "Denis", "Berezin"));
        persons.add(new Person(4, Role.STUDENT, "Vadim", "Vasenin"));
        ComparatorByPesonLastName comparatorByPesonLastName = new ComparatorByPesonLastName();
        Collections.sort(persons, comparatorByPesonLastName);
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

        System.out.println("Список домашніх завданнь: ");
        Map<Integer, List<Homework>> homeworksMap = new HashMap<>();
        for (int h = 0; h < homeworks.size(); h++) {
            Integer key = homeworks.get(h).getId();
            if (!homeworksMap.containsKey(key)) {
                homeworksMap.put(key, new ArrayList<Homework>());
            }
            homeworksMap.get(key).add(homeworks.get(h));
        }
        homeworksMap.forEach((integer, homework) ->
                System.out.println(integer + " " + homework));

        System.out.println("Натисніть:");
        System.out.println("1 - щоб видалити додаткові матеріали за id.");
        System.out.println("2 - щоб додати нові додаткові матеріали");
        Scanner s4 = new Scanner(System.in);
        int w1 = s4.nextInt();
        switch (w1) {
            case 1:
                System.out.println("Введіть id домашнього завдання щоб видалити його:");
                Scanner s2 = new Scanner(System.in);
                int ss2 = s2.nextInt();
                homeworksMap.remove(ss2);
                homeworks.remove(ss2);
                homeworksMap.forEach((integer, homework) ->
                        System.out.println(integer + " " + homework));
                break;
            case 2:
                System.out.println("Введіть id домашнього завдання щоб додати нове:");
                Scanner s3 = new Scanner(System.in);
                int ss3 = s3.nextInt();
                homeworks.add(new Homework(ss3));
                for (int h = 0; h < homeworks.size(); h++) {
                    Integer key = homeworks.get(h).getId();
                    if (!homeworksMap.containsKey(key)) {
                        homeworksMap.put(key, new ArrayList<Homework>());
                    }
                    homeworksMap.get(key).add(homeworks.get(h));
                }
                homeworksMap.forEach((integer, homework) ->
                        System.out.println(integer + " " + homework));
                break;

        }

        System.out.println("Список додаткових матеріалів: ");
        Map<Integer, List<AdditionalMaterials>> additionalMaterialsMap = new HashMap<>();
        for (int a = 0; a < additionalMaterialsList.size(); a++) {
            Integer key = additionalMaterialsList.get(a).getId();
            if (!additionalMaterialsMap.containsKey(key)) {
                additionalMaterialsMap.put(key, new ArrayList<AdditionalMaterials>());
            }
            additionalMaterialsMap.get(key).add(additionalMaterialsList.get(a));
        }
        additionalMaterialsMap.forEach((integer, additionalMaterials) ->
                System.out.println(integer + " " + additionalMaterials));

        System.out.println("Натисніть:");
        System.out.println("1 - щоб видалити додаткові матеріали за id.");
        System.out.println("2 - щоб додати нові додаткові матеріали");
        Scanner s1 = new Scanner(System.in);
        int w = s1.nextInt();
        switch (w) {
            case 1:
                System.out.println("Введіть id додаткових матеріалів щоб видалити Їх:");
                Scanner s2 = new Scanner(System.in);
                int ss2 = s2.nextInt();
                additionalMaterialsMap.remove(ss2);
                additionalMaterialsList.remove(ss2);
                additionalMaterialsMap.forEach((integer, additionalMaterials) ->
                        System.out.println(integer + " " + additionalMaterials));
                break;
            case 2:
                System.out.println("Введіть id додаткових матеріалів щоб додати нові:");
                Scanner s3 = new Scanner(System.in);
                int ss3 = s3.nextInt();
                additionalMaterialsList.add(new AdditionalMaterials(ss3));
                for (int a = 0; a < additionalMaterialsList.size(); a++) {
                    Integer key = additionalMaterialsList.get(a).getId();
                    if (!additionalMaterialsMap.containsKey(key)) {
                        additionalMaterialsMap.put(key, new ArrayList<AdditionalMaterials>());
                    }
                    additionalMaterialsMap.get(key).add(additionalMaterialsList.get(a));
                }
                additionalMaterialsMap.forEach((integer, additionalMaterials) ->
                        System.out.println(integer + " " + additionalMaterials));
                break;

        }

        System.out.println("Введыть Id лекції щоб вивести інформацію на екран:");
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int q = 0; q < lectures.size(); q++) {
            if (q == lectures.get(t).getId()) {
                System.out.println(lectures.get(q));
            }
        }

//        System.out.println("Склад школи: ");
//        persons.forEach(System.out::println);
//        ComparatorByLectureName comparatorByLectureName = new ComparatorByLectureName();
//        Collections.sort(lectures, comparatorByLectureName);
//
//        System.out.println("Лекції на курсі: ");
//        lectures.forEach(System.out::println);
//
//        System.out.println("Домашні завдання до лекцій: ");
//        homeworks.forEach(System.out::println);
//
//        System.out.println("Додаткові Матеріали: ");
//        additionalMaterialsList.forEach(System.out::println);
//
//        System.out.println("Щоб додати додаткові матеріали до 4-ої Лекції виберіть тип додаткових матеріалів:");
//        System.out.println("1 - URL");
//        System.out.println("2 - VIDEO");
//        System.out.println("3 - BOOK");
//
//        Scanner scanner = new Scanner(System.in);
//        final int i = scanner.nextInt();
//        ResourceType rType = null;
//        switch (i) {
//            case 1:
//                rType = ResourceType.URL;
//                System.out.println("Обраний тип - URL");
//                break;
//            case 2:
//                rType = ResourceType.VIDEO;
//                System.out.println("Обраний тип - VIDEO");
//                break;
//            case 3:
//                rType = ResourceType.BOOK;
//                System.out.println("Обраний тип - BOOK");
//                break;
//            default:
//                System.out.println("Некорректне значення.");
//        }
//
//        System.out.println("Введіть назву додаткових матеріалів:");
//        Scanner scanner1 = new Scanner(System.in);
//        String aName = scanner1.nextLine();
//
//
//        additionalMaterialsList.add(new AdditionalMaterials(3));
//        additionalMaterialsList.get(3).setName(aName);
//        additionalMaterialsList.get(3).setResourceType(rType);
//        homeworks.get(3).setAdditionalMaterials(additionalMaterialsList.get(3));
//
//        System.out.println("Ви успішно додали додаткові матеріали до 4-ої Лекції: ");
//        System.out.println(additionalMaterialsList.get(3));
//
//
//        System.out.println("Оберіть метод сотування додаткових матеріалів: ");
//        System.out.println("1 - Сортування за ім'ям.");
//        System.out.println("2 - Сортування за типом.");
//        System.out.println("Або за змовчуванням(id).");
//        Scanner scanner2 = new Scanner(System.in);
//        final int q = scanner.nextInt();
//        switch (q) {
//            case 1:
//                ComparatorByAdMaName comparatorByAdMaName = new ComparatorByAdMaName();
//                Collections.sort(additionalMaterialsList, comparatorByAdMaName);
//                additionalMaterialsList.forEach(System.out::println);
//                break;
//            case 2:
//                ComparatorByAdMaType comparatorByAdMaType = new ComparatorByAdMaType();
//                Collections.sort(additionalMaterialsList, comparatorByAdMaType);
//                additionalMaterialsList.forEach(System.out::println);
//                break;
//            default:
//                ComparatorByAdMaId comparatorByAdMaId = new ComparatorByAdMaId();
//                Collections.sort(additionalMaterialsList, comparatorByAdMaId);
//                additionalMaterialsList.forEach(System.out::println);
//        }
//
    }


}
