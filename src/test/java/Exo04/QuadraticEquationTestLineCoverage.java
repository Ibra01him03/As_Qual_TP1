package Exo04;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuadraticEquationTestLineCoverage {

    @Test
    public void ArgumentAisZeroReturnException(){
        Assertions.assertThrows(IllegalArgumentException.class,()->QuadraticEquation.solve(0,1,2));
    }

    @Test

    public void DeltaLessThenZeroReturnNull(){

        Assertions.assertEquals(null,QuadraticEquation.solve(1,2,3));
    }

    @Test
    public void DeltaZeroReturnOneSolution(){
        double[] result = QuadraticEquation.solve(1, -2, 1);
        Assertions.assertArrayEquals(new double[]{1.0}, result);
    }

    @Test
    public void DeltaSupZeroReturnTwoSolution(){
        double[] result = QuadraticEquation.solve(1, -3, 2);
        Assertions.assertArrayEquals(new double[]{2.0, 1.0}, result);
    }
}
