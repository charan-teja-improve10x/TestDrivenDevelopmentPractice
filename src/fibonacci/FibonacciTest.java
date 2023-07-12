package fibonacci;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FibonacciTest {

    @Test
    public void nothing(){

    }

    @Test
    public void giveAnyNegativeNUmber_returnNegative() {
        Fibonacci fibonacci = new Fibonacci();
        int negativeNumber = fibonacci.find(-1);
        assertEquals(-1, negativeNumber);
    }

    @Test
    public void givenZero_returnNegative() {
        Fibonacci fibonacci = new Fibonacci();
        int zero = fibonacci.find(0);
        assertEquals(-1, zero);
    }

    @Test
    public void givenOne_returnZero() {
        Fibonacci fibonacci = new Fibonacci();
        int one = fibonacci.find(1);
        assertEquals(0, one);
    }

    @Test
    public void givenTwo_returnOne() {
        Fibonacci fibonacci = new Fibonacci();
        int givenTwo = fibonacci.find(2);
        assertEquals(1, givenTwo);
    }

    @Test
    public void givenThree_returnTwo() {
        Fibonacci fibonacci = new Fibonacci();
        int givenThree = fibonacci.find(3);
        assertEquals(2, givenThree);
    }

    @Test
    public void givenFive_returnFive() {
        Fibonacci fibonacci = new Fibonacci();
        int givenFive = fibonacci.find(5);
        assertEquals(5, givenFive);
    }

    @Test
    public void given6_returnEight() {
        Fibonacci fibonacci = new Fibonacci();
        int givenEight = fibonacci.find(6);
        assertEquals(8, givenEight);
    }



}
