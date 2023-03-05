package hw21;

import java.util.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task(1));
        tasks.add(new Task(2));
        tasks.add(new Task(3));
        tasks.add(new Task(4));
        tasks.add(new Task(5));
        tasks.add(new Task(6));
        tasks.add(new Task(7));
        tasks.add(new Task(8));
        tasks.add(new Task(9));
        tasks.add(new Task(10));

        Runnable studentDoTest = new Runnable() {

            @Override
            synchronized public void run() {
                //для имени студента
                Student.studentCounter++;
                //для получения задачи
                int randomTaskFromListNum;
                int randomTaskNum;
                int min1 = 1;
                int max1 = tasks.size();
                int dif1 = max1 - min1;
                Random r1 = new Random();
                randomTaskFromListNum = r1.nextInt(dif1 + 1);
                randomTaskNum = tasks.get(randomTaskFromListNum).getTaskNum();
                tasks.remove(randomTaskFromListNum);
                //для времени решения задачи
                int randomTime;
                int min2 = 8;
                int max2 = 14;
                int dif2 = max2 - min2;
                Random r2 = new Random();
                randomTime = r2.nextInt(dif2 + 1);
                randomTime += min2;
                //
                students.add(new Student("Student " + Student.studentCounter, randomTaskNum, randomTime));

            }
        };

        Thread st1 = new Thread(studentDoTest);
        st1.start();
        Thread st2 = new Thread(studentDoTest);
        st2.start();
        Thread st3 = new Thread(studentDoTest);
        st3.start();
        Thread st4 = new Thread(studentDoTest);
        st4.start();
        Thread st5 = new Thread(studentDoTest);
        st5.start();
        Thread st6 = new Thread(studentDoTest);
        st6.start();
        Thread st7 = new Thread(studentDoTest);
        st7.start();
        Thread st8 = new Thread(studentDoTest);
        st8.start();
        Thread st9 = new Thread(studentDoTest);
        st9.start();
        Thread st10 = new Thread(studentDoTest);
        st10.start();

        Runnable testGot = new Runnable() {
            @Override
            synchronized public void run() {

                for (int i = 0; i < students.size(); i++) {
                    System.out.println(students.get(i));
                }
            }
        };

        Thread g = new Thread(testGot);
        g.start();

        Runnable testResults = new Runnable() {
            @Override
            synchronized public void run() {
                System.out.println("-----------------");
                for (int i = 0; i < students.size(); i++) {
                    if ((students.get(i).getTestDoneTime() == 8) || ((students.get(i).getTestDoneTime() == 9)) ||
                            ((students.get(i).getTestDoneTime() == 10)) ||
                            ((students.get(i).getTestDoneTime() == 11))) {
                        System.out.println("Найкращі студенти курсу:");
                        break;
                    }
                }
                int bestStudents = 0;
                if (bestStudents == 0) {
                    for (int i = 0; i < students.size(); i++) {
                        if (students.get(i).getTestDoneTime() == 8) {
                            System.out.println(students.get(i).printResults());
                            bestStudents++;
                        }
                    }
                }
                if (bestStudents == 0) {
                    for (int i = 0; i < students.size(); i++) {
                        if (students.get(i).getTestDoneTime() == 9) {
                            System.out.println(students.get(i).printResults());
                            bestStudents++;
                        }
                    }
                }
                if (bestStudents == 0) {
                    for (int i = 0; i < students.size(); i++) {
                        if (students.get(i).getTestDoneTime() == 10) {
                            System.out.println(students.get(i).printResults());
                            bestStudents++;
                        }
                    }
                }
                if (bestStudents == 0) {
                    for (int i = 0; i < students.size(); i++) {
                        if (students.get(i).getTestDoneTime() == 11) {
                            System.out.println(students.get(i).printResults());
                            bestStudents++;
                        }
                    }
                }

                System.out.println("Успішно виконали завдання:");
                ComparatorByTime comparatorByTime = new ComparatorByTime();
                Collections.sort(students, comparatorByTime);
                for (int i = 0; i < students.size(); i++) {
                    if ((students.get(i).getTestDoneTime() > 8) && (students.get(i).getTestDoneTime() <= 12)) {
                        System.out.println(students.get(i).printResults());
                    }
                }
            }
        };

        Thread r = new Thread(testResults);
        r.start();
    }
}
