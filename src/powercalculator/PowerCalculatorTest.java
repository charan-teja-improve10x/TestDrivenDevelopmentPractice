package powercalculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PowerCalculatorTest {

    private PowerCalculator powerCalculator;

    @BeforeEach
    public void setup(){
        powerCalculator = new PowerCalculator();
    }

    @Test
    public void nothing(){}

    @Test
    public void givenTwoZeros_returnZero(){
        int power = powerCalculator.calculate(0, 0);
        assertEquals(0, power);
    }

    @Test
    public void givenNegativeValues_returnNegative(){
        int power = powerCalculator.calculate(-3, 0);
        assertEquals(-1, power);
    }

    @Test
    public void given1And0_returnZero(){
        int power = powerCalculator.calculate(1, 0);
        assertEquals(0, power);
    }

    @Test
    public void given230And10_return2300(){
        int power = powerCalculator.calculate(230, 10);
        assertEquals(2300, power);
    }

    @Test
    public void given110And3_return330(){
        int power = powerCalculator.calculate(110, 3);
        assertEquals(330, power);
    }

    @Test
    public void given480And20_return9600(){
        int power = powerCalculator.calculate(480, 20);
        assertEquals(9600, power);
    }
}
