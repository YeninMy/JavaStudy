package hw29;

import java.util.ArrayList;
import java.util.List;

public class Lecture {
    private int id;
    private String name;
    private List<Material> materials;
    private Person person;

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

    public List<Material> getMaterials() {
        return materials;
    }

    public void setMaterials(List<Material> materials) {
        this.materials = materials;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public static List<Lecture> lectures = new ArrayList<>();

    public Lecture(int id, String name, Person person) {
        this.id = id;
        this.name = name;
        this.person = person;
    }

    public Lecture(int id, String name, List<Material> materials, Person person) {
        this.id = id;
        this.name = name;
        this.materials = materials;
        this.person = person;
    }

    public static Lecture getById(int id) {
        Lecture l = null;
        for (Lecture lecture : lectures) {
            if (lecture.id == id) {
                l = lecture;
            }
        }
        return l;
    }

    @Override
    public String toString() {
        return "Lecture{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
