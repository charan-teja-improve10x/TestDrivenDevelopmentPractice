package mediumarrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MajorityElementTest {

    @Test
    public void nothing(){}

    @Test
    public void givenNull_returnMinusOne(){
        MajorityElement majorityElement = new MajorityElement();
        int element = majorityElement.getMajorityElement(null);
        assertEquals(-1, element);
    }

    @Test
    public void givenEmpty_returnMinusOne(){
        MajorityElement majorityElement = new MajorityElement();
        int element = majorityElement.getMajorityElement(new int[]{});
        assertEquals(-1, element);
    }

    @Test
    public void givenOne_returnOne(){
        MajorityElement majorityElement = new MajorityElement();
        int element = majorityElement.getMajorityElement(new int[]{0});
        assertEquals(0, element);
    }
}
