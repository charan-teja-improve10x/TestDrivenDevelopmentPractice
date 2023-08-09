package mediumarrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortingZerosOnesTwosTest {

    private SortingZerosOnesTwos sortingZerosOnesTwos;

    @BeforeEach
    public void setup(){
        sortingZerosOnesTwos = new SortingZerosOnesTwos();
    }
    @Test
    public void nothing(){

    }

    @Test
    public void givenNull_returnEmpty(){
        int[] result = sortingZerosOnesTwos.sorting(null);
        assertArrayEquals(new int[]{}, result);
    }

    @Test
    public void givenEmpty_returnEmpty(){
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
        int[] result = sortingZerosOnesTwos.sorting(new int[]{1});
        assertArrayEquals(new int[]{1}, result);
    }

    @Test
    public void givenZeroOne_returnZeroOne(){
        int[] result = sortingZerosOnesTwos.sorting(new int[]{0, 1});
        assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    public void givenOneZero_returnZeroOne(){
        int[] result = sortingZerosOnesTwos.sorting(new int[]{1, 0});
        assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    public void givenOneZeroOneZero_return0011(){
        int[] result = sortingZerosOnesTwos.sorting(new int[]{1, 0, 1, 0});
        assertArrayEquals(new int[]{0, 0, 1, 1}, result);
    }

    @Test
    public void given00112201_return00011122(){
        int[] result = sortingZerosOnesTwos.sorting(new int[]{1, 0, 1, 0, 2, 2, 0, 1});
        assertArrayEquals(new int[]{0, 0, 0,1, 1, 1, 2, 2}, result);
    }
}
