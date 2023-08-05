package leftrotatearraybyone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class LeftRotateByOneTest {

    @Test
    public void nothing(){}

    @Test
    public void givenNull_returnEmpty(){
        LeftRotateByOne leftRotateByOne = new LeftRotateByOne();
        int[] rotatedArray = leftRotateByOne.leftRotateArrayByOne(null, 0);
        assertArrayEquals(new int[]{}, rotatedArray);
    }

    @Test
    public void givenEmpty_returnEmpty(){
        LeftRotateByOne leftRotateByOne = new LeftRotateByOne();
        int[] rotatedArray = leftRotateByOne.leftRotateArrayByOne(new int[]{}, 0);
        assertArrayEquals(new int[]{}, rotatedArray);
    }

    @Test
    public void givenOneElement_returnOne(){
        LeftRotateByOne leftRotateByOne = new LeftRotateByOne();
        int[] rotatedArray = leftRotateByOne.leftRotateArrayByOne(new int[]{1}, 1);
        assertArrayEquals(new int[]{1}, rotatedArray);
    }

    @Test
    public void givenMinusOne_returnMinusOne(){
        LeftRotateByOne leftRotateByOne = new LeftRotateByOne();
        int[] rotatedArray = leftRotateByOne.leftRotateArrayByOne(new int[]{-1}, 1);
        assertArrayEquals(new int[]{-1}, rotatedArray);
    }

    @Test
    public void givenMinusOneMinusTwo_returnMinusTwoOne(){
        LeftRotateByOne leftRotateByOne = new LeftRotateByOne();
        int[] rotatedArray = leftRotateByOne.leftRotateArrayByOne(new int[]{-1, -2}, 2);
        assertArrayEquals(new int[]{-2, -1}, rotatedArray);
    }

    @Test
    public void givenOneTwo_returnTwoOne(){
        LeftRotateByOne leftRotateByOne = new LeftRotateByOne();
        int[] rotatedArray = leftRotateByOne.leftRotateArrayByOne(new int[]{1, 2}, 2);
        assertArrayEquals(new int[]{2, 1}, rotatedArray);
    }

    @Test
    public void givenOneTwoOne_returnTwoOne(){
        LeftRotateByOne leftRotateByOne = new LeftRotateByOne();
        int[] rotatedArray = leftRotateByOne.leftRotateArrayByOne(new int[]{1, 2, 1}, 3);
        assertArrayEquals(new int[]{2, 1, 1}, rotatedArray);
    }
}
