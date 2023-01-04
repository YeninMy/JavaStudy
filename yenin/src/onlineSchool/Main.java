package onlineSchool;

public class Main {
    public static void main(String[] args) {

        Lectures lecturesFunc = new Lectures();
        lecturesFunc.add();
        lecturesFunc.add();
        lecturesFunc.add();
        System.out.println("Усі лекції на курсі:");
        lecturesFunc.getAll();
        System.out.println("Щоб дізнатись інформацію про лекцію введіть Id:");
        lecturesFunc.getById();
        System.out.println("Щоб видалити лекцію введіть Id:");
        lecturesFunc.deleteById();
        System.out.println("Усі лекції на курсі:");
        lecturesFunc.getAll();
    }
}
