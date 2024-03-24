package Exo01;

import Exo01.Palindrome;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeTestConditionCoverage {
    @Test
    public void PalindromeTestNull()
    {
        Assertions.assertThrows(NullPointerException.class,()->Palindrome.isPalindrome(null));
    }


    @Test
    public void PalidromeTestReturnFalseToCoverageCondition(){
        Assertions.assertFalse(Palindrome.isPalindrome("Machine"));
    }
}
