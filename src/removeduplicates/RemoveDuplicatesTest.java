package removeduplicates;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveDuplicatesTest {

    @Test
    public void nothing(){}

    @Test
    public void givenNull_returnZero(){
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        int length = removeDuplicates.removeDuplicatesAndReturnTheLength(null);
        assertEquals(0, length);
    }

    @Test
    public void givenEmpty_returnZero(){
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        int length = removeDuplicates.removeDuplicatesAndReturnTheLength(new int[]{});
        assertEquals(0, length);
    }

    @Test
    public void givenOneElement_returnOne(){
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        int length = removeDuplicates.removeDuplicatesAndReturnTheLength(new int[]{0});
        assertEquals(1, length);
    }

    @Disabled
    @Test
    public void givenOneTwo_returnTwo(){
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        int length = removeDuplicates.removeDuplicatesAndReturnTheLength(new int[]{1, 2});
        assertEquals(2, length);
    }

    @Test
    public void givenTwoOnes_returnOne(){
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        int length = removeDuplicates.removeDuplicatesAndReturnTheLength(new int[]{1, 1});
        assertEquals(1, length);
    }
}
