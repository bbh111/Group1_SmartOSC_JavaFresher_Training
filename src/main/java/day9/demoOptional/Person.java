package day9.demoOptional;

public class Person {
    private String name;
    private Address add;


    public Address getAdd() {
        return add;
    }

    public void setAdd(Address add) {
        this.add = add;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(Address add) {
        this.add = add;
    }

    public Person() {
    }
}
