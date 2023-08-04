package reversewords;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseWordsTest {

    @Test
    public void nothing(){}

    @Test
    public void givenNull_returnEmpty(){
        ReverseWord reverseWord = new ReverseWord();
        String result = reverseWord.reverseString(null);
        assertEquals("", result);
    }

    @Test
    public void givenEmpty_returnEmpty(){
        ReverseWord reverseWord = new ReverseWord();
        String result = reverseWord.reverseString("");
        assertEquals("", result);
    }
}
