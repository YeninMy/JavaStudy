package hw12;

import static hw12.Lectures.lectures;
import static hw12.Persons.persons;

public class Main {
    public static void main(String[] args) {

        Lectures lecture1 = new Lectures();
        Persons persons1 = new Persons();
        lecture1.add();
        lectures[0].setName("Arrays");
        lectures[0].setDescription("Very difficult topic");
        persons[0] = new Person(0);
        persons[0].setRole(Role.TEACHER);
        persons[0].setFirstName("Vadya");
        persons[0].setLastName("Bedrizkiy");
        persons[0].setPhone("+380931911789");
        persons[0].isPhoneValid();
        persons[0].setEmail("bobas1505@gmail.com");
        persons[0].isEmailValid();
        lectures[0].setPersonId(persons[0].getId());
        lecture1.getById();
    }
}

