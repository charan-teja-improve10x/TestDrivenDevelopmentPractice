package primorial;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrimorialTest {

    @Test
    public void nothing(){}

    @Test
    public void givenZero_returnZero(){
        Primorial primorial = new Primorial();
        long product = primorial.findThePrimorial(0);
        assertEquals(0, product);
    }

    @Test
    public void givenNegativeValues_returnMinusOne(){
        Primorial primorial = new Primorial();
        long product = primorial.findThePrimorial(-1);
        assertEquals(-1, product);
    }

    @Test
    public void givenOne_returnTwo(){
        Primorial primorial = new Primorial();
        long product = primorial.findThePrimorial(1);
        assertEquals(2, product);
    }

    @Test
    public void given2_return6(){
        Primorial primorial = new Primorial();
        long product = primorial.findThePrimorial(2);
        assertEquals(6, product);
    }

    @Test
    public void given3_return30(){
        Primorial primorial = new Primorial();
        long product = primorial.findThePrimorial(2);
        assertEquals(6, product);
    }

    @Test
    public void given4_return210(){
        Primorial primorial = new Primorial();
        long product = primorial.findThePrimorial(4);
        assertEquals(210, product);
    }

    @Test
    public void given5_return210(){
        Primorial primorial = new Primorial();
        long product = primorial.findThePrimorial(5);
        assertEquals(2310, product);
    }

    @Test
    public void given8_return9699690(){
        Primorial primorial = new Primorial();
        long product = primorial.findThePrimorial(8);
        assertEquals(9699690, product);
    }
}
