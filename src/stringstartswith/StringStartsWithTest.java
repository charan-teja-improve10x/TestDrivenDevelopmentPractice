package stringstartswith;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringStartsWithTest {

    private StringStartsWith stringStartsWith;

    @BeforeEach
    public void setup(){
        stringStartsWith = new StringStartsWith();
    }

    @Test
    public void nothing(){}


    @Test
    public void givenNull_returnFalse(){
        boolean returnFalse = stringStartsWith.isStartsWith(null, null);
        assertEquals(false,returnFalse);
    }
    @Test
    public void givenEmpty_returnFalse(){
        boolean returnTrue = stringStartsWith.isStartsWith("", "");
        assertEquals(true, returnTrue);
    }

    @Test
    public void givenCharanAndEmpty_returnTrue(){
        boolean returnTrue = stringStartsWith.isStartsWith("Charan", "");
        assertEquals(true, returnTrue);
    }
    @Test
    public void givenCharanAndCh_returnTrue(){
        boolean returnTrue = stringStartsWith.isStartsWith("Charan", "Ch");
        assertEquals(true, returnTrue);
    }

    @Test
    public void givenSpaceCharanAndCh_returnTrue(){
        boolean returnTrue = stringStartsWith.isStartsWith("  Charan", "Ch");
        assertEquals(true, returnTrue);
    }

    @Test
    public void givenSpaceCharanAndSpaceCh_returnFalse(){
        boolean returnFalse = stringStartsWith.isStartsWith("  Charan", "  Ch");
        assertEquals(false, returnFalse);
    }

    @Test
    public void given9052363630WithSpace_returnFalse(){
        boolean returnFalse = stringStartsWith.isStartsWith("9052363630", "  9052363630");
        assertEquals(false, returnFalse);
    }

    @Test
    public void given9052363630WithSpace_returnTrue(){
        boolean returnTrue = stringStartsWith.isStartsWith(" +91 9052363630  ", "+91 9052363630");
        assertEquals(true, returnTrue);
    }
}
