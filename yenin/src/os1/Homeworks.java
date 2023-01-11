package os1;

public class Homeworks implements ArrayUtils {
    public static Homework[] homeworks = new Homework[10];

    @Override
    public void add() {
        int h = 0;
        for (int i = 0; i < homeworks.length; i++) {

            if (homeworks[i] != null) {
                h++;
            }
        }
        homeworks[h] = new Homework();
    }


    @Override
    public void getById(int index) {
        Homework h1 = new Homework();
        for (int i = 0; i < homeworks.length; i++) {
            if (h1.getId() == i) {
                System.out.println(homeworks[i]);
            }
        }
    }

    @Override
    public void remove(int index) {
        homeworks[index] = null;
    }

    @Override
    public void size() {
        int arraySize = 0;
        for (int i = 0; i < homeworks.length; i++) {
            if (homeworks[i] != null) {
                arraySize++;
            }
        }
        System.out.println("Домашніх завданнь видано: " + arraySize);

    }

    @Override
    public void toColumns() {
        for (int i = 0; i < homeworks.length; i++)
            if (homeworks[i] != null) {
                System.out.println(homeworks[i]);
            }
    }

    @Override
    public String toString() {
        return "Homeworks{}";
    }
}
