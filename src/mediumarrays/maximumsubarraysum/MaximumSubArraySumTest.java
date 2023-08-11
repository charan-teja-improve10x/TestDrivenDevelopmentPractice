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
}
