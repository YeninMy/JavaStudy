package os1;

public class Lectures implements ArrayUtils {
    public static Lecture[] lectures = new Lecture[10];

    @Override
    public void add() {
        int l = 0;
        for (int i = 0; i < lectures.length; i++) {

            if (lectures[i] != null) {
                l++;
            }

        }
        lectures[l] = new Lecture();
    }


    @Override
    public void getById(int index) {
        Lecture l1 = new Lecture();
        for (int i = 0; i < lectures.length; i++) {
            if (l1.getId() == i) {
                System.out.println(lectures[i]);
            }
        }
    }

    @Override
    public void remove(int index) {
        lectures[index] = null;
    }

    @Override
    public void size() {
        int arraySize = 0;
        for (int i = 0; i < lectures.length; i++) {
            if (lectures[i] != null) {
                arraySize++;
            }
        }
        System.out.println("Лекцій проведено: " + arraySize);
    }

    @Override
    public void toColumns() {
        for (int i = 0; i < lectures.length; i++)
            if (lectures[i] != null) {
                System.out.println(lectures[i]);
            }
    }

    @Override
    public String toString() {
        return "Lectures{}";
    }
}
