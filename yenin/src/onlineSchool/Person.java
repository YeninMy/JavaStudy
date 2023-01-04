package onlineSchool;

public class Person {
    private int id;
    private int courceId;
    private Role role;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Person() {
    }

    public Person(int id) {
        this.id = id;
    }

    public Person(int id, Role role) {
        this.id = id;
        this.role = role;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", role=" + role +
                '}';
    }
}
