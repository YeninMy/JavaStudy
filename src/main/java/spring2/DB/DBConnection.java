package spring2.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private String driverClass;
    private String dbUrl;
    private String username;
    private char[] password;
    private Connection connection;

    public DBConnection(String driverClass, String dbUrl, String username, char[] password) {
        this.driverClass = driverClass;
        this.dbUrl = dbUrl;
        this.username = username;
        this.password = password;
    }

    public Connection getConnection() {
        if (this.connection != null) {
            return connection;
        }
        Connection con = null;
        try {
            System.out.println("Creating DB Connection");
            Class.forName(driverClass);
            con = DriverManager.getConnection(dbUrl, username, String.valueOf(password));
            System.out.println("Successfully Created DB Connection");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        this.connection = con;
        return con;
    }


    public void close() {
        System.out.println("DBConnection close called");
        if (this.connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}