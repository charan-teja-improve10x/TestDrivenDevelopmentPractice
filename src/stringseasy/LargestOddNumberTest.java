package stringseasy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LargestOddNumberTest {

    @Test
    public void nothing(){

    }

    @Test
    public void givenNull_returnEmpty(){
      LargestOddNumber largestOddNumber = new LargestOddNumber();
      String ans = largestOddNumber.findLargestOddNUmber(null);
      assertEquals("", ans);
    }

    @Test
    public void givenEmpty_returnEmpty(){
        LargestOddNumber largestOddNumber = new LargestOddNumber();
        String ans = largestOddNumber.findLargestOddNUmber("");
        assertEquals("", ans);
    }

    @Test
    public void given0_returnEmpty(){
        LargestOddNumber largestOddNumber = new LargestOddNumber();
        String ans = largestOddNumber.findLargestOddNUmber("");
        assertEquals("", ans);
    }

    @Test
    public void given1_return1(){
        LargestOddNumber largestOddNumber = new LargestOddNumber();
        String ans = largestOddNumber.findLargestOddNUmber("1");
        assertEquals("1", ans);
    }

    @Test
    public void given52_return5(){
        LargestOddNumber largestOddNumber = new LargestOddNumber();
        String ans = largestOddNumber.findLargestOddNUmber("52");
        assertEquals("5", ans);
    }

    @Test
    public void given4206_returnEmpty(){
        LargestOddNumber largestOddNumber = new LargestOddNumber();
        String ans = largestOddNumber.findLargestOddNUmber("4206");
        assertEquals("", ans);
    }

    @Test
    public void given35427_return35427(){
        LargestOddNumber largestOddNumber = new LargestOddNumber();
        String ans = largestOddNumber.findLargestOddNUmber("35427");
        assertEquals("35427", ans);
    }
}
