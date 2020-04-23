package day2;

public class Person {
    private String firstName;
    private String lastName;
    private String inputName;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getInputName() {
        return inputName;
    }

    public Person(String inputName) {
        this.inputName = inputName;
    }

    public void checkName(String rawName){
        String[] names = this.getInputName().split(" ");
        this.firstName = names[0];
        this.lastName = names[1];
    }
}
