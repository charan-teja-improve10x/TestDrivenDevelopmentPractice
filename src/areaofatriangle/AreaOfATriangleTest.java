package areaofatriangle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AreaOfATriangleTest {

    @Test
    public void nothing(){

    }

    @Test
    public void givenZeros_returnZero(){
        AreaOfATriangle areaOfAtriangle = new AreaOfATriangle();
        int area = areaOfAtriangle.findTheAreaOfATriangle(0, 0);
        assertEquals(0, area);
    }

    @Test
    public void givenNegative_returnMinusOne(){
        AreaOfATriangle areaOfAtriangle = new AreaOfATriangle();
        int area = areaOfAtriangle.findTheAreaOfATriangle(-1, -1);
        assertEquals(-1, area);
    }

    @Test
    public void givenZeroAndPositiveValue_return0(){
        AreaOfATriangle areaOfAtriangle = new AreaOfATriangle();
        int area = areaOfAtriangle.findTheAreaOfATriangle(0, 1);
        assertEquals(0, area);
    }

    @Test
    public void givenThreeAndTwo_return0(){
        AreaOfATriangle areaOfAtriangle = new AreaOfATriangle();
        int area = areaOfAtriangle.findTheAreaOfATriangle(3, 2);
        assertEquals(3, area);
    }

    @Test
    public void givenSevenAndFour_return14(){
        AreaOfATriangle areaOfAtriangle = new AreaOfATriangle();
        int area = areaOfAtriangle.findTheAreaOfATriangle(7, 4);
        assertEquals(14, area);
    }

    @Test
    public void givenTenAndTen_return50(){
        AreaOfATriangle areaOfAtriangle = new AreaOfATriangle();
        int area = areaOfAtriangle.findTheAreaOfATriangle(10, 10);
        assertEquals(50, area);
    }
}
