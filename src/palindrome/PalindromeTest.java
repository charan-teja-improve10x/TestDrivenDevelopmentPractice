package palindrome;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PalindromeTest {

    @Test
    public void nothing(){}

    @Disabled
    @Test
    public void givenEmpty_returnFalse(){
        Palindrome palindrome = new Palindrome();
        boolean returnFalse = palindrome.isPalindrome("");
        assertEquals(false, returnFalse);
    }

    @Test
    public void givenAvva_returnTrue(){
        Palindrome palindrome = new Palindrome();
        boolean returnTrue = palindrome.isPalindrome("avva");
        assertEquals(true, returnTrue);
    }

    @Test
    public void givenCharan_returnFalse(){
        Palindrome palindrome = new Palindrome();
        boolean returnFalse = palindrome.isPalindrome("Charan");
        assertEquals(false, returnFalse);
    }

    @Test
    public void givenMalayalam_returnTrue(){
        Palindrome palindrome = new Palindrome();
        boolean returnTrue = palindrome.isPalindrome("malayalam");
        assertEquals(true, returnTrue);
    }

    @Test
    public void given121_returnTrue(){
        Palindrome palindrome = new Palindrome();
        boolean returnTrue = palindrome.isPalindrome("121");
        assertEquals(true, returnTrue);
    }

    @Test
    public void given1212_returnTrue(){
        Palindrome palindrome = new Palindrome();
        boolean returnFalse = palindrome.isPalindrome("1212");
        assertEquals(false, returnFalse);
    }
}
