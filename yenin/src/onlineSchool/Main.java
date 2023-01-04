package onlineSchool;


import static onlineSchool.Lectures.lectures;

public class Main {
    public static void main(String[] args) {

        Lectures lecture1 = new Lectures();
        lecture1.add();
        Person t1 = new Person(0);
        t1.setRole(Role.TEACHER);
        lectures[0].setPersonId(t1.getId());
        lecture1.getById();
        System.out.println(t1);


    }
}
