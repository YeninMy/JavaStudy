package data;

import java.util.Arrays;

public class DalMain {
    public static void main(String[] args) {
        Person t1 = new Person(1, "Vadya", "Bedrytskiy", "vb@gmail.com", Role.TEACHER);
        Person t2 = new Person(2, "Bogdan", "Shelest", "bs@gmail.com", Role.TEACHER);
        Person t3 = new Person(3, "Dima", "Prikolchic", "dp@gmail.com", Role.TEACHER);
        Data.lectures.add(new Lecture(1, "Integer", t1));
        Data.lectures.add(new Lecture(2, "Enum", t2));
        Data.lectures.add(new Lecture(3, "Arrays", t2));
        Data.lectures.add(new Lecture(4, "Stream p.1", t3));
        Data.lectures.add(new Lecture(5, "Stream p.2", t3));
        Data.lectures.add(new Lecture(6, "Stream p.3", t3));
        Person s1 = new Person(4, "Vadym", "Vasenin", "vv@gmail.com", Role.STUDENT);
        Person s2 = new Person(5, "Sveta", "Zhuravel", "sz@gmail.com", Role.STUDENT);
        Person s3 = new Person(6, "Dima", "Ananiev", "da@gmail.com", Role.STUDENT);
        Person s4 = new Person(7, "Andriy", "Yazenko", "ay@gmail.com", Role.STUDENT);
        Person s5 = new Person(8, "Vasya", "Odyn", "vo@gmail.com", Role.STUDENT);
        Person s6 = new Person(9, "Gena", "Telesh", "gt@gmail.com", Role.STUDENT);
        Person s7 = new Person(10, "Yulia", "Telesh", "yt@gmail.com", Role.STUDENT);
        Person s8 = new Person(11, "Ksysha", "Zhuravel", "kz@gmail.com", Role.STUDENT);
        Person s9 = new Person(12, "Denis", "Berezin", "db@gmail.com", Role.STUDENT);
        Person s10 = new Person(13, "Misha", "Yenin", "my@gmail.com", Role.STUDENT);
        Data.persons = Arrays.asList(t1, t2, t3, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10);
    }
}