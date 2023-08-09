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
}
