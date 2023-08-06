package linearsearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinearSearchTest {

    @Test
    public void nothing(){}

    @Test
    public void givenNull_returnMinusOne(){
        LinearSearch linearSearch = new LinearSearch();
        int index = linearSearch.findTheIndex(null, 0, 0);
        assertEquals(-1, index);
    }

    @Test
    public void givenEmpty_returnMinusOne(){
        LinearSearch linearSearch = new LinearSearch();
        int index = linearSearch.findTheIndex(new int[]{}, 0, 0);
        assertEquals(-1, index);
    }

    @Test
    public void givenOneAndOne_returnMinusOne(){
        LinearSearch linearSearch = new LinearSearch();
        int index = linearSearch.findTheIndex(new int[]{1}, 1, 1);
        assertEquals(0, index);
    }

    @Test
    public void givenOne2And2_returnOne(){
        LinearSearch linearSearch = new LinearSearch();
        int index = linearSearch.findTheIndex(new int[]{1, 2}, 2, 2);
        assertEquals(1, index);
    }

    @Test
    public void givenOne2And22_returnMinusOne(){
        LinearSearch linearSearch = new LinearSearch();
        int index = linearSearch.findTheIndex(new int[]{1, 2}, 2, 22);
        assertEquals(-1, index);
    }
}
