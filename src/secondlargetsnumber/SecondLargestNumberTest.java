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
    public void givenZeroOne_returnZero(){
        SecondLargestNumber secondLargestNumber = new SecondLargestNumber();
        int secondLargeNumber = secondLargestNumber.findTheSecondLargestNumber(new int[]{0,1});
        assertEquals(0, secondLargeNumber);
    }

    @Test
    public void givenOneTwo_returnOne(){
        SecondLargestNumber secondLargestNumber = new SecondLargestNumber();
        int secondLargeNumber = secondLargestNumber.findTheSecondLargestNumber(new int[]{1, 2});
        assertEquals(1, secondLargeNumber);
    }

    @Test
    public void givenOneTwoThree_returnTwo(){
        SecondLargestNumber secondLargestNumber = new SecondLargestNumber();
        int secondLargeNumber = secondLargestNumber.findTheSecondLargestNumber(new int[]{1, 2, 3});
        assertEquals(2, secondLargeNumber);
    }

    @Test
    public void given13425_returnTwo(){
        SecondLargestNumber secondLargestNumber = new SecondLargestNumber();
        int secondLargeNumber = secondLargestNumber.findTheSecondLargestNumber(new int[]{1, 3, 4, 2, 5});
        assertEquals(4, secondLargeNumber);
    }

    @Test
    public void given134255_returnTwo(){
        SecondLargestNumber secondLargestNumber = new SecondLargestNumber();
        int secondLargeNumber = secondLargestNumber.findTheSecondLargestNumber(new int[]{5, 5});
        assertEquals(0, secondLargeNumber);
    }
}
