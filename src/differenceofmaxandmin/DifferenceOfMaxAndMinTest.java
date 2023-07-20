package differenceofmaxandmin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DifferenceOfMaxAndMinTest {

    @Test
    public void nothing(){}

    @Test
    public void givenEmptyArray_returnZero(){
        DifferenceOfMaxAndMin differenceOfMaxAndMin = new DifferenceOfMaxAndMin();
        int result = differenceOfMaxAndMin.difference(new int[]{});
        assertEquals(result, 0);
    }

    @Test
    public void givenOneElement_returnElement(){
        DifferenceOfMaxAndMin differenceOfMaxAndMin = new DifferenceOfMaxAndMin();
        int result = differenceOfMaxAndMin.difference(new int[]{1});
        assertEquals(result, 1);
    }

    @Test
    public void given01_return1(){
        DifferenceOfMaxAndMin differenceOfMaxAndMin = new DifferenceOfMaxAndMin();
        int result = differenceOfMaxAndMin.difference(new int[]{0, 1});
        assertEquals(result, 1);
    }

    @Test
    public void given0Minus1_return1(){
        DifferenceOfMaxAndMin differenceOfMaxAndMin = new DifferenceOfMaxAndMin();
        int result = differenceOfMaxAndMin.difference(new int[]{0, -1});
        assertEquals(result, 1);
    }

    @Test
    public void given11_return0(){
        DifferenceOfMaxAndMin differenceOfMaxAndMin = new DifferenceOfMaxAndMin();
        int result = differenceOfMaxAndMin.difference(new int[]{1, 1});
        assertEquals(result, 0);
    }

    @Test
    public void given12_return1(){
        DifferenceOfMaxAndMin differenceOfMaxAndMin = new DifferenceOfMaxAndMin();
        int result = differenceOfMaxAndMin.difference(new int[]{1, 2});
        assertEquals(result, 1);
    }

    @Test
    public void given123_return2(){
        DifferenceOfMaxAndMin differenceOfMaxAndMin = new DifferenceOfMaxAndMin();
        int result = differenceOfMaxAndMin.difference(new int[]{1, 2, 3});
        assertEquals(result, 2);
    }

    @Test
    public void given12311_return10(){
        DifferenceOfMaxAndMin differenceOfMaxAndMin = new DifferenceOfMaxAndMin();
        int result = differenceOfMaxAndMin.difference(new int[]{1, 2, 3, 11});
        assertEquals(result, 10);
    }

    @Test
    public void given1213143_return11(){
        DifferenceOfMaxAndMin differenceOfMaxAndMin = new DifferenceOfMaxAndMin();
        int result = differenceOfMaxAndMin.difference(new int[]{12, 13, 14, 3});
        assertEquals(result, 11);
    }

}
