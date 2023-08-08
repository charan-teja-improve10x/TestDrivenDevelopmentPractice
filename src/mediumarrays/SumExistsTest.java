package mediumarrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumExistsTest {

    private SumExists sumExists;

    @BeforeEach
    public void setup(){
        sumExists = new SumExists();
    }

    @Test
    public void nothing(){}

    @Test
    public void givenNull_returnNo(){
        String result = sumExists.sumOfTwo(null, 0);
        assertEquals("No", result);
    }

    @Test
    public void givenEmpty_returnNo(){
        String result = sumExists.sumOfTwo(new int[]{}, 0);
        assertEquals("No", result);
    }

    @Test
    public void givenOneElement_returnNo(){
        String result = sumExists.sumOfTwo(new int[]{0}, 0);
        assertEquals("No", result);
    }

    @Test
    public void givenZeroOne_returnYes(){
        String result = sumExists.sumOfTwo(new int[]{0, 1}, 1);
        assertEquals("Yes", result);
    }

    @Test
    public void givenOneOne_returnYes(){
        String result = sumExists.sumOfTwo(new int[]{1, 1}, 2);
        assertEquals("Yes", result);
    }

    @Test
    public void givenNegative_returnYes(){
        String result = sumExists.sumOfTwo(new int[]{-1, -1}, -2);
        assertEquals("Yes", result);
    }

    @Test
    public void given1123_returnYes(){
        String result = sumExists.sumOfTwo(new int[]{1, 1, 2, 3}, 5);
        assertEquals("Yes", result);
    }

    @Test
    public void given265811_returnYes(){
        String result = sumExists.sumOfTwo(new int[]{2, 6, 5, 8, 11}, 14);
        assertEquals("Yes", result);
    }

    @Test
    public void given265811_returnNo(){
        String result = sumExists.sumOfTwo(new int[]{2, 6, 5, 8, 11}, 20);
        assertEquals("No", result);
    }

    @Test
    public void given26589_returnNo(){
        String result = sumExists.sumOfTwo(new int[]{2, 6, 5, 8, 9}, 9);
        assertEquals("No", result);
    }

    @Test
    public void given189_returnYes(){
        String result = sumExists.sumOfTwo(new int[]{1, 8, 9}, 9);
        assertEquals("Yes", result);
    }
}
