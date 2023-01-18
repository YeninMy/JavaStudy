package onlineS;



public class Lecture {
    private Integer id=0;
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

    private Homework homework;

    public Homework getHomework() {
        return homework;
    }

    public void setHomework(Homework homework) {
        this.homework = homework;
    }

    public Lecture(int id) {
        this.id = id;
    }

    public Lecture(int id, int personId) {
        this.id = id;
        this.personId = personId;
    }

    public Lecture(int id, String name, Homework homework) {
        this.id = id;
        this.name = name;
        this.homework = homework;
    }


    @Override
    public String toString() {
        return "Lecture{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", homework=" + homework +
                '}';
    }
}
