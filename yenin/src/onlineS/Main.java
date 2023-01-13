package onlineS;


import java.util.Scanner;

import static onlineS.Lectures.lectures;
import static onlineS.Persons.persons;

public class Main {
    public static void main(String[] args) {

        Homeworks homework1 = new Homeworks();
        Lectures lectures1 = new Lectures();
        Persons persons1 = new Persons();

        lectures1.add();
        lectures[0].setName("Суперкласси");
        lectures[0].setHomework(new Homework(0, "Щось зробити"));
        Homeworks.homeworks[0] = lectures[0].getHomework();
        lectures1.add();
        lectures[1].setId(1);
        lectures[1].setName("Енам");
        lectures[1].setHomework(new Homework(1, "Все перереробити"));
        Homeworks.homeworks[1] = lectures[1].getHomework();
        lectures1.add();
        lectures[2].setId(2);
        lectures[2].setName("Інтерфейс");
        lectures[2].setHomework(new Homework(2, "Все перереробити знову"));
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


        lectures1.getById(0);
        lectures1.getById(1);

        System.out.println("Натисніть щоб вивести на екран: +" +
                "\n1 - Лекції" + "\n2 - Вчителі та студенти" + "\n3 - Домашні завдання");
        Scanner scanner1 = new Scanner(System.in);
        final int i = scanner1.nextInt();
        switch (i) {
            case 1:
                System.out.println("Лекції:");
                lectures1.toColumns();
                break;
            case 2:
                System.out.println("Вчителі та студенти:");
                persons1.toColumns();
                break;
            case 3:
                System.out.println("Домашні завдання:");
            default:
                throw new IncorrectValuesException("Невірне значення.");
        }
        persons[2].setEmail("123");
        persons[2].isEmailValid();
    }
}
