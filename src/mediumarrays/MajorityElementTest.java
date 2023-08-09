package mediumarrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MajorityElementTest {

    private MajorityElement majorityElement;

    @BeforeEach
    public void setup(){
        majorityElement = new MajorityElement();
    }

    @Test
    public void nothing(){}

    @Test
    public void givenNull_returnMinusOne(){
        int element = majorityElement.getMajorityElement(null);
        assertEquals(-1, element);
    }

    @Test
    public void givenEmpty_returnMinusOne(){
        int element = majorityElement.getMajorityElement(new int[]{});
        assertEquals(-1, element);
    }

    @Test
    public void givenZero_returnZero(){
        int element = majorityElement.getMajorityElement(new int[]{0});
        assertEquals(0, element);
    }

    @Test
    public void givenOne_returnOne(){
        int element = majorityElement.getMajorityElement(new int[]{1});
        assertEquals(1, element);
    }

    @Test
    public void givenZeroOne_returnMinusOne(){
        int element = majorityElement.getMajorityElement(new int[]{0, 1});
        assertEquals(-1, element);
    }

    @Test
    public void givenZeroOneOne_returnOne(){
        int element = majorityElement.getMajorityElement(new int[]{0, 1, 1});
        assertEquals(1, element);
    }

    @Test
    public void givenZeroOneOneZero_returnMinusOne(){
        int element = majorityElement.getMajorityElement(new int[]{0, 1, 1, 0});
        assertEquals(-1, element);
    }

    @Test
    public void given44333_return3(){
        int element = majorityElement.getMajorityElement(new int[]{4, 4, 3, 3, 3});
        assertEquals(3, element);
    }

    @Test
    public void given0011122_return3(){
        int element = majorityElement.getMajorityElement(new int[]{0, 0, 1, 1, 1, 2, 2});
        assertEquals(-1, element);
    }
}
