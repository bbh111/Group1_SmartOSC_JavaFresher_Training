package day12.RAW_JDBC.PersonDAO;

import day12.RAW_JDBC.JDBC;
import day12.RAW_JDBC.Person;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PersonDAO {
    public List<Person> getAllByCity(int id_city) {
        List<Person> personList = new ArrayList<>();
        String sql = "SELECT * FROM db_taink.person where ID_City = ?";
        try (Connection connection = JDBC.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id_city);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("ID");
                String name = resultSet.getString("Name");
                int idcity = resultSet.getInt("ID_City");
                Person person = new Person(name, idcity);
                personList.add(person);
            }
            return personList;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    public boolean insertPerson(List<Person> people) {
        int x[] = null;
        String sql = "INSERT INTO Person(Id,Name,Id_city) " + "VALUES(?,?,?)";
        try (Connection connection = JDBC.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            people.stream().forEach(person -> setData(person,preparedStatement));
           x = preparedStatement.executeBatch();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
       return (x.length > 0)?true : false;
    }

    public void setData(Person data, PreparedStatement statement) {
        try {
            statement.setInt(1, data.getID());
            statement.setString(2, data.getName());
            statement.setInt(3, data.getID_City());
            statement.addBatch();

        } catch (SQLException throwables) {
            throwables.printStackTrace();

        }

    }
}
