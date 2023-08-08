package mediumarrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumExistsTest {
    @Test
    public void nothing(){}

    @Test
    public void givenNull_returnNo(){
        SumExists sumExists = new SumExists();
        String result = sumExists.sumOfTwo(null, 0);
        assertEquals("No", result);
    }
}
