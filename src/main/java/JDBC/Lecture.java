package JDBC;

import lombok.Getter;
import lombok.Setter;

import java.sql.*;
import java.time.LocalDate;


@Getter
@Setter
public class Lecture {
    private int id;
    private String name;
    private LocalDate date;

    public Lecture() {
    }

    public Lecture(int id, String name, LocalDate date) {
        this.id = id;
        this.name = name;
        this.date = date;
        addLecToDb(Lecture.this);
    }

    public static void addLecToDb(final Lecture lecture) {
        try {
            String sql = "INSERT INTO lectures (id, name, date) VALUES " +
                    "(?, ?, ?)";
            try (Connection conn = AbstractRepository.createCon();
                 PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
                preparedStatement.setInt(1, lecture.getId());
                preparedStatement.setString(2, lecture.getName());
                preparedStatement.setDate(3, Date.valueOf(lecture.getDate()));
                int rows = preparedStatement.executeUpdate();
                System.out.println("add Lines Lecture: " + rows);
                System.out.println(lecture);
            }
        } catch (Exception ex) {
            updateDevice(lecture.getId(), lecture);
            System.out.println(lecture);
        }
    }

    public static void copyLecById(Lecture lecture, int idFromDb, int newId) {
        try {
            String sql = "SELECT * FROM lectures WHERE id = ?";
            try (Connection conn = AbstractRepository.createCon();
                 PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
                preparedStatement.setInt(1, idFromDb);
                ResultSet resultSet = preparedStatement.executeQuery();
                resultSet.next();
                lecture.setId(newId);
                lecture.setName(resultSet.getString("name"));
                lecture.setDate(resultSet.getDate("date").toLocalDate());
                addLecToDb(lecture);
            }
        } catch (Exception ex) {
            System.out.println("Connection failed..." + ex);
        }
    }

    public static void updateDevice(int id, Lecture lecture) {
        try {
            String sql = "UPDATE lectures SET id=?, name =?, date = ? WHERE id = ?";
            try (Connection conn = AbstractRepository.createCon();
                 PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
                preparedStatement.setInt(1, lecture.getId());
                preparedStatement.setString(2, lecture.getName());
                preparedStatement.setDate(3, Date.valueOf(lecture.getDate()));
                preparedStatement.setInt(4, id);
                preparedStatement.executeUpdate();
            }
        } catch (Exception ex) {
            System.out.println("Connection failed..." + ex);
        }
    }

    @Override
    public String toString() {
        return "Lecture{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date=" + date +
                '}';
    }

    public static void delLecture(int id) {
        try {
            String sql = "DELETE FROM lectures WHERE id = ?";
            try (Connection conn = AbstractRepository.createCon();
                 PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
                preparedStatement.setInt(1, id);
                preparedStatement.executeUpdate();
                System.out.println("delete lecture by id " + id);
            }
        } catch (Exception ex) {
            System.out.println("Connection failed..." + ex);
        }
    }


}
