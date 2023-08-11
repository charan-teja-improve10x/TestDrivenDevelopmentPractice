package stringsmedium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordReverseTest {

    private WordReverse wordReverse;

    @BeforeEach
    public void setup(){
        wordReverse = new WordReverse();
    }

    @Test
    public void nothing(){}

    @Test
    public void givenNull_returnEmpty(){
        String reverse = wordReverse.reverseWords(null);
        assertEquals("", reverse);
    }

    @Test
    public void givenEmpty_returnEmpty(){
        String reverse = wordReverse.reverseWords("");
        assertEquals("", reverse);
    }
}
