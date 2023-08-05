package secondlargetsnumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SecondLargestNumberTest {

    @Test
    public void nothing(){}

    @Test
    public void givenNull_returnMinusOne(){
        SecondLargestNumber secondLargestNumber = new SecondLargestNumber();
        int secondLargeNumber = secondLargestNumber.findTheSecondLargestNumber(null);
        assertEquals(-1, secondLargeNumber);
    }
}
