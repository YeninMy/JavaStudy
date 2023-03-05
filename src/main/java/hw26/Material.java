package hw26;

import java.util.ArrayList;
import java.util.List;

public class Material {
    private int id;
    private Type type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Material(int id, Type type) {
        this.id = id;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Materials{" +
                "id=" + id +
                ", type=" + type +
                '}';
    }

    public static List<Material> materials = new ArrayList();

    public static void printMaterials() {
        for (Material material : materials) {
            System.out.println(material);
        }
    }

    public static void printMaterialsById() {
        materials.sort((m1, m2) -> Integer.compare(m1.getId(), m2.getId()));
        printMaterials();
    }

    public static void printMaterialsByLectures() {
        Lecture.lectures.sort((l1, l2) -> Integer.compare(l1.getId(), l2.getId()));
        for (Lecture lecture : Lecture.lectures) {
            System.out.println(lecture.getMaterials());
        }
    }
}
