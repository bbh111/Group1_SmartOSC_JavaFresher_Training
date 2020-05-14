package day12.jdbc;

import java.sql.*;

public class DBContext {
    Connection connection;
    static final String username = "root";
    static final String password = "12345678";
    static final String url = "jdbc:mysql://localhost:3306/DemoPersonCity?useSSL=false";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, username, password);
    }

    public static void closeConnection(PreparedStatement preparedStatement, ResultSet rs, Connection c) {
        if (preparedStatement != null || rs != null || c != null) {
            try {
                preparedStatement.close();
                // rs.close();
                c.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

        }
    }
}
