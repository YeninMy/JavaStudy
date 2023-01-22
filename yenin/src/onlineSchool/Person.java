package onlineSchool;

public class Person {
    private Integer id = 0;
    private Role role;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;

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
            System.out.println("Phone is valid.");
        } else {
            System.out.println("Phone is invalid.");
        }

    }

    public String getEmail() {
        return email;
    }

    public void isEmailValid() {
        if (getEmail().contains("@")) {
            System.out.println("Email is valid");
        } else {
            System.out.println("Email is invalid");
        }
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Person() {
    }

    public Person(int id) {
        this.id = id;
    }

    public Person(Integer id, Role role, String firstName, String lastName) {
        this.id = id;
        this.role = role;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(Integer id, Role role, String firstName, String lastName, String phone, String email) {
        this.id = id;
        this.role = role;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
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
