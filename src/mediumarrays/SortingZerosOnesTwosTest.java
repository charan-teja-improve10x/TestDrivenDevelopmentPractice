package mediumarrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortingZerosOnesTwosTest {

    @Test
    public void nothing(){

    }

    @Test
    public void givenNull_returnEmpty(){
        SortingZerosOnesTwos sortingZerosOnesTwos = new SortingZerosOnesTwos();
        int[] result = sortingZerosOnesTwos.sorting(null);
        assertArrayEquals(new int[]{}, result);
    }

    @Test
    public void givenEmpty_returnEmpty(){
        SortingZerosOnesTwos sortingZerosOnesTwos = new SortingZerosOnesTwos();
        int[] result = sortingZerosOnesTwos.sorting(new int[]{});
        assertArrayEquals(new int[]{}, result);
    }

    @Test
    public void givenZero_returnZero(){
        SortingZerosOnesTwos sortingZerosOnesTwos = new SortingZerosOnesTwos();
        int[] result = sortingZerosOnesTwos.sorting(new int[]{0});
        assertArrayEquals(new int[]{0}, result);
    }

    @Test
    public void givenOne_returnOne(){
        SortingZerosOnesTwos sortingZerosOnesTwos = new SortingZerosOnesTwos();
        int[] result = sortingZerosOnesTwos.sorting(new int[]{1});
        assertArrayEquals(new int[]{1}, result);
    }

    @Test
    public void givenZeroOne_returnZeroOne(){
        SortingZerosOnesTwos sortingZerosOnesTwos = new SortingZerosOnesTwos();
        int[] result = sortingZerosOnesTwos.sorting(new int[]{0, 1});
        assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    public void givenOneZero_returnZeroOne(){
        SortingZerosOnesTwos sortingZerosOnesTwos = new SortingZerosOnesTwos();
        int[] result = sortingZerosOnesTwos.sorting(new int[]{1, 0});
        assertArrayEquals(new int[]{0, 1}, result);
    }


}
