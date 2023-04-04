package spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
public static void main(String[]args){
    ClassPathXmlApplicationContext applicationContext =new ClassPathXmlApplicationContext("hw.xml");

    Curse curse = applicationContext.getBean(Curse.class);
    Lecture lec = applicationContext.getBean(Lecture.class);

    applicationContext.close();


}
}