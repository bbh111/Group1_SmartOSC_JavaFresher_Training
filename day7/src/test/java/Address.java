public class Address {
    private Province province;

    public Province getProvince() {
        return province;
    }

    public void setProvince(Province province) {
        this.province = province;
    }

    public static final class AddressBuilder {
        private Province province;

        private AddressBuilder() {
        }

        public static AddressBuilder anAddress() {
            return new AddressBuilder();
        }

        public AddressBuilder withProvince(Province province) {
            this.province = province;
            return this;
        }

        public Address build() {
            Address address = new Address();
            address.setProvince(province);
            return address;
        }
    }
}
