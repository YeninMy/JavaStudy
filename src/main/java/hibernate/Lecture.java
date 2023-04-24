package hibernate;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
public class Lecture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "date")
    private LocalDate date;

    @Embedded
    private Teacher teacher;

    @ManyToMany(mappedBy = "lectures", fetch = FetchType.EAGER)
    private Set<Student> students = new HashSet<>();

    @OneToMany(mappedBy = "lecture",cascade = CascadeType.ALL)
    private Set<Homework> homeworks = new HashSet<>();


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cource_id")
    private Cource cource;
    public Lecture() {
    }

    public void addHomework(Homework homework) {
        this.homeworks.add(homework);
        homework.setLecture(this);
    }


    @Override
    public String toString() {
        return "Lecture{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date=" + date +
                ", teacher=" + teacher +
                '}';
    }
}
