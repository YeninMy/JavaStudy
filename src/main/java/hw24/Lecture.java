package hw24;

import java.io.Serializable;

public class Lecture implements Serializable {
    private int id;
    private String name;
    private Homework homework;
    private Materials materials;

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

    public Materials getMaterials() {
        return materials;
    }

    public void setMaterials(Materials materials) {
        this.materials = materials;
    }

    public Lecture(int id) {
        this.id = id;
    }

    public Lecture(int id, String name, Homework homework, Materials materials) {
        this.id = id;
        this.name = name;
        this.homework = homework;
        this.materials = materials;
    }

    @Override
    public String toString() {
        return "Lecture{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", homework=" + homework +
                ", materials=" + materials +
                '}';
    }
}
