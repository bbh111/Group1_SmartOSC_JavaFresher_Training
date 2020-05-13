package day9.demoOptional;

public class Address {
    private Province province;
    private String street;


    public Address() {
    }

    public Address(Province province) {
        this.province = province;
    }

    @Override
    public String toString() {
        return "Address{" +
                "province=" + province +
                '}';
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Province getProvince() {
        return province;
    }

    public void setProvince(Province province) {
        this.province = province;
    }
}
