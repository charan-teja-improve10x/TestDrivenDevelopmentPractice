package removeduplicates;

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
}
