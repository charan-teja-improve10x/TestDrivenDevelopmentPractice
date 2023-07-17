package integerinrange;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntegerInRangeTest {

    private IntegerInRange integerInRange;

    @BeforeEach
    public void setup() {
        integerInRange = new IntegerInRange();
    }

    @Test
    public void nothing() {
    }

    @Test
    public void givenAllZeros_returnFalse() {
        boolean returnFalse = integerInRange.findIntegerRange(0, 0, 0);
        assertEquals(false, returnFalse);
    }

    @Test
    public void givenNegative_returnFalse() {
        boolean returnTrue = integerInRange.findIntegerRange(0, -1, 1);
        assertEquals(true, returnTrue);
    }

    @Test
    public void givenThreeZeroFour_returnTrue() {
        boolean returnTrue = integerInRange.findIntegerRange(3, 0, 4);
        assertEquals(true, returnTrue);
    }

    @Test
    public void givenThreeZeroZero_returnFalse() {
        boolean returnFalse = integerInRange.findIntegerRange(3, 0, 0);
        assertEquals(false, returnFalse);
    }

    @Test
    public void givenThreeZeroThree_returnFalse() {
        boolean returnFalse = integerInRange.findIntegerRange(3, 0, 3);
        assertEquals(false, returnFalse);
    }

    @Test
    public void givenThreeZeroZero_returnTrue() {
        boolean returnFalse = integerInRange.findIntegerRange(3, 10, 10);
        assertEquals(false, returnFalse);
    }
}
