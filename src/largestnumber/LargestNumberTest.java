package largestnumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LargestNumberTest {

    @Test
    public void nothing(){}


    @Test
    public void givenNull_returnZero(){
        LargestNumber largestNumber = new LargestNumber();
        int largeNumber = largestNumber.findTheLargeNUmber(null);
        assertEquals(0, largeNumber);
    }
    @Test
    public void givenEmpty_returnZero(){
        LargestNumber largestNumber = new LargestNumber();
        int largeNumber = largestNumber.findTheLargeNUmber(new int[]{});
        assertEquals(0, largeNumber);
    }

    @Test
    public void given0_returnZero(){
        LargestNumber largestNumber = new LargestNumber();
        int largeNumber = largestNumber.findTheLargeNUmber(new int[]{0});
        assertEquals(0, largeNumber);
    }

    @Test
    public void given1_return1(){
        LargestNumber largestNumber = new LargestNumber();
        int largeNumber = largestNumber.findTheLargeNUmber(new int[]{1});
        assertEquals(1, largeNumber);
    }

    @Test
    public void given12_return2(){
        LargestNumber largestNumber = new LargestNumber();
        int largeNumber = largestNumber.findTheLargeNUmber(new int[]{1, 2});
        assertEquals(2, largeNumber);
    }

    @Test
    public void given132_return2(){
        LargestNumber largestNumber = new LargestNumber();
        int largeNumber = largestNumber.findTheLargeNUmber(new int[]{1, 3, 2});
        assertEquals(3, largeNumber);
    }

    @Test
    public void given13245101_return10(){
        LargestNumber largestNumber = new LargestNumber();
        int largeNumber = largestNumber.findTheLargeNUmber(new int[]{1, 3, 2, 4, 5, 10, 1});
        assertEquals(10, largeNumber);
    }
}
