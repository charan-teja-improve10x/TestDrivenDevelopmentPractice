package twomakesten;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwoMakesTenTest {

    private TwoMakesTen twoMakesTen;

    @BeforeEach
    public void setup() {
        twoMakesTen = new TwoMakesTen();
    }

    @Test
    public void nothing() {
    }

    @Test
    public void givenNegativeNumbers() {
        boolean num = twoMakesTen.getTwoMakesTen(-1, -10);
        assertEquals(false, num);
    }

    @Test
    public void givenZero_returnFalse() {
        boolean num = twoMakesTen.getTwoMakesTen(0, 0);
        assertEquals(false, num);
    }

    @Test
    public void givenTwoAndNine_returnFalse() {
        boolean num = twoMakesTen.getTwoMakesTen(2, 9);
        assertEquals(false, num);
    }

    @Test
    public void givenTenOne_returnTrue() {
        boolean num = twoMakesTen.getTwoMakesTen(10, 1);
        assertEquals(true, num);
    }

    @Test
    public void givenIPlusNTen_returnTrue() {
        boolean num = twoMakesTen.getTwoMakesTen(4, 6);
        assertEquals(true, num);
    }
}
