package maximumconsecutiveones;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConsecutiveOnesTest {

    private ConsecutiveOnes consecutiveOnes;

    @BeforeEach
    public void setup(){
        consecutiveOnes = new ConsecutiveOnes();
    }

    @Test
    public void nothing(){}

    @Test
    public void givenNull_returnZero(){
        int maxi = consecutiveOnes.countOfConsecutiveOnes(null);
        assertEquals(0,maxi);
    }

    @Test
    public void givenEmpty_returnZero(){
        int maxi = consecutiveOnes.countOfConsecutiveOnes(new int[]{});
        assertEquals(0,maxi);
    }

    @Test
    public void givenZero_returnZero(){
        int maxi = consecutiveOnes.countOfConsecutiveOnes(new int[]{0});
        assertEquals(0,maxi);
    }

    @Test
    public void givenOne_returnOne(){
        int maxi = consecutiveOnes.countOfConsecutiveOnes(new int[]{1});
        assertEquals(1,maxi);
    }

    @Test
    public void givenTwoOnes_returnTwo(){
        int maxi = consecutiveOnes.countOfConsecutiveOnes(new int[]{1, 1});
        assertEquals(2,maxi);
    }

    @Test
    public void given1011_returnTwo(){
        int maxi = consecutiveOnes.countOfConsecutiveOnes(new int[]{1, 0, 1, 1});
        assertEquals(2,maxi);
    }

    @Test
    public void given0022_returnZero(){
        int maxi = consecutiveOnes.countOfConsecutiveOnes(new int[]{0, 0, 2, 2});
        assertEquals(0,maxi);
    }

    @Test
    public void given101110011111_returnTwo(){
        int maxi = consecutiveOnes.countOfConsecutiveOnes(new int[]{1, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1});
        assertEquals(5,maxi);
    }
}
