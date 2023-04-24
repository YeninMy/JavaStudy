package hibernate;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import java.util.HashSet;
import java.util.Set;

@Cacheable
@org.hibernate.annotations.Cache(
        usage = CacheConcurrencyStrategy.READ_ONLY,
        region = "Cource"
)
@Getter
@Setter
@Entity

public class Cource {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @org.hibernate.annotations.Cache(
            usage = CacheConcurrencyStrategy.READ_ONLY,
            region = "Lecture"
    )
    @OneToMany(mappedBy = "cource",cascade = CascadeType.ALL)
    private Set<Lecture> lectures = new HashSet<>();

    public Cource() {
    }


    public void addLecture(Lecture lecture) {
        this.lectures.add(lecture);
        lecture.setCource(this);
    }
}
