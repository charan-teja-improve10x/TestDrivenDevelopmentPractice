package displaydate;

import org.junit.jupiter.api.BeforeEach;
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
    public void given0_throwsInvalidException(){
        assertThrows(DisplayDate.InvalidTimeStampException.class, ()-> displayDate.getDisplayDate(0), "TimeStamp value Should be greaterThan 0");
    }
    @Test
    public void givenNegativeValue_throwsInvalidException(){
        assertThrows(DisplayDate.InvalidTimeStampException.class, ()-> displayDate.getDisplayDate(-2), "TimeStamp value Should be greaterThan 0");
    }


    @Test
    public void givenCurrentTime_returnToday(){
        String result = displayDate.getDisplayDate(timeStamp);
        assertEquals("Today", result);
    }

    @Test
    public void givenCurrentTimeMinus24Hours_returnYesterday(){
        String result = displayDate.getDisplayDate(timeStamp - 86400000);
        assertEquals("Yesterday", result);
    }

    @Test
    public void givenCurrentTimeMinus48Hours_returnYesterday(){
        String result = displayDate.getDisplayDate(timeStamp - 48 * 60 * 60 * 1000);
        assertEquals("25 Jul", result);
    }

    @Test
    public void givenCurrentTimeMinus96Hours_returnYesterday(){
        String result = displayDate.getDisplayDate(System.currentTimeMillis() - 96 * 60 * 60 * 1000);
        assertEquals("23 Jul", result);
    }

    @Test
    public void givenLastYearTimeInMillis_returnDayMonthAndYear(){
        String result = displayDate.getDisplayDate(978546600000l);
        assertEquals("04 Jan 2001", result);
    }
}
