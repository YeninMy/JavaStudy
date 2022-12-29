package onlineSchool;


import java.util.Arrays;
import java.util.Scanner;

public class Cources extends SuperArray {
    private static Cource[] cources = new Cource[10];
    private int courceCounter;

    public int getCourceCounter() {
        return courceCounter;
    }

    private static Cource[] getCources() {
        return cources;
    }

    @Override
    public void getAll() {
        System.out.println(Arrays.toString(Cources.getCources()));
    }

    @Override
    public void getById() {
        Scanner Scanner1 = new Scanner(System.in);
        System.out.println("Інвормація:" + "\nId = " + cources[Scanner1.nextInt()].getId());
    }

    @Override
    public void deleteById() {
        Scanner Scanner2 = new Scanner(System.in);
        cources[Scanner2.nextInt()] = null;
    }

    @Override
    public void add() {
        cources[courceCounter] = new Cource(courceCounter);
        courceCounter++;
    }
}
