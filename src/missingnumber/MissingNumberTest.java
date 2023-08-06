package missingnumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MissingNumberTest {

    @Test
    public void nothing(){}

    @Test
    public void givenNull_return0(){
        MissingNumberArray missingNumberArray = new MissingNumberArray();
        int missedNumber = missingNumberArray.findTheMissingNumber(null, 0);
        assertEquals(0, missedNumber);
    }

    @Test
    public void givenEmpty_return0(){
        MissingNumberArray missingNumberArray = new MissingNumberArray();
        int missedNumber = missingNumberArray.findTheMissingNumber(new int[]{}, 0);
        assertEquals(0, missedNumber);
    }

    @Test
    public void givenOneElement_returnElement(){
        MissingNumberArray missingNumberArray = new MissingNumberArray();
        int missedNumber = missingNumberArray.findTheMissingNumber(new int[]{1}, 1);
        assertEquals(1, missedNumber);
    }

    @Test
    public void given4_return4(){
        MissingNumberArray missingNumberArray = new MissingNumberArray();
        int missedNumber = missingNumberArray.findTheMissingNumber(new int[]{4}, 1);
        assertEquals(4, missedNumber);
    }

    @Test
    public void given13_return2(){
        MissingNumberArray missingNumberArray = new MissingNumberArray();
        int missedNumber = missingNumberArray.findTheMissingNumber(new int[]{1, 3}, 2);
        assertEquals(2, missedNumber);
    }

    @Test
    public void given1235_return4(){
        MissingNumberArray missingNumberArray = new MissingNumberArray();
        int missedNumber = missingNumberArray.findTheMissingNumber(new int[]{1, 2,  3, 5}, 4);
        assertEquals(4, missedNumber);
    }

    @Test
    public void given1234567810_return2(){
        MissingNumberArray missingNumberArray = new MissingNumberArray();
        int missedNumber = missingNumberArray.findTheMissingNumber(new int[]{1, 2,  3, 4, 5, 6, 7, 9, 10}, 9);
        assertEquals(8, missedNumber);
    }
}
