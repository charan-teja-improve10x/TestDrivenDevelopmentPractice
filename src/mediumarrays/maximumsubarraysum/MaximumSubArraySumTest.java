package mediumarrays.maximumsubarraysum;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumSubArraySumTest {

    private MaximumSubArraySum maximumSubArraySum;

    @BeforeEach
    public void setup(){
        maximumSubArraySum = new MaximumSubArraySum();
    }

    @Test
    public void nothing(){}

    @Test
    public void givenNull_returnMinusOne(){
        int sum = maximumSubArraySum.maxSubArraysSum(null, 0);
        assertEquals(-1, sum);
    }

    @Test
    public void givenEmpty_returnMinusOne(){
        int sum = maximumSubArraySum.maxSubArraysSum(new int[]{}, 0);
        assertEquals(-1, sum);
    }

    @Test
    public void givenOneElement_returnOneElement(){
        int sum = maximumSubArraySum.maxSubArraysSum(new int[]{1}, 1);
        assertEquals(1, sum);
    }

    @Test
    public void givenOneAnd2_return3(){
        int sum = maximumSubArraySum.maxSubArraysSum(new int[]{1, 2}, 2);
        assertEquals(3, sum);
    }

    @Test
    public void givenSumRandom_return6(){
        int sum = maximumSubArraySum.maxSubArraysSum(new int[]{-2,1,-3,4,-1,2,1,-5,4}, 9);
        assertEquals(6, sum);
    }

    @Test
    public void givenSumRandom_return11(){
        int sum = maximumSubArraySum.maxSubArraysSum(new int[]{1, 2, 7, -4, 3, 2}, 6);
        assertEquals(11, sum);
    }

    @Test
    public void givenSumRandom_return(){
        int sum = maximumSubArraySum.maxSubArraysSum(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4, 1, 2, 7, -4, 3, 2}, 15);
        assertEquals(16, sum);
    }
}
