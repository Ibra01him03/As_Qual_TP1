package Exo03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinarySearchTestLineCoverage {

    @Test
    public void ArrayNullReturnException(){
        Assertions.assertThrows(NullPointerException.class,()-> BinarySearch.binarySearch(null,4));
    }

    @Test
    public void ArrayWithoutElement(){
        int[] array = {1, 2, 3, 4, 6, 7, 8, 9, 10};
        int index = BinarySearch.binarySearch(array, 5);
        Assertions.assertEquals(-1, index);
    }

    @Test

    public  void ArrayWithElement(){
        int[] array = {1, 2, 3, 4,5, 6, 7, 8, 9, 10};
        int index = BinarySearch.binarySearch(array, 5);
        Assertions.assertEquals(4, index);
    }
}

