package mediumarrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountSubArraysTest {

    @Test
    public void nothing(){}

    @Test
    public void givenNull_returnMinusOne(){
        CountSubArrays countSubArrays = new CountSubArrays();
        int count = countSubArrays.findTheSubArraysWithGivenSum(null, 0);
        assertEquals(-1, count);
    }

    @Test
    public void givenEmpty_returnMinusOne(){
        CountSubArrays countSubArrays = new CountSubArrays();
        int count = countSubArrays.findTheSubArraysWithGivenSum(new int[]{}, 0);
        assertEquals(-1, count);
    }

    @Test
    public void givenOneAndOne_returnOne(){
        CountSubArrays countSubArrays = new CountSubArrays();
        int count = countSubArrays.findTheSubArraysWithGivenSum(new int[]{1}, 1);
        assertEquals(1, count);
    }
}
