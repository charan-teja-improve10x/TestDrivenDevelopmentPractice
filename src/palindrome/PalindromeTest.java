package palindrome;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
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
    public void givenEmpty_returnFalse(){
        boolean returnTrue = palindrome.isPalindrome("");
        assertEquals(true, returnTrue);
    }

    @Test
    public void givenAvva_returnTrue(){
        boolean returnTrue = palindrome.isPalindrome("avva");
        assertEquals(true, returnTrue);
    }

    @Test
    public void givenCharan_returnFalse(){
        boolean returnFalse = palindrome.isPalindrome("Charan");
        assertEquals(false, returnFalse);
    }

    @Test
    public void givenMalayalam_returnTrue(){
        boolean returnTrue = palindrome.isPalindrome("malayalam");
        assertEquals(true, returnTrue);
    }

    @Test
    public void given121_returnTrue(){
        boolean returnTrue = palindrome.isPalindrome("121");
        assertEquals(true, returnTrue);
    }

    @Test
    public void given1212_returnTrue(){
        boolean returnFalse = palindrome.isPalindrome("1212");
        assertEquals(false, returnFalse);
    }
}
