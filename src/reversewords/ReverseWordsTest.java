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

    @Test
    public void givenC_returnC(){
        ReverseWord reverseWord = new ReverseWord();
        String result = reverseWord.reverseString("C");
        assertEquals("C", result);
    }

    @Test
    public void givenCharan_returnCharan(){
        ReverseWord reverseWord = new ReverseWord();
        String result = reverseWord.reverseString("Charan");
        assertEquals("Charan", result);
    }

    @Test
    public void givenCharanWithSpace_returnCharan(){
        ReverseWord reverseWord = new ReverseWord();
        String result = reverseWord.reverseString("   Charan");
        assertEquals("Charan", result);
    }

    @Test
    public void givenCharanTeja_returnTejaCharan(){
        ReverseWord reverseWord = new ReverseWord();
        String result = reverseWord.reverseString("Charan Teja");
        assertEquals("Teja Charan", result);
    }

    @Test
    public void givenThisIsAnAmazingProgram_returnProgramAmazingAnIsThis(){
        ReverseWord reverseWord = new ReverseWord();
        String result = reverseWord.reverseString("This Is An Amazing Program");
        assertEquals("Program Amazing An Is This", result);
    }

    @Test
    public void givenIAmAStar_returnStarAMI(){
        ReverseWord reverseWord = new ReverseWord();
        String result = reverseWord.reverseString("decent is   This");
        assertEquals("This is decent", result);
    }
}
