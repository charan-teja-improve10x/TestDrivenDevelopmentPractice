package stringsmedium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordReverseTest {

    @Test
    public void nothing(){}

    @Test
    public void givenNull_returnEmpty(){
        WordReverse wordReverse = new WordReverse();
        String reverse = wordReverse.reverseWords(null);
        assertEquals("", reverse);
    }

    @Test
    public void givenEmpty_returnEmpty(){
        WordReverse wordReverse = new WordReverse();
        String reverse = wordReverse.reverseWords("");
        assertEquals("", reverse);
    }
}
