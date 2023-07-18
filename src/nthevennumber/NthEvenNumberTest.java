package nthevennumber;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NthEvenNumberTest {

    private NthEvenNumber nthEvenNumber;

    @BeforeEach
    public void setup() {
        nthEvenNumber = new NthEvenNumber();
    }

    @Test
    public void nothing() {
    }

    @Test
    public void givenZero_returnZero() {
        int evenNumber = nthEvenNumber.findTheNthEvenNumber(0);
        assertEquals(0, evenNumber);
    }

    @Test
    public void givenNegative_returnNegative() {
        int evenNumber = nthEvenNumber.findTheNthEvenNumber(-5);
        assertEquals(-2, evenNumber);
    }

    @Test
    public void givenOne_returnZero() {
        int evenNumber = nthEvenNumber.findTheNthEvenNumber(1);
        assertEquals(0, evenNumber);
    }

    @Test
    public void given2_return2() {
        int evenNumber = nthEvenNumber.findTheNthEvenNumber(2);
        assertEquals(2, evenNumber);
    }

    @Test
    public void given3_return4() {
        int evenNumber = nthEvenNumber.findTheNthEvenNumber(3);
        assertEquals(4, evenNumber);
    }

    @Test
    public void given10_return18() {
        int evenNumber = nthEvenNumber.findTheNthEvenNumber(10);
        assertEquals(18, evenNumber);
    }

    @Test
    public void given99_return196() {
        int evenNumber = nthEvenNumber.findTheNthEvenNumber(99);
        assertEquals(196, evenNumber);
    }
}
