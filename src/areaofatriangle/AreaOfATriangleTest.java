package areaofatriangle;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AreaOfATriangleTest {

    private AreaOfATriangle areaOfATriangle;

    @BeforeEach
    public void setup(){
        areaOfATriangle = new AreaOfATriangle();
    }

    @Test
    public void nothing(){

    }

    @Test
    public void givenZeros_returnZero(){
        float area = areaOfATriangle.findTheArea(0, 0);
        assertEquals(0, area);
    }

    @Test
    public void givenNegative_returnMinusOne(){
        float area = areaOfATriangle.findTheArea(-1, -1);
        assertEquals(-1, area);
    }

    @Test
    public void givenZeroAndPositiveValue_return0(){
        float area = areaOfATriangle.findTheArea(0, 1);
        assertEquals(0, area);
    }

    @Test
    public void givenOneANdZero_return0(){
        float area = areaOfATriangle.findTheArea(1, 0);
        assertEquals(0, area);
    }

    @Test
    public void givenTwoOnes_returnFloatValue(){
        float area = areaOfATriangle.findTheArea(1, 1);
        assertEquals(0.5, area);
    }



    @Test
    public void givenThreeAndTwo_return0(){
        float area = areaOfATriangle.findTheArea(3, 2);
        assertEquals(3, area);
    }

    @Test
    public void givenSevenAndFour_return14(){
        float area = areaOfATriangle.findTheArea(7, 4);
        assertEquals(14, area);
    }

    @Test
    public void givenTenAndTen_return50(){
        float area = areaOfATriangle.findTheArea(10, 10);
        assertEquals(50, area);
    }
}
