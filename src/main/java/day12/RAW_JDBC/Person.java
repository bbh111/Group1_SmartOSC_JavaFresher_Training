package day12.RAW_JDBC;

public class Person {
   private int ID;
    private String name;
    private int ID_City;

    public Person(String name, int ID_City) {

        this.name = name;
        this.ID_City = ID_City;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID_City() {
        return ID_City;
    }

    public void setID_City(int ID_City) {
        this.ID_City = ID_City;
    }
}
