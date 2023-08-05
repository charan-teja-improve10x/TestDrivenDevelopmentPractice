package secondlargetsnumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SecondLargestNumberTest {

    @Test
    public void nothing(){}

    @Test
    public void givenNull_returnMinusOne(){
        SecondLargestNumber secondLargestNumber = new SecondLargestNumber();
        int secondLargeNumber = secondLargestNumber.findTheSecondLargestNumber(null);
        assertEquals(-1, secondLargeNumber);
    }

    @Test
    public void givenEmpty_returnMinusOne(){
        SecondLargestNumber secondLargestNumber = new SecondLargestNumber();
        int secondLargeNumber = secondLargestNumber.findTheSecondLargestNumber(new int[]{});
        assertEquals(-1, secondLargeNumber);
    }

    @Test
    public void givenZero_returnMinusOne(){
        SecondLargestNumber secondLargestNumber = new SecondLargestNumber();
        int secondLargeNumber = secondLargestNumber.findTheSecondLargestNumber(new int[]{0});
        assertEquals(-1, secondLargeNumber);
    }

    @Test
    public void givenOneElement_returnMinusOne(){
        SecondLargestNumber secondLargestNumber = new SecondLargestNumber();
        int secondLargeNumber = secondLargestNumber.findTheSecondLargestNumber(new int[]{1});
        assertEquals(-1, secondLargeNumber);
    }

    @Test
    public void givenZeroOne_returnMinusOne(){
        SecondLargestNumber secondLargestNumber = new SecondLargestNumber();
        int secondLargeNumber = secondLargestNumber.findTheSecondLargestNumber(new int[]{0,1});
        assertEquals(0, secondLargeNumber);
    }
}
