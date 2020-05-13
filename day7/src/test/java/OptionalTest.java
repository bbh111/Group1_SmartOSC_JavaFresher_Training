import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) {
        Person p1 = null;
        Person p2 = Person.PersonBuilder.aPerson().withAddress(new Address()).build();
        Person p3 = new Person();
        Person p4 = Person.PersonBuilder.aPerson()
                .withAddress(
                        Address.AddressBuilder.anAddress()
                                .withProvince(new Province("Tỉnh Hà Nội"))
                                .build()
                ).build();
        System.out.println(printProvince(p4));
    }

    private static String printProvince(Person person) {
        return Optional.ofNullable(person)
                .flatMap(p1 -> Optional.ofNullable(p1.getAddress()))
                .flatMap(address -> Optional.ofNullable(address.getProvince()))
                .orElseThrow(() -> new ProvinceNotFound("Khong tim thay Thanh pho!")).getName();
    }
}


