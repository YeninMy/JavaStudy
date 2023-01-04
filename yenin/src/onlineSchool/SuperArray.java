package onlineSchool;

import java.util.Arrays;
import java.util.Scanner;

public class SuperArray {
    private static Essence[] essences = new Essence[40];
    private int essenceCounter;

    public int getEssenceCounter() {
        return essenceCounter;
    }

    public Essence[] getArray() {
        return essences;
    }

    public void getAll() {
        System.out.println(Arrays.toString(getArray()));
    }

    public void add() {
        essences[essenceCounter] = new Essence(essenceCounter);
        essenceCounter++;
    }

    public void getById() {
        Scanner Scanner1 = new Scanner(System.in);
        System.out.println("Інформація:" + "\nId = " + essences[Scanner1.nextInt()].getId());
    }

    public void deleteById() {
        Scanner Scanner2 = new Scanner(System.in);
        essences[Scanner2.nextInt()] = null;
    }
}
