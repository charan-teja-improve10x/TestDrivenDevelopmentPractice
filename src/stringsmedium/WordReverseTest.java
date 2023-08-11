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

    @Test
    public void givenOneCharacter_returnWord(){
        String reverse = wordReverse.reverseWords("C");
        assertEquals("C", reverse);
    }

    @Test
    public void givenCharan_returnCharan(){
        String reverse = wordReverse.reverseWords("Charan");
        assertEquals("Charan", reverse);
    }

    @Test
    public void givenCharanTeja_returnTejaCharan(){
        String reverse = wordReverse.reverseWords("Charan Teja");
        assertEquals("Teja Charan", reverse);
    }

    @Test
    public void givenIAmAStar_returnStarAmI(){
        String reverse = wordReverse.reverseWords("I am a star");
        assertEquals("star a am I", reverse);
    }

}
