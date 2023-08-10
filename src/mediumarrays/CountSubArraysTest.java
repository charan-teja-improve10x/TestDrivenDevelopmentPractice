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
}
