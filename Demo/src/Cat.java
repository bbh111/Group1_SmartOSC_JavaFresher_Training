public class Cat extends Animal implements Say
{
    public static final String say = "Meo meo";
    public static final int NUMBER_OF_LEGS = 4;

    private String name;
    private int age;

    public String say() {
        return say;
    }

    public Cat(){}

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int getNumberOfLegs() {
        return NUMBER_OF_LEGS;
    }

    // Private Method.
    private void setName(String name) {
        this.name = name;
    }

    // Getters and setters
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

