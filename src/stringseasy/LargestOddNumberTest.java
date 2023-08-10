package stringseasy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LargestOddNumberTest {

    @Test
    public void nothing(){

    }

    @Test
    public void givenNull_returnNull(){
      LargestOddNumber largestOddNumber = new LargestOddNumber();
      String ans = largestOddNumber.findLargestOddNUmber(null);
      assertEquals("", ans);
    }
}
