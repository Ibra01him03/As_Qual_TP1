package Exo05;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanNumeralTestLineCoverage {

    @Test
    public void InputOutOfRangeReturnExecption(){
        Assertions.assertThrows(IllegalArgumentException.class,()->RomanNumeral.toRoman(4000));
    }

    @Test
    public void ValideInputReturnXequalsTen(){
        Assertions.assertEquals("X",RomanNumeral.toRoman(10));
    }
}
