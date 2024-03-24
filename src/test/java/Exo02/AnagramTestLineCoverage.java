package Exo02;

import Exo02.Anagram;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AnagramTestLineCoverage {
    @Test
    public void TwoStringsAreNullreturnExecption(){
        Assertions.assertThrows(NullPointerException.class,()-> Anagram.isAnagram(null,null));
    }

    @Test
    public void TwoSTringsWithDifferentsLengthReturnFalse(){
        Assertions.assertFalse(Anagram.isAnagram("hello","Machine"));
    }

    @Test
    public void TwoStringSameLengthReturnFalse(){
        Assertions.assertFalse(Anagram.isAnagram("Machine","Another"));
    }

    @Test
    public void TwoStringsReturnTrue(){
        Assertions.assertTrue(Anagram.isAnagram("Listen","Silent"));
    }
}
