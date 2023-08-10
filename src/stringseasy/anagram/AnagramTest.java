package stringseasy.anagram;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnagramTest {

    private Anagram anagram;

    @BeforeEach
    public void setup(){
        anagram = new Anagram();
    }

    @Test
    public void nothing(){}

    @Test
    public void givenNull_returnFalse(){
        boolean result = anagram.isAnagram(null, null);
        assertEquals(false, result);
    }

    @Test
    public void givenEmpty_returnFalse(){
        boolean result = anagram.isAnagram("", "");
        assertEquals(false, result);
    }

    @Test
    public void givenNullAndEmpty_returnFalse(){
        boolean result = anagram.isAnagram(null, "");
        assertEquals(false, result);
    }

    @Test
    public void givenEmptyAndNull_returnFalse(){
        boolean result = anagram.isAnagram("", null);
        assertEquals(false, result);
    }

    @Test
    public void givenAAndB_returnFalse(){
        boolean result = anagram.isAnagram("A", "B");
        assertEquals(false, result);
    }

    @Test
    public void givenAAndA_returnTrue(){
        boolean result = anagram.isAnagram("A", "A");
        assertEquals(true, result);
    }
}
