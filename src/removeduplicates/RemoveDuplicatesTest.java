package removeduplicates;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveDuplicatesTest {

    @Test
    public void nothing(){}

    @Test
    public void givenNull_returnZero(){
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        int length = removeDuplicates.removeDuplicatesAndReturnTheLength(null, 0);
        assertEquals(0, length);
    }

    @Test
    public void givenEmpty_returnZero(){
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        int length = removeDuplicates.removeDuplicatesAndReturnTheLength(new int[]{}, 0);
        assertEquals(0, length);
    }

    @Test
    public void givenOneElement_returnOne(){
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        int length = removeDuplicates.removeDuplicatesAndReturnTheLength(new int[]{0}, 1);
        assertEquals(1, length);
    }

    @Test
    public void givenNegativeValues_returnOne(){
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        int length = removeDuplicates.removeDuplicatesAndReturnTheLength(new int[]{-1, -1, -2, -2}, 4);
        assertEquals(2, length);
    }

    @Test
    public void givenOneTwo_returnTwo(){
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        int length = removeDuplicates.removeDuplicatesAndReturnTheLength(new int[]{1, 2}, 2);
        assertEquals(2, length);
    }

    @Test
    public void givenTwoOnes_returnOne(){
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        int length = removeDuplicates.removeDuplicatesAndReturnTheLength(new int[]{1, 1}, 2);
        assertEquals(1, length);
    }

    @Test
    public void given1122333_returnOne(){
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        int length = removeDuplicates.removeDuplicatesAndReturnTheLength(new int[]{1, 1, 2, 2, 3, 3, 3}, 7);
        assertEquals(3, length);
    }

    @Test
    public void given112233345_returnOne(){
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        int length = removeDuplicates.removeDuplicatesAndReturnTheLength(new int[]{1, 1, 2, 2, 3, 3, 3, 4, 5, 5}, 10);
        assertEquals(5, length);
    }
}
