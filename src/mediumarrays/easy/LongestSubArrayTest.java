package mediumarrays.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestSubArrayTest {

    @Test
    public void nothing(){}

    @Test
    public void givenNull_returnZero(){
        LongestSubArray longestSubArray = new LongestSubArray();
        int length = longestSubArray.findTheLongestSubArrayWithGivenSum(null, 0);
        assertEquals(0, length);
    }

    @Test
    public void givenEmpty_returnZero(){
        LongestSubArray longestSubArray = new LongestSubArray();
        int length = longestSubArray.findTheLongestSubArrayWithGivenSum(new int[]{}, 0);
        assertEquals(0, length);
    }

    @Test
    public void given0_returnOne(){
        LongestSubArray longestSubArray = new LongestSubArray();
        int length = longestSubArray.findTheLongestSubArrayWithGivenSum(new int[]{0}, 0);
        assertEquals(1, length);
    }

    @Test
    public void given1_returnOne(){
        LongestSubArray longestSubArray = new LongestSubArray();
        int length = longestSubArray.findTheLongestSubArrayWithGivenSum(new int[]{1}, 1);
        assertEquals(1, length);
    }

    @Test
    public void given5_returnOne(){
        LongestSubArray longestSubArray = new LongestSubArray();
        int length = longestSubArray.findTheLongestSubArrayWithGivenSum(new int[]{5}, 5);
        assertEquals(1, length);
    }
}
