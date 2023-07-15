package stringendswith;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringEndsWithTest {

    @Test
    public void nothing(){}

    @Test
    public void givenCharanAndAn_returnTrue() {
        StringEnding stringEnding = new StringEnding();
        boolean returnTrue = stringEnding.checkStringEnding("Charan", "an");
        assertEquals( true, returnTrue);
    }

    @Test
    public void givenCharanAndAnSpace_returnFalse() {
        StringEnding stringEnding = new StringEnding();
        boolean returnFalse = stringEnding.checkStringEnding("Charan", "an ");
        assertEquals( false, returnFalse);
    }

    @Test
    public void givenCharanAndCharan_returnTrue() {
        StringEnding stringEnding = new StringEnding();
        boolean returnTrue = stringEnding.checkStringEnding("Charan", "Charan");
        assertEquals( true, returnTrue);
    }

    @Test
    public void givenCharanTejaAndTeja_returnTrue() {
        StringEnding stringEnding = new StringEnding();
        boolean returnTrue = stringEnding.checkStringEnding("Charan Teja", " Teja");
        assertEquals( true, returnTrue);
    }

    @Test
    public void givenCharanTejaAndTeja_returnFalse() {
        StringEnding stringEnding = new StringEnding();
        boolean returnFalse = stringEnding.checkStringEnding("Charan Teja", " Teja  ");
        assertEquals( false, returnFalse);
    }
}
