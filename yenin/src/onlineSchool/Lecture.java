package onlineSchool;

public class Lecture {
    private Integer id = 0;
    private String name;
    private Homework homework;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Homework getHomework() {
        return homework;
    }

    public void setHomework(Homework homework) {
        this.homework = homework;
    }


    public Lecture() {
    }

    public Lecture(int id) {
        this.id = id;
    }

    public Lecture(Integer id, String name, Homework homework) {
        this.id = id;
        this.name = name;
        this.homework = homework;
    }

    @Override
    public String toString() {
        return "Lecture{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", homework=" + homework +
                '}';
    }
}