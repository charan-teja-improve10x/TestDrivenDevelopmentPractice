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
}
