package ru.job4j.ex;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CountTest {
    @Test
    public void whenExceptionStart10Finish2() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    new Factorial().calc(-1);
                });
        assertThat(exception.getMessage()).isEqualTo("Number could not be less than 0");
    }

    @Test
    public void whenExceptionStart0Finish3() {
            int start = 0;
            int finish = 3;
            int expected = 3;
            int result = Count.add(start, finish);
            assertThat(result).isEqualTo(expected);
    }

}