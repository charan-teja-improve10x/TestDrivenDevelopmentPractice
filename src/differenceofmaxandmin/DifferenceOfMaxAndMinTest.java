package differenceofmaxandmin;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DifferenceOfMaxAndMinTest {

    private DifferenceOfMaxAndMin differenceOfMaxAndMin;

    @BeforeEach
    public void setup() {
        differenceOfMaxAndMin = new DifferenceOfMaxAndMin();
    }

    @Test
    public void nothing() {
    }

    @Test
    public void givenEmptyArray_returnZero() {
        int result = differenceOfMaxAndMin.difference(new int[]{});
        assertEquals(result, 0);
    }

    @Test
    public void givenOneElement_returnElement() {
        int result = differenceOfMaxAndMin.difference(new int[]{1});
        assertEquals(result, 1);
    }

    @Test
    public void given01_return1() {
        int result = differenceOfMaxAndMin.difference(new int[]{0, 1});
        assertEquals(result, 1);
    }

    @Test
    public void given0Minus1_return1() {
        int result = differenceOfMaxAndMin.difference(new int[]{0, -1});
        assertEquals(result, 1);
    }

    @Test
    public void given11_return0() {
        int result = differenceOfMaxAndMin.difference(new int[]{1, 1});
        assertEquals(result, 0);
    }

    @Test
    public void given12_return1() {
        int result = differenceOfMaxAndMin.difference(new int[]{1, 2});
        assertEquals(result, 1);
    }

    @Test
    public void given123_return2() {
        int result = differenceOfMaxAndMin.difference(new int[]{1, 2, 3});
        assertEquals(result, 2);
    }

    @Test
    public void given12311_return10() {
        int result = differenceOfMaxAndMin.difference(new int[]{1, 2, 3, 11});
        assertEquals(result, 10);
    }

    @Test
    public void given1213143_return11() {
        int result = differenceOfMaxAndMin.difference(new int[]{12, 13, 14, 3});
        assertEquals(result, 11);
    }

}
