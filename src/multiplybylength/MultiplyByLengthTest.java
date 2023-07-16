package multiplybylength;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class MultiplyByLengthTest {

    @Test
    public void nothing(){}

    @Test
    public void givenZero_returnZero(){
        MultiplyByLength multiplyByLength = new MultiplyByLength();
        int[] returnArray = multiplyByLength.multipleTheElementsWithLength(new int[] {0});
        assertArrayEquals(new int[] {0}, returnArray);
    }

    @Test
    public void givenOneTwoThree_return369(){
        MultiplyByLength multiplyByLength = new MultiplyByLength();
        int[] returnArray = multiplyByLength.multipleTheElementsWithLength(new int[] {1, 2, 3});
        assertArrayEquals(new int[] {3, 6, 9}, returnArray);
    }

    @Test
    public void given3912_return369(){
        MultiplyByLength multiplyByLength = new MultiplyByLength();
        int[] returnArray = multiplyByLength.multipleTheElementsWithLength(new int[] {3, 9, 12});
        assertArrayEquals(new int[] {9, 27, 36}, returnArray);
    }

    @Test
    public void given391223_return369(){
        MultiplyByLength multiplyByLength = new MultiplyByLength();
        int[] returnArray = multiplyByLength.multipleTheElementsWithLength(new int[] {3, 9, 12, 23});
        assertArrayEquals(new int[] {12, 36, 48, 92}, returnArray);
    }

    @Test
    public void givenMinusOneTwoMinus11And23_return369(){
        MultiplyByLength multiplyByLength = new MultiplyByLength();
        int[] returnArray = multiplyByLength.multipleTheElementsWithLength(new int[] {-1, 2, -11, 23});
        assertArrayEquals(new int[] {-4, 8, -44, 92}, returnArray);
    }

    @Test
    public void givenAllZeros_returnAll(){
        MultiplyByLength multiplyByLength = new MultiplyByLength();
        int[] returnArray = multiplyByLength.multipleTheElementsWithLength(new int[] {0, 0, 0, 0});
        assertArrayEquals(new int[] {0, 0, 0, 0}, returnArray);
    }
}
