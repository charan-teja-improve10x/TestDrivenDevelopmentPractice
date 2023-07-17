package divisiblebyfive;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DivisibleByFiveTest {

    private DivisibleByFive divisibleByFive;

    @BeforeEach
    public void setup() {
        divisibleByFive = new DivisibleByFive();
    }

    @Test
    public void nothing() {
    }

    @Test
    public void givenZero_returnTrue() {
        boolean returnTrue = divisibleByFive.isDivisible(0);
        assertEquals(true, returnTrue);
    }

    @Test
    public void givenMinusOne_returnsFalse() {
        boolean returnFalse = divisibleByFive.isDivisible(-1);
        assertEquals(false, returnFalse);
    }

    @Test
    public void givenOne_returnsFalse() {
        boolean returnFalse = divisibleByFive.isDivisible(1);
        assertEquals(false, returnFalse);
    }

    @Test
    public void givenTwo_returnsFalse() {
        boolean returnFalse = divisibleByFive.isDivisible(2);
        assertEquals(false, returnFalse);
    }

    @Test
    public void givenFive_returnsFalse() {
        boolean returnTrue = divisibleByFive.isDivisible(5);
        assertEquals(true, returnTrue);
    }

    @Test
    public void givenNine_returnsFalse() {
        boolean returnFalse = divisibleByFive.isDivisible(9);
        assertEquals(false, returnFalse);
    }

    @Test
    public void givenMinusFiftyFive_returnsTrue() {
        boolean returnTrue = divisibleByFive.isDivisible(-55);
        assertEquals(true, returnTrue);
    }
}
