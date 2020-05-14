package day12.jdbc;

import day6.exercise3.Result;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class PersonDAO {
    Connection c;

    public int insertPerson(Person p) {
        int i = 0;
        try {
            c = DBContext.getConnection();
            String query = "INSERT INTO Person(Name, cid) \n" +
                    "values (?,?)";
            PreparedStatement statement = c.prepareStatement(query);
            statement.setString(1, p.getName());
            statement.setInt(2, p.getCid());
            i = statement.executeUpdate();
            DBContext.closeConnection(statement, null, c);
        } catch (SQLException throwables) {
            System.out.println("ID thanh pho khong dung");
        }
        return i;
    }

    public List<Person> getPersonByCidID(int cid){
        List<Person>people = new ArrayList<>();
        try {
            c = DBContext.getConnection();
            String query = "SELECT * from Person where cid = ?";
            PreparedStatement statement = c.prepareStatement(query);
            statement.setInt(1,cid);
            ResultSet rs = statement.executeQuery();
            while (rs.next()){
                Person p = new Person(rs.getString("Name"),rs.getInt("cid"));
                people.add(p);
            }
            DBContext.closeConnection(statement,rs,c);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return people;
    }
}
