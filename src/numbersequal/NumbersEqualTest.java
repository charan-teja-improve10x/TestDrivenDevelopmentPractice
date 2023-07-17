package numbersequal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumbersEqualTest {

    @Test
    public void nothing(){}

    @Test
    public void givenTwoSameNegativeNumbers_returnTrue(){
        NumbersEqual numbersEqual = new NumbersEqual();
        boolean returnTrue = numbersEqual.isEquals(-1, -1);
        assertEquals(true, returnTrue);
    }

    @Test
    public void givenTwoZeros_returnTrue(){
        NumbersEqual numbersEqual = new NumbersEqual();
        boolean returnTrue = numbersEqual.isEquals(0, 0);
        assertEquals(true, returnTrue);
    }

    @Test
    public void givenZeroAndOne_returnFalse(){
        NumbersEqual numbersEqual = new NumbersEqual();
        boolean returnFalse = numbersEqual.isEquals(0, 1);
        assertEquals(false, returnFalse);
    }

    @Test
    public void givenFiftyAndFifty_returnTrue(){
        NumbersEqual numbersEqual = new NumbersEqual();
        boolean returnTrue = numbersEqual.isEquals(50, 50);
        assertEquals(true, returnTrue);
    }
}
