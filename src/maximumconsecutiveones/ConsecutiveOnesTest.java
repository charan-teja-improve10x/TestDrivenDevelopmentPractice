package maximumconsecutiveones;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConsecutiveOnesTest {

    @Test
    public void nothing(){}

    @Test
    public void givenNull_returnZero(){
        ConsecutiveOnes consecutiveOnes = new ConsecutiveOnes();
        int maxi = consecutiveOnes.countOfConsecutiveOnes(null);
        assertEquals(0,maxi);
    }

    @Test
    public void givenEmpty_returnZero(){
        ConsecutiveOnes consecutiveOnes = new ConsecutiveOnes();
        int maxi = consecutiveOnes.countOfConsecutiveOnes(new int[]{});
        assertEquals(0,maxi);
    }

    @Test
    public void givenZero_returnZero(){
        ConsecutiveOnes consecutiveOnes = new ConsecutiveOnes();
        int maxi = consecutiveOnes.countOfConsecutiveOnes(new int[]{0});
        assertEquals(0,maxi);
    }


}
