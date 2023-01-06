package hw11;

import java.util.Arrays;
import java.util.Scanner;

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
        Scanner Scanner1 = new Scanner(System.in);
        int i = Scanner1.nextInt();
        System.out.println(lectures[i]);
        System.out.println(Persons.persons[lectures[i].getPersonId()]);

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
