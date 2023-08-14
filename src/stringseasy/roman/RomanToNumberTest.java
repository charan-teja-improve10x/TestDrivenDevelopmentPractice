package stringseasy.roman;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RomanToNumberTest {

    private static RomanToNumber romanToNumber = new RomanToNumber();

    @Test
    public void nothing(){}

    @Test
    public void givenNull_returnZero(){
        int number = romanToNumber.romanToInt(null);
        assertEquals(0, number);
    }

    @Test
    public void givenEmpty_returnZero(){
        int number = romanToNumber.romanToInt("");
        assertEquals(0, number);
    }

    @Test
    public void givenI_returnOne(){
        int number = romanToNumber.romanToInt("I");
        assertEquals(1, number);
    }

    @Test
    public void givenII_return2(){
        int number = romanToNumber.romanToInt("II");
        assertEquals(2, number);
    }

    @Test
    public void givenOtherCharacter_throwInvalidInputException(){
        assertThrows(RomanToNumber.InvalidInputException.class, ()-> romanToNumber.romanToInt("s"), "Enter Roman Values Only...!");
    }

    @Test
    public void givenSmallI_throwInvalidInputException(){
        assertThrows(RomanToNumber.InvalidInputException.class, ()-> romanToNumber.romanToInt("i"), "Enter Roman Values Only...!");
    }

    @Test
    public void givenXIII_return13(){
        int number = romanToNumber.romanToInt("XIII");
        assertEquals(13, number);
    }
    @Test
    public void givenLVIII_return2(){
        int number = romanToNumber.romanToInt("LVIII");
        assertEquals(58, number);
    }

    @Test
    public void givenMCMXCIV_return1994(){
        int number = romanToNumber.romanToInt("MCMXCIV");
        assertEquals(1994, number);
    }
}
