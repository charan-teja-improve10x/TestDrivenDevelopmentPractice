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
}
