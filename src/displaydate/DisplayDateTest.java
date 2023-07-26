package displaydate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DisplayDateTest {

    private DisplayDate displayDate;
    long timeStamp;
    @Test
    public void nothing(){

    }

    @BeforeEach
    public void setup(){
        displayDate = new DisplayDate();
        timeStamp = System.currentTimeMillis();
    }


    @Test
    public void given0_throwsInvalidTimeException(){
        String result = displayDate.getDisplayDate(0);
        assertArrayEquals("".toCharArray(), result.toCharArray());
    }


    @Disabled
    @Test
    public void givenNegativeValue_returnEmpty(){
    }


    @Test
    public void givenCurrentTime_returnToday(){
        String result = displayDate.getDisplayDate(timeStamp);
        assertEquals("Today", result);
    }

    @Test
    public void givenCurrentTimeMinus24Hours_returnYesterday(){
        String result = displayDate.getDisplayDate(System.currentTimeMillis() - 24 * 60 * 60 * 1000);
        assertEquals("Yesterday", result);
    }


    @Test
    public void givenCurrentTimeMinus48Hours_returnYesterday(){
        String result = displayDate.getDisplayDate(System.currentTimeMillis() - 48 * 60 * 60 * 1000);
        assertEquals("25 Jul", result);
    }


    @Test
    public void givenCurrentTimeMinus96Hours_returnYesterday(){
        String result = displayDate.getDisplayDate(System.currentTimeMillis() - 96 * 60 * 60 * 1000);
        assertEquals("23 Jul", result);
    }
}
