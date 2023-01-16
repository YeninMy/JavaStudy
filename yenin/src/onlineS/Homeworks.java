package onlineS;

public class Homeworks implements ArrayUtils {
    public static Homework[] homeworks = new Homework[10];

    @Override
    public void add() {
        for (int i = 0; i < homeworks.length; i++) {
            if (homeworks[i] == null) {
                homeworks[i] = new Homework();
                break;
            }
        }
    }


    @Override
    public void getById(int index) throws NullPointerException{
        try{
        for (int i = 0; i < homeworks.length; i++) {
            if (homeworks[i].getId() == index) {
                System.out.println(homeworks[i]);
                break;
            }
        }
        } catch (NullPointerException e) {
            throw new EntityNotFoundException("Такого домашнього завдання не знайдено.");
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
