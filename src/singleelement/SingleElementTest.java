package singleelement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SingleElementTest {

    @Test
    public void nothing(){}

    @Test
    public void givenNothing_returnMinusOne(){
        SingleElement singleElement = new SingleElement();
        int singlesCount = singleElement.getSingleElementCount(null);
        assertEquals(-1, singlesCount);
    }

    @Test
    public void givenEmpty_returnMinusOne(){
        SingleElement singleElement = new SingleElement();
        int singlesCount = singleElement.getSingleElementCount(new int[]{});
        assertEquals(-1, singlesCount);
    }

    @Test
    public void givenOneElement_returnOneElement(){
        SingleElement singleElement = new SingleElement();
        int singlesCount = singleElement.getSingleElementCount(new int[]{0});
        assertEquals(0, singlesCount);
    }
}
