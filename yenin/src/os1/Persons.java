package os1;

public class Persons implements ArrayUtils {
    public static Person[] persons = new Person[10];

    @Override
    public void add() {
        int p = 0;
        for (int i = 0; i < persons.length; i++) {

            if (persons[i] != null) {
                p++;
            }

        }
        persons[p] = new Person();
    }


    @Override
    public void getById(int index) {
        Person p1 = new Person();
        for (int i = 0; i < persons.length; i++) {
            if (p1.getId() == i) {
                System.out.println(persons[i]);
            }
        }
    }

    @Override
    public void remove(int index) {
        persons[index] = null;
    }

    @Override
    public void size() {
        int studentCounter = 0;
        int teacherCounter = 0;
        for (int i = 0; i < persons.length; i++) {
            if (persons[i] != null) {
                if (persons[i].getRole() == Role.STUDENT) {
                    studentCounter++;
                }
                if (persons[i].getRole() == Role.TEACHER) {
                    teacherCounter++;
                }
            }
        }
        System.out.println("Кількість викладачів: " + teacherCounter + "\nКількість студентів: " + studentCounter);
    }

    @Override
    public void toColumns() {
        for (int i = 0; i < persons.length; i++)
            if (persons[i] != null) {
                System.out.println(persons[i]);
            }
    }
}
