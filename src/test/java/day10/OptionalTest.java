package day10;

import day11.Valid;
import day8.Adress;
import day8.Main;
import day8.Person;
import day8.Province;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Optional;


public class OptionalTest {
    @Test
    public void shouldResultProvinceWhenProvided(){
        Province province = new Province("Hung Yen");
        Adress adress = new Adress(province);
        Person person2 = new Person("Tai NK", adress);
        Optional<String> optional = Optional.of("Hung Yen");
        Assert.assertEquals(Main.display(person2),optional);
    }

    @Test
    public void shouldThrowProvinceNotFoundWhenNoProvinceProvided_1(){
        Person person1 = new Person();
        String expectedMessage = "Hello word";
        Main main = new Main();
        Exception exception = Assertions.assertThrows(RuntimeException.class, () -> { Main.display(person1);} );
        Assert.assertTrue(exception.getMessage().contains(expectedMessage));
    }
    @Test
    public void xxx(){
        Valid valid = new Valid();
     //  int x =  valid.readFile2("<h1>");
    }
}
