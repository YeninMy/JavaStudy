package onlineSchool;

public class Essence {
    private int id;

    public Essence(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Essence{" +
                "id=" + id +
                '}';
    }
}
