package leftrotatearraybyone;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class LeftRotateByOneTest {

    private LeftRotateByOne leftRotateByOne;

    @BeforeEach
    public void setup(){
        leftRotateByOne = new LeftRotateByOne();
    }
    @Test
    public void nothing(){}

    @Test
    public void givenNull_returnEmpty(){
        int[] rotatedArray = leftRotateByOne.leftRotateArrayByOne(null, 0);
        assertArrayEquals(new int[]{}, rotatedArray);
    }

    @Test
    public void givenEmpty_returnEmpty(){
        int[] rotatedArray = leftRotateByOne.leftRotateArrayByOne(new int[]{}, 0);
        assertArrayEquals(new int[]{}, rotatedArray);
    }

    @Test
    public void givenOneElement_returnOne(){
        int[] rotatedArray = leftRotateByOne.leftRotateArrayByOne(new int[]{1}, 1);
        assertArrayEquals(new int[]{1}, rotatedArray);
    }

    @Test
    public void givenMinusOne_returnMinusOne(){
        int[] rotatedArray = leftRotateByOne.leftRotateArrayByOne(new int[]{-1}, 1);
        assertArrayEquals(new int[]{-1}, rotatedArray);
    }

    @Test
    public void givenMinusOneMinusTwo_returnMinusTwoOne(){
        int[] rotatedArray = leftRotateByOne.leftRotateArrayByOne(new int[]{-1, -2}, 2);
        assertArrayEquals(new int[]{-2, -1}, rotatedArray);
    }

    @Test
    public void givenOneTwo_returnTwoOne(){
        int[] rotatedArray = leftRotateByOne.leftRotateArrayByOne(new int[]{1, 2}, 2);
        assertArrayEquals(new int[]{2, 1}, rotatedArray);
    }

    @Test
    public void givenOneTwoOne_returnTwoOne(){
        int[] rotatedArray = leftRotateByOne.leftRotateArrayByOne(new int[]{1, 2, 1}, 3);
        assertArrayEquals(new int[]{2, 1, 1}, rotatedArray);
    }
}
