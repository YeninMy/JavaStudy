package hw11;

public class Lecture {
    private int id;
    private int personId;

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
                '}';
    }
}
