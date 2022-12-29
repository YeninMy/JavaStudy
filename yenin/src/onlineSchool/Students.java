package onlineSchool;

import java.util.Arrays;
import java.util.Scanner;

public class Students extends SuperArray {
    private static Student[] students = new Student[10];
    private int studentCounter;

    public int getStudentCounter() {
        return studentCounter;
    }

    private static Student[] getStudent() {
        return students;
    }

    @Override
    public void getAll() {
        System.out.println(Arrays.toString(Students.getStudent()));
    }

    @Override
    public void getById() {
        Scanner Scanner1 = new Scanner(System.in);
        System.out.println("Інвормація:" + "\nId = " + students[Scanner1.nextInt()].getId());
    }

    @Override
    public void deleteById() {
        Scanner Scanner2 = new Scanner(System.in);
        students[Scanner2.nextInt()] = null;
    }

    @Override
    public void add() {
        students[studentCounter] = new Student(studentCounter);
        studentCounter++;
    }
}
