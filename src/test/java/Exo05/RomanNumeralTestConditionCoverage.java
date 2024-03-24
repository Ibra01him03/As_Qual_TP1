package Exo05;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanNumeralTestConditionCoverage {

    @Test
    public void InputOutOfRangeReturnExecptionSecond(){
        Assertions.assertThrows(IllegalArgumentException.class,()->RomanNumeral.toRoman(-3));
    }

    @Test
    public void InputOutOfRangeReturnExecption(){
        Assertions.assertThrows(IllegalArgumentException.class,()->RomanNumeral.toRoman(4000));
    }



    @Test
    public void ValideInputReturnXequalsTen(){
        Assertions.assertEquals("XI",RomanNumeral.toRoman(11));
    }
}
