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
}
