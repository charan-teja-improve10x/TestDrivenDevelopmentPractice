package mediumarrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountSubArraysTest {

    @Test
    public void nothing(){}

    private CountSubArrays countSubArrays;

    @BeforeEach
    public void setup(){
        countSubArrays = new CountSubArrays();
    }

    @Test
    public void givenNull_returnMinusOne(){
        int count = countSubArrays.findTheSubArraysWithGivenSum(null, 0);
        assertEquals(-1, count);
    }

    @Test
    public void givenEmpty_returnMinusOne(){
        int count = countSubArrays.findTheSubArraysWithGivenSum(new int[]{}, 0);
        assertEquals(-1, count);
    }

    @Test
    public void givenOneAndOne_returnOne(){
        int count = countSubArrays.findTheSubArraysWithGivenSum(new int[]{1}, 1);
        assertEquals(1, count);
    }

    @Test
    public void given012AndThree_returnTwo(){
        int count = countSubArrays.findTheSubArraysWithGivenSum(new int[]{0, 1, 2}, 3);
        assertEquals(2, count);
    }

    @Test
    public void given0123AndThree_returnTwo(){
        int count = countSubArrays.findTheSubArraysWithGivenSum(new int[]{1, 2, 3}, 3);
        assertEquals(2, count);
    }

    @Test
    public void given3124_return2(){
        int count = countSubArrays.findTheSubArraysWithGivenSum(new int[]{3, 1, 2, 4}, 6);
        assertEquals(2, count);
    }

    @Test
    public void given12_return1(){
        int count = countSubArrays.findTheSubArraysWithGivenSum(new int[]{1, 2}, 3);
        assertEquals(1, count);
    }
}
