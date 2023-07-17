package stringstartswith;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringStartsWithTest {

    @Test
    public void nothing(){}

    @Test
    public void givenEmpty_returnFalse(){
        StringStartsWith stringStartsWith = new StringStartsWith();
        boolean returnFalse = stringStartsWith.isStartsWith("", "Ch");
        assertEquals(false, returnFalse);
    }

    @Test
    public void givenCharanAndCh_returnTrue(){
        StringStartsWith stringStartsWith = new StringStartsWith();
        boolean returnTrue = stringStartsWith.isStartsWith("Charan", "Ch");
        assertEquals(true, returnTrue);
    }

    @Test
    public void givenSpaceCharanAndCh_returnTrue(){
        StringStartsWith stringStartsWith = new StringStartsWith();
        boolean returnTrue = stringStartsWith.isStartsWith("  Charan", "Ch");
        assertEquals(true, returnTrue);
    }

    @Test
    public void givenSpaceCharanAndSpaceCh_returnFalse(){
        StringStartsWith stringStartsWith = new StringStartsWith();
        boolean returnFalse = stringStartsWith.isStartsWith("  Charan", "  Ch");
        assertEquals(false, returnFalse);
    }

    @Test
    public void given9052363630WithSpace_returnFalse(){
        StringStartsWith stringStartsWith = new StringStartsWith();
        boolean returnFalse = stringStartsWith.isStartsWith("9052363630", "  9052363630");
        assertEquals(false, returnFalse);
    }

    @Test
    public void given9052363630WithSpace_returnTrue(){
        StringStartsWith stringStartsWith = new StringStartsWith();
        boolean returnTrue = stringStartsWith.isStartsWith(" +91 9052363630  ", "+91 9052363630");
        assertEquals(true, returnTrue);
    }
}
