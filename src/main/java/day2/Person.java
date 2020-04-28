package main.java.day2;

public class Person {
    private String firstName;
    private String lastName = "";

    public Person(String fullName) {
        String[] temp = fullName.split(" ");
        for (int i = 0; i < temp.length; i++) {
            if (i != 0) {

                lastName += temp[i];
            } else {
                firstName = temp[i];
            }
        }

    }

    public void display() {
        System.out.println("First Name is: " + this.firstName);
        System.out.println("Last Name is: " + this.lastName);
    }
}
