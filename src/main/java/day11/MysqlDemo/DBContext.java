package day11.MysqlDemo;

import java.sql.*;
import java.util.function.Predicate;

public class DBContext {
    Connection connection;
    public static Connection getConnection() throws SQLException {
        String username = "root";
        String password = "12345678";
        String url = "jdbc:mysql://localhost:3306/Taiml?useSSL=false";
        return DriverManager.getConnection(url,username,password);
    }

    public static void main(String[] args) {
        try {
            Connection c = DBContext.getConnection();
            String query = "SELECT * FROM Taiml.users;";
            PreparedStatement preparedStatement = c.prepareStatement(query,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                System.out.println(rs.getString("name"));
                System.out.println(rs.getInt("age"));
                rs.first();
                rs.updateInt("age",20);
                rs.updateRow();
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
