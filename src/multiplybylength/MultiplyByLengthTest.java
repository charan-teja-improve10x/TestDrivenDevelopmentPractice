package multiplybylength;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplyByLengthTest {

    @Test
    public void nothing(){}

    @Test
    public void givenZero_returnZero(){
        MultiplyByLength multiplyByLength = new MultiplyByLength();
        int[] returnArray = multiplyByLength.multipleTheElementsWithLength(new int[] {0});
        assertEquals(new int[]{0}, returnArray);
    }
}
