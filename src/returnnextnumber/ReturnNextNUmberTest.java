package returnnextnumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReturnNextNUmberTest {

    @Test
    public void nothing() {

    }

    @Test
    public void givenZero_returnOne() {
        ReturnNextNumber returnNextNumber = new ReturnNextNumber();
        int nextNumber = returnNextNumber.findTheNextNumber(0);
        assertEquals(1, nextNumber);
    }

    @Test
    public void givenMinus1_returnZero() {
        ReturnNextNumber returnNextNumber = new ReturnNextNumber();
        int nextNumber = returnNextNumber.findTheNextNumber(-1);
        assertEquals(0, nextNumber);
    }

    @Test
    public void givenMinus5_returnMinus4() {
        ReturnNextNumber returnNextNumber = new ReturnNextNumber();
        int nextNumber = returnNextNumber.findTheNextNumber(-5);
        assertEquals(-4, nextNumber);
    }

    @Test
    public void given99_return100() {
        ReturnNextNumber returnNextNumber = new ReturnNextNumber();
        int nextNumber = returnNextNumber.findTheNextNumber(99);
        assertEquals(100, nextNumber);
    }

    @Test
    public void givenMinus99_returnMinus98() {
        ReturnNextNumber returnNextNumber = new ReturnNextNumber();
        int nextNumber = returnNextNumber.findTheNextNumber(-99);
        assertEquals(-98, nextNumber);
    }

    @Test
    public void givenMinus999_returnMinus1000() {
        ReturnNextNumber returnNextNumber = new ReturnNextNumber();
        int nextNumber = returnNextNumber.findTheNextNumber(999);
        assertEquals(1000, nextNumber);
    }
}
