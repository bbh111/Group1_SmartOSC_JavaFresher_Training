public class Person {
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public static final class PersonBuilder {
        private Address address;

        private PersonBuilder() {
        }

        public static PersonBuilder aPerson() {
            return new PersonBuilder();
        }

        public PersonBuilder withAddress(Address address) {
            this.address = address;
            return this;
        }

        public Person build() {
            Person person = new Person();
            person.setAddress(address);
            return person;
        }
    }
}
