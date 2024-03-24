package Exo06;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTestBrancheCoverage {

    @Test
    public void InvalideInputReturnException(){
        Assertions.assertThrows(IllegalArgumentException.class,()->FizzBuzz.fizzBuzz(0));
    }

    @Test
    public void DivisbleFifteenReturnFizzBuzz(){
        Assertions.assertEquals("FizzBuzz",FizzBuzz.fizzBuzz(45));
    }

    @Test
    public void DivisbleThreeReturnFizz(){
        Assertions.assertEquals("Fizz",FizzBuzz.fizzBuzz(9));
    }

    @Test
    public void DivisbleFiveReturnBuzz(){
        Assertions.assertEquals("Buzz",FizzBuzz.fizzBuzz(10));
    }

    @Test
    public void NonDivisbleReturnNumberIntoString(){
        Assertions.assertEquals("47",FizzBuzz.fizzBuzz(47));
    }
}
