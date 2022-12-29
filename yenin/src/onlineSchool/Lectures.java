package onlineSchool;

import java.util.Arrays;
import java.util.Scanner;

public class Lectures extends SuperArray {
    private static Lecture[] lectures = new Lecture[10];
    private int lectureCounter;

    public int getLectureCounter() {
        return lectureCounter;
    }

    private static Lecture[] getLectures() {
        return lectures;
    }

    @Override
    public void getAll() {
        System.out.println(Arrays.toString(Lectures.getLectures()));
    }

    @Override
    public void getById() {
        Scanner Scanner1 = new Scanner(System.in);
        System.out.println(lectures[Scanner1.nextInt()].getId());
    }

    @Override
    public void deleteById() {
        Scanner Scanner2 = new Scanner(System.in);
        lectures[Scanner2.nextInt()] = null;
    }

    @Override
    public void add() {
        lectures[lectureCounter] = new Lecture(lectureCounter);
        lectureCounter++;
    }
}

