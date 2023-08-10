package mediumarrays.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestSubArrayTest {

    private LongestSubArray longestSubArray;

    @BeforeEach
    public void setup(){
        longestSubArray = new LongestSubArray();
    }
    @Test
    public void nothing(){}

    @Test
    public void givenNull_returnZero(){
        int length = longestSubArray.findTheLongestSubArrayWithGivenSum(null, 0);
        assertEquals(0, length);
    }

    @Test
    public void givenEmpty_returnZero(){
        int length = longestSubArray.findTheLongestSubArrayWithGivenSum(new int[]{}, 0);
        assertEquals(0, length);
    }

    @Test
    public void given0_returnOne(){
        int length = longestSubArray.findTheLongestSubArrayWithGivenSum(new int[]{0}, 0);
        assertEquals(1, length);
    }

    @Test
    public void given1_returnOne(){
        int length = longestSubArray.findTheLongestSubArrayWithGivenSum(new int[]{1}, 1);
        assertEquals(1, length);
    }

    @Test
    public void given5_returnOne(){
        int length = longestSubArray.findTheLongestSubArrayWithGivenSum(new int[]{5}, 5);
        assertEquals(1, length);
    }

    @Test
    public void given01And5_returnZero(){
        int length = longestSubArray.findTheLongestSubArrayWithGivenSum(new int[]{0, 1}, 5);
        assertEquals(0, length);
    }

    @Test
    public void given01And1_return2(){
        int length = longestSubArray.findTheLongestSubArrayWithGivenSum(new int[]{0, 1}, 1);
        assertEquals(2, length);
    }
}
