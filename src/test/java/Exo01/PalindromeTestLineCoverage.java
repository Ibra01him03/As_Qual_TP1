package Exo01;

import Exo01.Palindrome;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeTestLineCoverage {
    @Test
    public void PalindromeTestNull()
    {
        Assertions.assertThrows(NullPointerException.class,()->Palindrome.isPalindrome(null));
    }
    @Test
    public void PalindromeTestReturnTrue(){
        Assertions.assertTrue(Palindrome.isPalindrome("radar"));
    }

    @Test
    public void PalidromeTestReturnFalse(){
        Assertions.assertFalse(Palindrome.isPalindrome("New York"));
    }
}
