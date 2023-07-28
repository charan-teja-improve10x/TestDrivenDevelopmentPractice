package emptysquareseqence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EmptySquareSequenceTest {

    @Test
    public void nothing(){}

    @Test
    public void givenZero_ThrowsInvalidInputException(){
        EmptySquareSequence emptySquareSequence = new EmptySquareSequence();
        assertThrows(EmptySquareSequence.InvalidInputException.class, () -> emptySquareSequence.emptySq(0), "Number should be graterThan 0");
    }

    @Test
    public void givenMinusOne_ThrowsInvalidInputException(){
        EmptySquareSequence emptySquareSequence = new EmptySquareSequence();
        assertThrows(EmptySquareSequence.InvalidInputException.class, () -> emptySquareSequence.emptySq(-1), "Number should be graterThan 0");
    }

    @Test
    public void givenOne_returnZero(){
        EmptySquareSequence emptySquareSequence = new EmptySquareSequence();
        int result = emptySquareSequence.emptySq(1);
        assertEquals(0, result);
    }

    @Test
    public void givenTwo_returnEight(){
        EmptySquareSequence emptySquareSequence = new EmptySquareSequence();
        int result = emptySquareSequence.emptySq(2);
        assertEquals(8, result);
    }

    @Test
    public void givenThree_return24(){
        EmptySquareSequence emptySquareSequence = new EmptySquareSequence();
        int result = emptySquareSequence.emptySq(3);
        assertEquals(24, result);
    }

    @Test
    public void givenFour_return48(){
        EmptySquareSequence emptySquareSequence = new EmptySquareSequence();
        int result = emptySquareSequence.emptySq(4);
        assertEquals(48, result);
    }

    @Test
    public void givenFive_return80(){
        EmptySquareSequence emptySquareSequence = new EmptySquareSequence();
        int result = emptySquareSequence.emptySq(5);
        assertEquals(80, result);
    }

    @Test
    public void givenTen_return360(){
        EmptySquareSequence emptySquareSequence = new EmptySquareSequence();
        int result = emptySquareSequence.emptySq(10);
        assertEquals(360, result);
    }
}
