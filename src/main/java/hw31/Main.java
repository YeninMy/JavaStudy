package hw31;

public class Main {
    public static void main(String[] args) {
        Logger.createFile(Logger.pathLogs);
        Lecture l1 = new Lecture(1, "Enum",new Teacher(1,"Yuriy"));
        Lecture l2 = new Lecture(2, "Arrays",new Teacher(2,"Vlad"));
        Lecture l3 = new Lecture(3, "List",new Teacher(3,"Andriy"));
        Lecture.lectures.stream()
                .forEach(System.out::println);
        String first = "04-Mar-2023 12:56 Lecture added: Lecture{id=1, name='dflz', teacher=Teacher{id=1, name='12'}}";
        String newString = first.substring(first.indexOf("added: ")+7);
        System.out.println(newString);

    }
}
