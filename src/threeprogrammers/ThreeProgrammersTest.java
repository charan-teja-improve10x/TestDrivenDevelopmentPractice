package threeprogrammers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ThreeProgrammersTest {

    private ThreeProgrammer threeProgrammer;

    @BeforeEach
    public void setup(){
        threeProgrammer = new ThreeProgrammer();
    }

    @Test
    public void nothing(){
    }

    @Test
    public void givenAllZeros_returnZero(){
        int difference = threeProgrammer.findTheDifference(0, 0, 0);
        assertEquals(0, difference);
    }

    @Test
    public void givenAnyNegativeNumber_returnZero(){
        int difference = threeProgrammer.findTheDifference(-1, 0, 0);
        assertEquals(-1, difference);
    }

    @Test
    public void givenZeroZeroOne_returnOne(){
        int difference = threeProgrammer.findTheDifference(0, 0, 1);
        assertEquals(0, difference);
    }

    @Test
    public void given129_returnOne(){
        int difference = threeProgrammer.findTheDifference(1, 2, 9);
        assertEquals(8, difference);
    }

    @Test
    public void given239_returnOne(){
        int difference = threeProgrammer.findTheDifference(2, 3, 9);
        assertEquals(7, difference);
    }
}
