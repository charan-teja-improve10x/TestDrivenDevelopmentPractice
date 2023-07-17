package palindrome;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class PalindromeTest {

    private Palindrome palindrome;

    @BeforeEach
    public void setup(){
        palindrome = new Palindrome();
    }

    @Test
    public void nothing(){}

    @Test
    public void givenNull_returnFalse(){
        boolean returnFalse  = palindrome.isPalindrome(null);
        assertEquals(false,returnFalse);
    }

    @Test
    public void givenEmpty_returnTrue(){
        boolean returnTrue  = palindrome.isPalindrome("");
        assertEquals(true,returnTrue);
    }

    @Test
    public void givenSingleS_returnTrue(){
        boolean returnTrue  = palindrome.isPalindrome("S");
        assertEquals(true, returnTrue);
    }

    @Test
    public void givenAa_returnTrue(){
        boolean returnTrue  = palindrome.isPalindrome("aa");
        assertEquals(true, returnTrue);
    }

    @Test
    public void givenMadam_returnTrue(){
        boolean returnTrue  = palindrome.isPalindrome("madam");
        assertEquals(true, returnTrue);
    }

    @Test
    public void givenMalayalam_returnTrue(){
        boolean returnTrue  = palindrome.isPalindrome("  malayalam");
        assertEquals(true, returnTrue);
    }

    @Test
    public void given12321_returnTrue(){
        boolean returnTrue  = palindrome.isPalindrome("12321  ");
        assertEquals(true, returnTrue);
    }

    @Test
    public void given12345_returnFalse(){
        boolean returnTrue  = palindrome.isPalindrome("12345");
        assertEquals(false, returnTrue);
    }
}
