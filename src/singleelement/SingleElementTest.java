package singleelement;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SingleElementTest {

    private SingleElement singleElement;

    @BeforeEach
    public void setup(){
        singleElement = new SingleElement();
    }

    @Test
    public void nothing(){}

    @Test
    public void givenNothing_returnMinusOne(){
        int singlesCount = singleElement.getSingleElementCount(null);
        assertEquals(-1, singlesCount);
    }

    @Test
    public void givenEmpty_returnMinusOne(){
        int singlesCount = singleElement.getSingleElementCount(new int[]{});
        assertEquals(-1, singlesCount);
    }

    @Test
    public void givenOneElement_returnOneElement(){
        int singlesCount = singleElement.getSingleElementCount(new int[]{0});
        assertEquals(0, singlesCount);
    }

    @Test
    public void givenOneOne_returnOne(){
        int singlesCount = singleElement.getSingleElementCount(new int[]{1});
        assertEquals(1, singlesCount);
    }

    @Test
    public void givenOneOne_returnMinusOne(){
        int singlesCount = singleElement.getSingleElementCount(new int[]{1, 1});
        assertEquals(-1, singlesCount);
    }

    @Test
    public void givenOneOne2_returnMinusOne(){
        int singlesCount = singleElement.getSingleElementCount(new int[]{1, 1, 2});
        assertEquals(2, singlesCount);
    }

    @Test
    public void givenOne2_returnMinusOne(){
        int singlesCount = singleElement.getSingleElementCount(new int[]{1, 2, 2});
        assertEquals(1, singlesCount);
    }

    @Test
    public void given1122336446557_returnMinusOne(){
        int singlesCount = singleElement.getSingleElementCount(new int[]{1, 1, 2, 2, 3, 3, 6, 4, 4, 5, 5, 6, 7});
        assertEquals(7, singlesCount);
    }

    @Test
    public void givenAllNumbersPairs_returnMinusOne(){
        int singlesCount = singleElement.getSingleElementCount(new int[]{1, 1, 2, 2, 3, 3, 6, 4, 4, 5, 5, 6, 7, 7});
        assertEquals(-1, singlesCount);
    }
}
