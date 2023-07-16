package sumislessthanhundred;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumIsLessThanHundredTest {

    private SumOfTwoLessThanHundred sum;

    @BeforeEach
    public void setup(){
        sum = new SumOfTwoLessThanHundred();
    }

    @Test
    public void nothing(){}

    @Test
    public void givenNegative_returnFalse(){
        boolean negativeResult = sum.sumIsLessThanHundred(-1, -1);
        assertEquals(false, negativeResult);
    }

    @Test
    public void givenZero_returnFalse(){
        boolean negativeResult = sum.sumIsLessThanHundred(0, 0);
        assertEquals(false, negativeResult);
    }

    @Test
    public void givenTwoAndSixty_returnFalse(){
        boolean negativeResult = sum.sumIsLessThanHundred(2, 60);
        assertEquals(false, negativeResult);
    }

    @Test
    public void givenFiftyFifty_returnTrue(){
        boolean negativeResult = sum.sumIsLessThanHundred(50, 50);
        assertEquals(true, negativeResult);
    }

    @Test
    public void givenSixtyForty_returnTrue(){
        boolean negativeResult = sum.sumIsLessThanHundred(60, 40);
        assertEquals(true, negativeResult);
    }
}
