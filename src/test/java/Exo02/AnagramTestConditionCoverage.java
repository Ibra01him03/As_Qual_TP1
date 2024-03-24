package Exo02;

import Exo02.Anagram;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AnagramTestConditionCoverage {
    @Test
    public void FirstStringNullReturnFalse(){
        Assertions.assertThrows(NullPointerException.class,()-> Anagram.isAnagram(null,"Machine"));
    }

    @Test
    public void SecondStringNullReturnFalse(){
        Assertions.assertThrows(NullPointerException.class,()-> Anagram.isAnagram("Machine",null));
    }


    @Test
    public void TwoSTringsWithDifferentsLengthReturnFalse(){
        Assertions.assertFalse(Anagram.isAnagram("hello","Machine"));
    }

    @Test
    public void TwoStringSameLengthReturnFalse(){
        Assertions.assertFalse(Anagram.isAnagram("Machine","Another"));  // c!=0
    }

    @Test
    public void TwoStringsReturnTrue(){
        Assertions.assertTrue(Anagram.isAnagram("Listen","Silent"));
    }
}
