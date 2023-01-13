package onlineS;

public class Lectures implements ArrayUtils {
    public static Lecture[] lectures = new Lecture[10];

    @Override
    public void add() {
        for (int i = 0; i < lectures.length; i++) {
            if (lectures[i] == null) {
                lectures[i] = new Lecture();
                break;
            }
        }
    }


    @Override
    public void getById(int index) throws NullPointerException {
        try {
            for (int i = 0; i < lectures.length; i++) {
                if (lectures[i].getId() == index) {
                    System.out.println(lectures[i]);
                    break;
                }
            }
        } catch (NullPointerException e) {
            throw new EntityNotFoundException("Такої лекції не знайдено.");
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
