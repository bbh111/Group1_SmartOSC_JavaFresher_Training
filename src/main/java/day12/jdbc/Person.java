package day12.jdbc;

public class Person {
    private int id;
    private String name;
    private int cid;

    public Person(int id, String name, int cid) {
        this.id = id;
        this.name = name;
        this.cid = cid;
    }

    public Person(String name, int cid) {
        this.name = name;
        this.cid = cid;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public Person() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
