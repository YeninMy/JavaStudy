package hibernate;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Homework {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column(name = "task")
    private String task;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "lecture_id")
    private Lecture lecture;

    public Homework() {
    }

    @Override
    public String toString() {
        return "Homework{" +
                "task='" + task + '\'' +
                '}';
    }
}
