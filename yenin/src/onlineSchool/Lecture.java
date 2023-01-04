package onlineSchool;

public class Lecture extends Essence {
    public Lecture(int id) {
        super(id);
    }
    public int personId;
    @Override
    public String toString() {
        return "Lecture{" +
                "id=" + getId() +
                ", personId=" + personId +
                '}';
    }

    public Lecture(int id, int personId) {
        super(id);
        this.personId = personId;
    }



    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;

    }

}
