package stringendswith;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringEndsWithTest {

    private StringEnding stringEnding;

    @BeforeEach
    public void setup(){
        stringEnding = new StringEnding();
    }

    @Test
    public void nothing(){}

    @Test
    public void givenCharanAndAn_returnTrue() {
        boolean returnTrue = stringEnding.checkStringEnding("Charan", "an");
        assertEquals( true, returnTrue);
    }

    @Test
    public void givenCharanAndAnSpace_returnFalse() {
        boolean returnFalse = stringEnding.checkStringEnding("Charan", "an ");
        assertEquals( false, returnFalse);
    }

    @Test
    public void givenCharanAndCharan_returnTrue() {
        boolean returnTrue = stringEnding.checkStringEnding("Charan", "Charan");
        assertEquals( true, returnTrue);
    }

    @Test
    public void givenCharanTejaAndTeja_returnTrue() {
        boolean returnTrue = stringEnding.checkStringEnding("Charan Teja", " Teja");
        assertEquals( true, returnTrue);
    }

    @Test
    public void givenCharanTejaAndTeja_returnFalse() {
        boolean returnFalse = stringEnding.checkStringEnding("Charan Teja", " Teja  ");
        assertEquals( false, returnFalse);
    }
}
