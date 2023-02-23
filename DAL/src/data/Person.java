package data;

public class Person {
    private int id;

    private String firstName;

    private String lastName;

    private String email;

    private Role role;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Person(int id, String firstName, String lastName, String email, Role role) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.role = role;
    }

    public String getFullName(){
        String fullName = this.firstName + this.lastName;
        return fullName;
    }

    @Override
    public java.lang.String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName=" + firstName +
                ", lastName=" + lastName +
                ", email=" + email +
                ", role=" + role +
                '}';
    }
}