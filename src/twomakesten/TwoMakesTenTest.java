package twomakesten;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwoMakesTenTest {

    @Test
    public void nothing(){}

    @Test
    public void givenNegativeNumbers (){
        TwoMakesTen twoMakesTen = new TwoMakesTen();
        boolean num = twoMakesTen.getTwoMakesTen(-1, -2);
        assertEquals(false, num);
    }

    @Test
    public void givenZero_returnFalse (){
        TwoMakesTen twoMakesTen = new TwoMakesTen();
        boolean num = twoMakesTen.getTwoMakesTen(0, 0);
        assertEquals(false, num);
    }

    @Test
    public void givenTwoAndNine_returnFalse (){
        TwoMakesTen twoMakesTen = new TwoMakesTen();
        boolean num = twoMakesTen.getTwoMakesTen(2, 9);
        assertEquals(false, num);
    }

    @Test
    public void givenTenOne_returnTrue (){
        TwoMakesTen twoMakesTen = new TwoMakesTen();
        boolean num = twoMakesTen.getTwoMakesTen(10, 1);
        assertEquals(true, num);
    }

    @Test
    public void givenIPlusNTen_returnTrue (){
        TwoMakesTen twoMakesTen = new TwoMakesTen();
        boolean num = twoMakesTen.getTwoMakesTen(4, 6);
        assertEquals(true, num);
    }
}
