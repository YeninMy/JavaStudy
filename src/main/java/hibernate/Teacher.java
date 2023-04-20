package hibernate;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
@Embeddable
public class Teacher {
    @Column(name = "teacher_name")
    private String name;
    @Column(name = "teacher_lastname")
    private String lastname;

    public Teacher() {
    }
}
