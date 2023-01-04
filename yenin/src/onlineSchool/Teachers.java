package onlineSchool;

import java.util.Arrays;
import java.util.Scanner;

public class Teachers extends SuperArray {
    private static Teacher[] teachers = new Teacher[10];
    private int teachersCounter;

    public int getLectureCounter() {
        return teachersCounter;
    }

    private static Teacher[] getTeachers() {
        return teachers;
    }

    @Override
    public void getAll() {
        System.out.println(Arrays.toString(Teachers.getTeachers()));
    }

    @Override
    public void getById() {
        Scanner Scanner1 = new Scanner(System.in);
        System.out.println("Інформація:" + "\nId = " + teachers[Scanner1.nextInt()].getId());
    }

    @Override
    public void deleteById() {
        Scanner Scanner2 = new Scanner(System.in);
        teachers[Scanner2.nextInt()] = null;
    }

    @Override
    public void add() {
        teachers[teachersCounter] = new Teacher(teachersCounter);
        teachersCounter++;
    }
}

