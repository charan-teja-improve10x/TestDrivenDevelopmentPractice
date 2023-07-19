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
}
