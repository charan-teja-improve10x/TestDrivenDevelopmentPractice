package minutesintoseconds;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinutesIntoSecondsTest {

    private MinutesIntoSeconds minutesIntoSeconds;

    @BeforeEach
    public void setup() {
        minutesIntoSeconds = new MinutesIntoSeconds();
    }

    @Test
    public void nothing() {
    }

    @Test
    public void givenZero_returnZero() {
        long returnZero = minutesIntoSeconds.convert(0);
        assertEquals(0, returnZero);
    }

    @Test
    public void givenMinusOne_returnMinusOne() {
        long returnZero = minutesIntoSeconds.convert(-1);
        assertEquals(-1, returnZero);
    }

    @Test
    public void givenOne_return60() {
        long return60 = minutesIntoSeconds.convert(1);
        assertEquals(60, return60);
    }

    @Test
    public void given60_return3600() {
        long return3600 = minutesIntoSeconds.convert(60);
        assertEquals(3600, return3600);
    }

    @Test
    public void givenMinus60_returnMinus3600() {
        long returnMinus3600 = minutesIntoSeconds.convert(-60);
        assertEquals(-1, returnMinus3600);
    }
}
