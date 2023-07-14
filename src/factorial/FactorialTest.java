package factorial;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTest {

    private Factorial  factorial;

    @BeforeEach
    public void setup(){
        factorial = new Factorial();
    }

    @Test
    public void nothing(){}

    @Test
    public void givenNegative_returnNegative(){
        int negative = factorial.calculateFactorial(-10);
        assertEquals(-1, negative);
    }

    @Test
    public void givenZero_returnZero(){
        int zeroFactNumber = factorial.calculateFactorial(0);
        assertEquals(0, zeroFactNumber);
    }

    @Test
    public void givenOne_returnZero(){
        int oneFactNumber = factorial.calculateFactorial(1);
        assertEquals(0, oneFactNumber);
    }

    @Test
    public void givenTwo_returnTwo(){
        int twoFactNumber = factorial.calculateFactorial(2);
        assertEquals(2, twoFactNumber);
    }

    @Test
    public void givenThree_returnThree(){
        int threeFactNumber = factorial.calculateFactorial(3);
        assertEquals(6, threeFactNumber);
    }

    //1 * 2 * 3 * 4
    @Test
    public void givenFour_returnTwentyFour(){
        int threeFactNumber = factorial.calculateFactorial(4);
        assertEquals(24, threeFactNumber);
    }
}
