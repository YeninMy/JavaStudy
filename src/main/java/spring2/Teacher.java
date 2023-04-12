package spring2;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Getter
@Setter
@ToString
@Component
public class Teacher {
    @Value("${teacher.name}")
    private String name;
    @Value("${teacher.lastname}")
    private String lastname;


}
