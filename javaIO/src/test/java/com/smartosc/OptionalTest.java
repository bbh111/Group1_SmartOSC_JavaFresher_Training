package com.smartosc;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OptionalTest {
    @Test
    public void shouldReturnProvinceWhenProvided() {
        Person person = new Person(new Address(new Province("Ha Noi")));
        assertThat(Person.getProvince(person)).isEqualTo("Ha Noi");
    }

    @Test
    public void shouldThrowProvinceNotFoundWhenNoProvinceProvided() {
        Exception exception = assertThrows(ProvinceNotFound.class, () -> Person.getProvince(null));
        String expecteMessage = "Province is not found";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expecteMessage));
    }

    @Test
    public void shouldThrowProvinceNotFoundWhenNoProvinceProvided_2() {
        Exception exception = assertThrows(ProvinceNotFound.class, () -> Person.getProvince(new Person(null)));
        String expecteMessage = "Province is not found";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expecteMessage));
    }

    @Test
    public void shouldThrowProvinceNotFoundWhenNoProvinceProvided_3() {
        Exception exception = assertThrows(ProvinceNotFound.class, () -> Person.getProvince(new Person(new Address(null))));
        String expecteMessage = "Province is not found";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expecteMessage));
    }
}


