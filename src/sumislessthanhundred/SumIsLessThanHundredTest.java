package sumislessthanhundred;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumIsLessThanHundredTest {

    @Test
    public void nothing(){}

    @Test
    public void givenNegative_returnFalse(){
        SumOfTwoLessThanHundred sum = new  SumOfTwoLessThanHundred();
        boolean negativeResult = sum.sumIsLessThanHundred(-1, -1);
        assertEquals(false, negativeResult);
    }

    @Test
    public void givenZero_returnFalse(){
        SumOfTwoLessThanHundred sum = new  SumOfTwoLessThanHundred();
        boolean negativeResult = sum.sumIsLessThanHundred(0, 0);
        assertEquals(false, negativeResult);
    }

    @Test
    public void givenTwoAndSixty_returnFalse(){
        SumOfTwoLessThanHundred sum = new  SumOfTwoLessThanHundred();
        boolean negativeResult = sum.sumIsLessThanHundred(2, 60);
        assertEquals(false, negativeResult);
    }

    @Test
    public void givenFiftyFifty_returnTrue(){
        SumOfTwoLessThanHundred sum = new  SumOfTwoLessThanHundred();
        boolean negativeResult = sum.sumIsLessThanHundred(50, 50);
        assertEquals(true, negativeResult);
    }

    @Test
    public void givenSixtyForty_returnTrue(){
        SumOfTwoLessThanHundred sum = new  SumOfTwoLessThanHundred();
        boolean negativeResult = sum.sumIsLessThanHundred(60, 40);
        assertEquals(true, negativeResult);
    }
}
