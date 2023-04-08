package Project;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Book {
    String title;
    String author;
    Genre genre;
    double price;
    boolean availability;
    double rating;


}
