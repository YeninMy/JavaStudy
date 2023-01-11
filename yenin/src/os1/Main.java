package os1;


import java.util.Arrays;

import static os1.Lectures.lectures;
import static os1.Persons.persons;

public class Main {
    public static void main(String[] args) {
//        Utils<onlineSchool.Person> arrayUtils1 = new Utils<>(new onlineSchool.Person(0, onlineSchool.Role.TEACHER));
//        arrayUtils1.arrays = new onlineSchool.Person[10];
//        arrayUtils1.arrays[0] = new Person(0, Role.TEACHER);
//        System.out.println(arrayUtils1.arrays[0]);
//
//        Utils<onlineSchool.Lecture> arrayUtils = new Utils<>(new onlineSchool.Lecture(0));
//        arrayUtils.arrays = new onlineSchool.Lecture[10];
//        System.out.println("Лекцій ще не проводили? " + arrayUtils.isEmpty());
//        arrayUtils.arrays[0] = new onlineSchool.Lecture(0);
//        arrayUtils.add(1, new onlineSchool.Lecture(1));
//        arrayUtils.add(new onlineSchool.Lecture(2));
////
//        System.out.println("Перша лекція: " + arrayUtils.arrays[0]);
//        System.out.println("Друга лекція: " + arrayUtils.get(1));
//        System.out.println("Третя лекція: " + arrayUtils.get(2));
//        System.out.println("Загальная кількість лекцій: " + arrayUtils.size());
//        System.out.println("Лекцій ще не проводили? " + arrayUtils.isEmpty());
//        arrayUtils.toColumns();
        Homeworks homework1 = new Homeworks();
        Lectures lectures1 = new Lectures();
        Persons persons1 = new Persons();

        lectures1.add();
        lectures[0].setName("Суперкласси");
        lectures[0].setHomework(new Homework(0,"Щось зробити"));
        Homeworks.homeworks[0] = lectures[0].getHomework();
        lectures1.add();
        lectures[1].setId(1);
        lectures[1].setName("Енам");
        lectures[1].setHomework(new Homework(1,"Все перереробити"));
        Homeworks.homeworks[1] = lectures[1].getHomework();
        lectures1.add();
        lectures[2].setId(2);
        lectures[2].setName("Інтерфейс");
        lectures[2].setHomework(new Homework(2,"Все перереробити знову"));
        Homeworks.homeworks[2] = lectures[2].getHomework();

        persons1.add();
        persons[0].setFirstName("Вадя");
        persons[0].setLastName("Бедрицький");
        persons[0].setRole(Role.TEACHER);
        persons1.add();
        persons[1].setFirstName("Богдан");
        persons[1].setLastName("Шелест");
        persons[1].setRole(Role.STUDENT);
        persons1.add();
        persons[2].setFirstName("Денис");
        persons[2].setLastName("Березин");
        persons[2].setRole(Role.STUDENT);

        lectures1.size();
        System.out.println("Лекції на курсі: ");
        lectures1.toColumns();

        homework1.size();
        System.out.println("Домашні завдання до лекцій: ");
        homework1.toColumns();

        persons1.toColumns();
        persons1.size();

        System.out.println("Домашнє завдання до третьої лекції: ");
        System.out.println(lectures[2].getHomework());




    }
}

