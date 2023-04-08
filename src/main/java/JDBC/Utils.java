package JDBC;

import java.sql.*;

public class Utils {


    public static void getCount(String tablename) throws Exception {
        int index = tablename.indexOf(' ');
        if (index > -1) {
            throw (new Exception("Invalid value"));
        }
        try {
            String sql = "SELECT COUNT(*) FROM " + tablename;
            try (Connection conn = AbstractRepository.createCon();
                 Statement statement = conn.createStatement()) {
                ResultSet rs = statement.executeQuery(sql);
                while (rs.next()) {
                    System.out.println("Number of lectures in the database: " + rs.getString(1));
                }
            }
        } catch (Exception ex) {
            System.out.println("Connection failed..." + ex);
        }
    }


    public static void getCountPrepared(String tableName) {
        try {
            String sql = "{call get_count(?)}";
            try (Connection conn = AbstractRepository.createCon();
                 CallableStatement callableStatement = conn.prepareCall(sql)) {
                callableStatement.setString(1, tableName);
                ResultSet resultSet = callableStatement.executeQuery();
                while (resultSet.next()) {
                    System.out.println("Number of lectures in the database: " + resultSet.getString(1));
                }
            }
        } catch (Exception ex) {
            System.out.println("Connection failed..." + ex);
        }
    }

    protected static void printTable(String tableName) throws Exception {
        int index = tableName.indexOf(' ');
        if (index > -1) {
            throw (new Exception("Invalid value"));
        }
        try (Connection connection = AbstractRepository.createCon();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT * FROM " + tableName)) {
            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnsNumber = metaData.getColumnCount();
            while (resultSet.next()) {
                for (int i = 1; i <= columnsNumber; i++) {
                    if (i > 1) System.out.print(", ");
                    String columnValue = resultSet.getString(i);
                    System.out.print(metaData.getColumnName(i) + ": " + columnValue);
                }
                System.out.println("");
            }
        } catch (SQLException e) {
        }
    }


    public static void printTableData(String tableName) {
        try (Connection conn = AbstractRepository.createCon()) {
            CallableStatement stmt = conn.prepareCall("{CALL print_all(?)}");
            stmt.setString(1, tableName);
            ResultSet rs = stmt.executeQuery();
            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();
            for (int i = 1; i <= columnCount; i++) {
                System.out.print(metaData.getColumnLabel(i) + "\t");
            }
            System.out.println();
            while (rs.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    System.out.print(rs.getString(i) + "\t");
                }
                System.out.println();
            }
        } catch (SQLException ex) {
            System.out.println("Error printing table data: " + ex.getMessage());
        }
    }




}
