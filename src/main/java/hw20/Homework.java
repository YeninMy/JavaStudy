package hw20;

public class Homework {
    private Integer id = 0;
    private String task;
    private AdditionalMaterials additionalMaterials;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public AdditionalMaterials getAdditionalMaterials() {
        return additionalMaterials;
    }

    public void setAdditionalMaterials(AdditionalMaterials additionalMaterials) {
        this.additionalMaterials = additionalMaterials;
    }

    public Homework(int id) {
        this.id = id;
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
                ", additionalMaterials=" + additionalMaterials +
                '}';
    }
}
