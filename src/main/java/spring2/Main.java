package spring2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        final Teacher teacher = applicationContext.getBean("teacher", Teacher.class);
        System.out.println(teacher.toString());
        Lecture.getLectures().stream().forEach(System.out::println);

    }

}