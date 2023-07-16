package perimeterofrectangle;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PerimeterOfRectangleTest {

    private PerimeterOfRectangle perimeter;

    @BeforeEach
    public void setup() {
        perimeter = new PerimeterOfRectangle();
    }

    @Test
    public void nothing() {
    }

    @Test
    public void givenAllZeros_returnZero() {
        int perimeterOfRectangle = perimeter.findThePerimeterOfRectangle(0, 0);
        assertEquals(0, perimeterOfRectangle);
    }

    @Test
    public void givenZeroAnd5_return10() {
        int perimeterOfRectangle = perimeter.findThePerimeterOfRectangle(0, 5);
        assertEquals(10, perimeterOfRectangle);
    }

    @Test
    public void givenMinusValue_returnMinusOne() {
        int perimeterOfRectangle = perimeter.findThePerimeterOfRectangle(1, -5);
        assertEquals(-1, perimeterOfRectangle);
    }

    @Test
    public void given2And5_return14() {
        int perimeterOfRectangle = perimeter.findThePerimeterOfRectangle(2, 5);
        assertEquals(14, perimeterOfRectangle);
    }
}
