package hw12;

public class Lecture {
    private int id;
    private int personId;
    private String name;
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public Lecture() {
    }

    public Lecture(int id) {
        this.id = id;
    }

    public Lecture(int id, int personId) {
        this.id = id;
        this.personId = personId;
    }

    @Override
    public String toString() {
        return "Lecture{" +
                "id=" + id +
                ", personId=" + personId +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
