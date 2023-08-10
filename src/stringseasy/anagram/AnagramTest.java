package stringseasy.anagram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnagramTest {

    @Test
    public void nothing(){}

    @Test
    public void givenNull_returnFalse(){
        Anagram anagram = new Anagram();
        boolean result = anagram.isAnagram(null, null);
        assertEquals(false, result);
    }

    @Test
    public void givenEmpty_returnFalse(){
        Anagram anagram = new Anagram();
        boolean result = anagram.isAnagram("", "");
        assertEquals(false, result);
    }
}
