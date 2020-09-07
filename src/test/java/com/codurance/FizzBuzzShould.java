package com.codurance;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzShould {

    @Test
    public void return_empty_string_when_number_is_zero() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String output = fizzBuzz.convert(0);
        assertEquals("", output);
    }

    @ParameterizedTest
    @CsvSource({"1,1","2,2"})
    public void return_1_when_number_is_one(int input, String outputExpected) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualOutput = fizzBuzz.convert(input);
        assertEquals(outputExpected, actualOutput);

    }


}