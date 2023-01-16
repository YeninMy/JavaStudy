package onlineS;

public class Main {
    public static void main(String[] args) {
        SimpleIterator<Lecture> lectureSimpleIterator = new SimpleIterator<>(new Lecture());
        SimpleIterator<Homework> homeworkSimpleIterator = new SimpleIterator<>(new Homework());
        lectureSimpleIterator.arrays = new Lecture[10];
        homeworkSimpleIterator.arrays = new Homework[10];
        lectureSimpleIterator.arrays[0] = new Lecture();
        lectureSimpleIterator.arrays[0].setId(0);
        lectureSimpleIterator.arrays[0].setName("Суперкласси");
        lectureSimpleIterator.arrays[0].setHomework(new Homework(0, "Щось зробити"));
        homeworkSimpleIterator.arrays[0] = lectureSimpleIterator.arrays[0].getHomework();
        lectureSimpleIterator.arrays[1] = new Lecture();
        lectureSimpleIterator.arrays[1].setId(1);
        lectureSimpleIterator.arrays[1].setName("Енам");
        lectureSimpleIterator.arrays[1].setHomework(new Homework(1, "Все переробити"));
        homeworkSimpleIterator.arrays[1] = lectureSimpleIterator.arrays[1].getHomework();
        lectureSimpleIterator.arrays[2] = new Lecture();
        lectureSimpleIterator.arrays[2].setId(1);
        lectureSimpleIterator.arrays[2].setName("Інтерфейс");
        lectureSimpleIterator.arrays[2].setHomework(new Homework(2, "Все переробити знову"));
        homeworkSimpleIterator.arrays[2] = lectureSimpleIterator.arrays[2].getHomework();


        System.out.println(lectureSimpleIterator.hasNext(0));
        System.out.println(lectureSimpleIterator.next(1));
        lectureSimpleIterator.findAll();
    }
}
