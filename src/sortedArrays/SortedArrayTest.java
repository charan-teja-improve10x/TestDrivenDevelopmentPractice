package sortedArrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortedArrayTest {

    private SortedArray sortedArray;

    @BeforeEach
    public void setup() {
        sortedArray = new SortedArray();

    }

    @Test
    public void nothing() {
    }

    @Test
    public void givenNull_returnFalse() {
        boolean result = sortedArray.sortingTheArray(null);
        assertEquals(false, result);
    }

    @Test
    public void givenEmpty_returnFalse() {
        boolean result = sortedArray.sortingTheArray(new int[]{});
        assertEquals(false, result);
    }

    @Test
    public void givenZero_returnTrue() {
        boolean result = sortedArray.sortingTheArray(new int[]{0});
        assertEquals(true, result);
    }

    @Test
    public void givenOne_returnTrue() {
        boolean result = sortedArray.sortingTheArray(new int[]{1});
        assertEquals(true, result);
    }

    @Test
    public void givenOneTwo_returnTrue() {
        boolean result = sortedArray.sortingTheArray(new int[]{1, 2});
        assertEquals(true, result);
    }

    @Test
    public void givenTwoOne_returnTrue() {
        boolean result = sortedArray.sortingTheArray(new int[]{2, 1});
        assertEquals(false, result);
    }

    @Test
    public void givenTwoOneThree_returnFalse() {
        boolean result = sortedArray.sortingTheArray(new int[]{2, 1, 3});
        assertEquals(false, result);
    }

    @Test
    public void givenNumbersInAscendingOrder_returnFalse() {
        boolean result = sortedArray.sortingTheArray(new int[]{1, 2, 3, 4, 10});
        assertEquals(true, result);
    }
}
