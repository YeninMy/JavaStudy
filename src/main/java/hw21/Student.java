package hw21;

public class Student {

    public static int studentCounter;
    private String name;
    private int task;
    private int testDoneTime;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTask() {
        return task;
    }

    public void setTask(int task) {
        this.task = task;
    }

    public int getTestDoneTime() {
        return testDoneTime;
    }

    public void setTestDoneTime(int testDoneTime) {
        this.testDoneTime = testDoneTime;
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, int task, int testDoneTime ) {
        this.name = name;
        this.task = task;
        this.testDoneTime = testDoneTime;
    }

    public String printResults() {
        return name +
                " виконав завдання № " + task +
                " за " + testDoneTime + " секунд."
                ;
    }
    @Override
    public String toString() {
        return name +
                " отримав завдання № " + task + "."
                ;
    }
}
