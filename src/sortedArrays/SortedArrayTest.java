package sortedArrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortedArrayTest {

    @Test
    public void nothing(){}

    @Test
    public void givenNull_returnFalse(){
        SortedArray sortedArray = new SortedArray();
        boolean result = sortedArray.sortingTheArray(null);
        assertEquals(false, result);
    }

    @Test
    public void givenEmpty_returnFalse(){
        SortedArray sortedArray = new SortedArray();
        boolean result = sortedArray.sortingTheArray(new int[]{});
        assertEquals(false, result);
    }

    @Test
    public void givenZero_returnTrue(){
        SortedArray sortedArray = new SortedArray();
        boolean result = sortedArray.sortingTheArray(new int[]{0});
        assertEquals(true, result);
    }

    @Test
    public void givenOne_returnTrue(){
        SortedArray sortedArray = new SortedArray();
        boolean result = sortedArray.sortingTheArray(new int[]{1});
        assertEquals(true, result);
    }


}
