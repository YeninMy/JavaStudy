package hw28;

public class Matarials {
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

    public Matarials(int id, Type type) {
        this.id = id;
        this.type = type;
    }
}
