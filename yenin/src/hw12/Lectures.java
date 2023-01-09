package hw12;

import java.util.Arrays;
import java.util.Scanner;

import static hw12.Persons.persons;

public class Lectures {
    public static Lecture[] lectures = new Lecture[10];

    private int lectureCounter;

    public int getLectureCounter() {
        return lectureCounter;
    }

    private static Lecture[] getLectures() {
        return lectures;
    }


    public void getAll() {
        System.out.println(Arrays.toString(Lectures.getLectures()));
    }


    public void getById() {
        System.out.println("Введіть Id лекції щоб отримати усю доступну інформацію:");
        Scanner Scanner1 = new Scanner(System.in);
        int i = Scanner1.nextInt();
        hw12.Lecture l1 = new Lecture();
        hw12.Person p1 = new Person();
        for (int q = 0; q < lectures.length; q++) {
            if (l1.getId() == i) {
                System.out.println(lectures[i]);
                for (int p=0; p < persons.length; p++) {
                    if (lectures[i].getPersonId() == persons[p].getId()) {
                        System.out.println(persons[p]);
                    }
                    break;
                }
            }break;
        }
    }
    public void deleteById() {
        Scanner Scanner2 = new Scanner(System.in);
        lectures[Scanner2.nextInt()] = null;
    }

    public void add() {
        lectures[lectureCounter] = new Lecture(lectureCounter);
        lectureCounter++;
    }


}
