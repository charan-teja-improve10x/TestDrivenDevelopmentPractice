package existnumberhigher;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExistANumberHigherTest {

    private ExistANumberHigher existANumberHigher;

    @BeforeEach
    public void setup(){
        existANumberHigher = new ExistANumberHigher();
    }

    @Test
    public void nothing(){}

    @Test
    public void givenEmptyArray_returnFalse(){
        boolean returnFalse = existANumberHigher.findTheExistNumber(new int[]{}, 5);
        assertEquals(false, returnFalse);
    }

    @Test
    public void givenZeroAndMinus1_returnTrue(){
        boolean returnTrue = existANumberHigher.findTheExistNumber(new int[]{0}, -1);
        assertEquals(true, returnTrue);
    }

    @Test
    public void givenAllNegativeNumbers_returnFalse(){
        boolean returnFalse = existANumberHigher.findTheExistNumber(new int[]{-1, -2, -3, -4, -5}, 0);
        assertEquals(false, returnFalse);
    }

    @Test
    public void given123and3_returnTrue(){
        boolean returnTrue = existANumberHigher.findTheExistNumber(new int[]{1, 2, 3}, 3);
        assertEquals(true, returnTrue);
    }

    @Test
    public void given123and5_returnFalse(){
        boolean returnFalse = existANumberHigher.findTheExistNumber(new int[]{1, 2, 3}, 5);
        assertEquals(false, returnFalse);
    }

    @Test
    public void given12and222_returnTrue(){
        boolean returnFalse = existANumberHigher.findTheExistNumber(new int[]{1, 2, 222}, 444);
        assertEquals(false, returnFalse);
    }
}
