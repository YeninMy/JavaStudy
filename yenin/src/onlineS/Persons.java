package onlineS;

public class Persons implements ArrayUtils {
    public static Person[] persons = new Person[10];

    @Override
    public void add() {
        for (int i = 0; i < persons.length; i++) {
            if (persons[i] == null) {
                persons[i] = new Person();
                break;
            }
        }
    }


    @Override
    public void getById(int index) throws NullPointerException{
        try {
        for (Person person : persons) {
            if (person.getId() == index) {
                System.out.println(person);
                break;
            }
        }
    } catch (NullPointerException e) {
        throw new EntityNotFoundException("Такої людини не знайдено.");
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
        for (Person person : persons) {
            if (person != null) {
                if (person.getRole() == Role.STUDENT) {
                    studentCounter++;
                }
                if (person.getRole() == Role.TEACHER) {
                    teacherCounter++;
                }
            }
        }
        System.out.println("Кількість викладачів: " + teacherCounter + "\nКількість студентів: " + studentCounter);
    }

    @Override
    public void toColumns() {
        for (Person person : persons)
            if (person != null) {
                System.out.println(person);
            }
    }
}
