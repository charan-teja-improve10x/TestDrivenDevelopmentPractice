package numbersequal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumbersEqualTest {

    private NumbersEqual numbersEqual;

    @BeforeEach
    public void setup() {
        numbersEqual = new NumbersEqual();
    }

    @Test
    public void nothing() {
    }

    @Test
    public void givenTwoSameNegativeNumbers_returnTrue() {
        boolean returnTrue = numbersEqual.isEquals(-1, -1);
        assertEquals(true, returnTrue);
    }

    @Test
    public void givenTwoZeros_returnTrue() {
        boolean returnTrue = numbersEqual.isEquals(0, 0);
        assertEquals(true, returnTrue);
    }

    @Test
    public void givenZeroAndOne_returnFalse() {
        boolean returnFalse = numbersEqual.isEquals(0, 1);
        assertEquals(false, returnFalse);
    }

    @Test
    public void givenFiftyAndFifty_returnTrue() {
        boolean returnTrue = numbersEqual.isEquals(50, 50);
        assertEquals(true, returnTrue);
    }

    @Test
    public void given99AndMinus99_returnFalse() {
        boolean returnFalse = numbersEqual.isEquals(99, -99);
        assertEquals(false, returnFalse);
    }
}
