package hw26;

public class Materials {
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

    public Materials(int id, Type type) {
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
}
