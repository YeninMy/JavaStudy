package spring2;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring2.DB.DBConfig;
import spring2.DB.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@ToString
public class Lecture {
    private int id;
    private String name;
    private LocalDate date;

    public Lecture(int id, String name, LocalDate date) {
        this.id = id;
        this.name = name;
        this.date = date;
    }

    public static List<Lecture> getLectures() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(DBConfig.class);
        DBConnection dbConnection = applicationContext.getBean(DBConnection.class);
        Connection connection = dbConnection.getConnection();
        String sql = "SELECT * FROM lectures";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            ResultSet resultSet = preparedStatement.executeQuery();

            List<Lecture> lectures = new ArrayList<>();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                LocalDate date = resultSet.getDate("date").toLocalDate();
                Lecture l = new Lecture(id, name, date);
                lectures.add(l);
            }
            return lectures;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
