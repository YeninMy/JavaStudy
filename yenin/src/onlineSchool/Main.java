package onlineSchool;

public class Main {
    public static void main(String[] args) {
        Utils<Person> arrayUtils1 = new Utils<>(new Person(0, Role.TEACHER));
        arrayUtils1.arrays = new Person[10];
        arrayUtils1.arrays[0] = new Person(0, Role.TEACHER);
        System.out.println(arrayUtils1.arrays[0]);

        Utils<Lecture> arrayUtils = new Utils<>(new Lecture(0));
        arrayUtils.arrays = new Lecture[10];
        System.out.println("Лекцій ще не проводили? " + arrayUtils.isEmpty());
        arrayUtils.arrays[0] = new Lecture(0);
        arrayUtils.add(1,new Lecture(1));
        arrayUtils.add(new Lecture(2));
//
        System.out.println("Перша лекція: " + arrayUtils.arrays[0]);
        System.out.println("Друга лекція: " + arrayUtils.get(1));
        System.out.println("Третя лекція: " + arrayUtils.get(2));
        System.out.println("Загальная кількість лекцій: " + arrayUtils.size());
        System.out.println("Лекцій ще не проводили? " + arrayUtils.isEmpty());
        arrayUtils.toColumns();

    }
}

