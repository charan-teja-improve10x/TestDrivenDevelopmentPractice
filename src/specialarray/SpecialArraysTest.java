package specialarray;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SpecialArraysTest {

    private SpecialArray specialArray;

    @BeforeEach
    public void setup(){
        specialArray = new SpecialArray();
    }

    @Test
    public void nothing() {
    }


    @Test
    public void givenNull_returnFalse() {
        assertThrows(SpecialArray.InvalidArrayException.class, () -> specialArray.isSpecialArray(null), "Invalid input");
    }

    @Test
    public void givenEmpty_returnFalse() {
        assertThrows(SpecialArray.InvalidArrayException.class, () -> specialArray.isSpecialArray(new Integer[]{}), "Invalid input");
    }

    @Test
    public void givenSmallArray_returnFalse() throws SpecialArray.InvalidArrayException {
        Boolean givenFalse = specialArray.isSpecialArray(new Integer[] {1});
        assertEquals(false, givenFalse);
    }

    @Test
    public void givenSmallArrayWith2Length_returnTrue() throws SpecialArray.InvalidArrayException {
        Boolean returnFalse = specialArray.isSpecialArray(new Integer[] {10, 1});
        assertEquals(true, returnFalse);
    }

    @Test
    public void givenFalseInput_returnFalse() throws SpecialArray.InvalidArrayException {
        Boolean givenFalse = specialArray.isSpecialArray(new Integer[] {1,2,1});
        assertEquals(false, givenFalse);
    }

    @Test
    public void givenArray_returnTrue() throws SpecialArray.InvalidArrayException {
        Boolean returnTrue = specialArray.isSpecialArray(new Integer[] {2, 7, 4, 9});
        assertEquals(true, returnTrue);
    }

    @Test
    public void givenFalseInput_returnTrue() throws SpecialArray.InvalidArrayException {
        Boolean returnFalse = specialArray.isSpecialArray(new Integer[] {2, 7, 8, 8, 6, 1});
        assertEquals(false, returnFalse);
    }

    @Test
    public void givenTrue_returnTrue() throws SpecialArray.InvalidArrayException {
        Boolean returnTrue = specialArray.isSpecialArray(new Integer[] {2, 3, 12, 5, 4, 11, 4, 7});
        assertEquals(true, returnTrue);
    }
}
