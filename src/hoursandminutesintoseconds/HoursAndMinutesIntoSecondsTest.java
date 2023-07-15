package hoursandminutesintoseconds;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HoursAndMinutesIntoSecondsTest {

    @Test
    public void nothing(){}

    @Test
    public void givenZero_returnZero(){
        HoursAndMinutesIntoSeconds hoursAndMinutesIntoSeconds = new HoursAndMinutesIntoSeconds();
        long returnZero = hoursAndMinutesIntoSeconds.convert(0, 0);
        assertEquals(0, returnZero);
    }

    @Test
    public void givenOneAndZero_return3600(){
        HoursAndMinutesIntoSeconds hoursAndMinutesIntoSeconds = new HoursAndMinutesIntoSeconds();
        long return3600 = hoursAndMinutesIntoSeconds.convert(1, 0);
        assertEquals(3600, return3600);
    }

    @Test
    public void givenTwoAndOne_return7260(){
        HoursAndMinutesIntoSeconds hoursAndMinutesIntoSeconds = new HoursAndMinutesIntoSeconds();
        long return7260 = hoursAndMinutesIntoSeconds.convert(2, 1);
        assertEquals(7260, return7260);
    }

    @Test
    public void given1000_return3603600(){
        HoursAndMinutesIntoSeconds hoursAndMinutesIntoSeconds = new HoursAndMinutesIntoSeconds();
        long return3603600 = hoursAndMinutesIntoSeconds.convert(1000, 60);
        assertEquals(3603600, return3603600);
    }

    @Test
    public void givenMinusOneMinusTen_returnMinus4200(){
        HoursAndMinutesIntoSeconds hoursAndMinutesIntoSeconds = new HoursAndMinutesIntoSeconds();
        long returnMinus4200 = hoursAndMinutesIntoSeconds.convert(-1, -10);
        assertEquals(-4200, returnMinus4200);
    }

    @Test
    public void givenOneMinusTen_return3000(){
        HoursAndMinutesIntoSeconds hoursAndMinutesIntoSeconds = new HoursAndMinutesIntoSeconds();
        long return3000 = hoursAndMinutesIntoSeconds.convert(-1, -10);
        assertEquals(-4200, return3000);
    }

    @Test
    public void givenMinusOneTen_returnMinus3000(){
        HoursAndMinutesIntoSeconds hoursAndMinutesIntoSeconds = new HoursAndMinutesIntoSeconds();
        long returnMinus3000 = hoursAndMinutesIntoSeconds.convert(-1, 10);
        assertEquals(-3000, returnMinus3000);
    }
}
