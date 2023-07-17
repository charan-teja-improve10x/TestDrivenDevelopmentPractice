package missinngnumberinarray;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MissingNumberTest {

    private MissingNumber missingNumber;

    @BeforeEach
    public void setup(){
        missingNumber = new MissingNumber();
    }

    @Test
    public void nothing(){

    }

    @Test
    public void givenNumber_returnNumber(){
        int number = missingNumber.findTheMissingNumberInAnArray(new int[] {1, 2, 3, 4, 6, 7, 8, 9, 10});
        assertEquals(5, number);
    }

    @Test
    public void givenForgotTen_return10(){
        int number = missingNumber.findTheMissingNumberInAnArray(new int[] {1, 2, 3, 4, 6, 7, 8, 9, 5});
        assertEquals(10, number);
    }

    @Test
    public void givenForgotOne_return1(){
        int number = missingNumber.findTheMissingNumberInAnArray(new int[] {10, 2, 3, 4, 6, 7, 8, 9, 5});
        assertEquals(1, number);
    }

    @Test
    public void givenForgotEight_return8(){
        int number = missingNumber.findTheMissingNumberInAnArray(new int[] {10, 2, 3, 4, 6, 7, 1, 9, 5});
        assertEquals(8, number);
    }
}
