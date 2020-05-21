package org.example;

import java.sql.*;

public class Controller {
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/sendemailjdbctest?serverTimezone=UTC";
        Connection conn = null;
        return DriverManager.getConnection(url, "root", "");
    }

}
