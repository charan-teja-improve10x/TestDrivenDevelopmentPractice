package stringseasy.roman;

import org.junit.jupiter.api.Test;
import templerun.Coin;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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

    @Test
    public void givenII_return2(){
        RomanToNumber romanToNumber = new RomanToNumber();
        int number = romanToNumber.romanToInt("II");
        assertEquals(2, number);
    }

    @Test
    public void givenOtherCharacter_throwInvalidInputException(){
        RomanToNumber romanToNumber = new RomanToNumber();
        assertThrows(RomanToNumber.InvalidInputException.class, ()-> romanToNumber.romanToInt("s"), "Enter Roman Values Only...!");
    }

    @Test
    public void givenSmallI_throwInvalidInputException(){
        RomanToNumber romanToNumber = new RomanToNumber();
        assertThrows(RomanToNumber.InvalidInputException.class, ()-> romanToNumber.romanToInt("i"), "Enter Roman Values Only...!");
    }
}
