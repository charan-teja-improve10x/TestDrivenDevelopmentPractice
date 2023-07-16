package perimeterofrectangle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PerimeterOfRectangleTest {

    @Test
    public void nothing(){}

    @Test
    public void givenAllZeros_returnZero(){
        PerimeterOfRectangle perimeter = new PerimeterOfRectangle();
        int perimeterOfRectangle  = perimeter.findThePerimeterOfRectangle(0, 0);
        assertEquals(0, perimeterOfRectangle);
    }

    @Test
    public void givenZeroAnd5_return10(){
        PerimeterOfRectangle perimeter = new PerimeterOfRectangle();
        int perimeterOfRectangle  = perimeter.findThePerimeterOfRectangle(0, 5);
        assertEquals(10, perimeterOfRectangle);
    }

    @Test
    public void givenMinusValue_returnMinusOne(){
        PerimeterOfRectangle perimeter = new PerimeterOfRectangle();
        int perimeterOfRectangle  = perimeter.findThePerimeterOfRectangle(1, -5);
        assertEquals(-1, perimeterOfRectangle);
    }

    @Test
    public void given2And5_return14(){
        PerimeterOfRectangle perimeter = new PerimeterOfRectangle();
        int perimeterOfRectangle  = perimeter.findThePerimeterOfRectangle(2, 5);
        assertEquals(14, perimeterOfRectangle);
    }
}
