package onlineSchool;


public class Person {
    private int id;
    private int courceId;
    private Role role;

    private String firstName;
    private String lastName;
    private String phone;
    private String email;

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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void isPhoneValid() {
        if ((getPhone().startsWith("+38")) && getPhone().length() == 13) {
        }
        System.out.println("Phone is valid.");
    }

    public String getEmail() {
        return email;
    }

    public void isEmailValid() {
        if (getEmail().contains("@")) {
        }
        System.out.println("Email is valid");
    }

    public void setEmail(String email) {
        this.email = email;
    }

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
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
