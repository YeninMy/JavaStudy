package onlineSchool;

public class Homework {
private int id;
private int lectureId;
private String task;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLectureId() {
        return lectureId;
    }

    public void setLectureId(int lectureId) {
        this.lectureId = lectureId;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public Homework() {
    }

    public Homework(int id, String task) {
        this.id = id;
        this.task = task;
    }


    @Override
    public String toString() {
        return "Homework{" +
                "id=" + id +
                ", task='" + task + '\'' +
                '}';
    }
}
