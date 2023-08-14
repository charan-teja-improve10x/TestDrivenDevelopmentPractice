package stringseasy.roman;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanToNumberTest {

    @Test
    public void nothing(){}

    @Test
    public void givenNull_returnZero(){
        RomanToNumber romanToNumber = new RomanToNumber();
        int number = romanToNumber.romanToInt(null);
        assertEquals(0, number);
    }

    @Test
    public void givenEmpty_returnZero(){
        RomanToNumber romanToNumber = new RomanToNumber();
        int number = romanToNumber.romanToInt("");
        assertEquals(0, number);
    }

    @Test
    public void givenI_returnOne(){
        RomanToNumber romanToNumber = new RomanToNumber();
        int number = romanToNumber.romanToInt("I");
        assertEquals(1, number);
    }
}
