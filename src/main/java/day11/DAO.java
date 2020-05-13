package day11;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAO {
    public List<User> getAllUser() {
        String sql = "SELECT * FROM db_taink.user";
        List<User> list = new ArrayList<>();
        try(Connection conn = JDBC.getConnection()){
            PreparedStatement pstm = (conn != null) ? conn.prepareStatement(sql) : null;
            if(pstm != null){
                ResultSet resultSet = pstm.executeQuery();
                while (resultSet != null && resultSet.next()){

                }
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return list;
    }

    public static void main(String[] args) {

    }
}
