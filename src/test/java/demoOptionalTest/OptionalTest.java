package demoOptionalTest;

import day9.demoOptional.Address;
import day9.demoOptional.Main;
import day9.demoOptional.Person;
import day9.demoOptional.Province;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Optional;

public class OptionalTest {

    @Test
    public void shouldShowErrorForNullPerson() {
        Optional<Person> p1 = Optional.ofNullable(null);
        Exception e = Assertions.assertThrows(IllegalStateException.class, () -> {
            Main.getName(p1);
        });
        String actualMessage = e.getMessage();
        String expectedMessage = "Loi";
        Assert.assertEquals(actualMessage, expectedMessage);
    }

    @Test
    public void shouldShowErrorForNullAddress() {
        Optional<Person> p2 = Optional.ofNullable(new Person());
        Exception e = Assertions.assertThrows(IllegalStateException.class, () -> {
            Main.getName(p2);
        });
        String actualMessage = e.getMessage();
        String expectedMessage = "Loi";
        Assert.assertEquals(actualMessage, expectedMessage);
    }

    @Test
    public void shouldShowErrorForNullProvince() {
        Main m = new Main();
        Optional<Person> p3 = Optional.ofNullable(new Person(new Address()));
        Exception e = Assertions.assertThrows(IllegalStateException.class, () -> {
            Main.getName(p3);
        });
        String actualMessage = e.getMessage();
        String expectedMessage = "Loi";
        Assert.assertEquals(actualMessage, expectedMessage);
    }

    @Test
    public void shouldShowProvince() {
        Optional<Person> p4 = Optional.ofNullable(new Person(new Address(new Province("Ha Noi"))));
        String actualMessage = Main.getName(p4);
        String expectedMessage = "Ha Noi";
        Assert.assertEquals(actualMessage, expectedMessage);
    }
}
