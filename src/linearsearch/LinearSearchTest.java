package linearsearch;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinearSearchTest {

    private LinearSearch linearSearch;

    @BeforeEach
    public void setup(){
        linearSearch = new LinearSearch();
    }

    @Test
    public void nothing(){}

    @Test
    public void givenNull_returnMinusOne(){
        int index = linearSearch.findTheIndex(null, 0, 0);
        assertEquals(-1, index);
    }

    @Test
    public void givenEmpty_returnMinusOne(){
        int index = linearSearch.findTheIndex(new int[]{}, 0, 0);
        assertEquals(-1, index);
    }

    @Test
    public void givenOneAndOne_returnMinusOne(){
        int index = linearSearch.findTheIndex(new int[]{1}, 1, 1);
        assertEquals(0, index);
    }

    @Test
    public void givenOne2And2_returnOne(){
        int index = linearSearch.findTheIndex(new int[]{1, 2}, 2, 2);
        assertEquals(1, index);
    }

    @Test
    public void givenOne2And22_returnMinusOne(){
        int index = linearSearch.findTheIndex(new int[]{1, 2}, 2, 22);
        assertEquals(-1, index);
    }

    @Test
    public void given123450678And0_return5(){
        int index = linearSearch.findTheIndex(new int[]{1, 2, 3, 4, 5, 0, 6, 7, 8}, 9, 0);
        assertEquals(5, index);
    }
}
