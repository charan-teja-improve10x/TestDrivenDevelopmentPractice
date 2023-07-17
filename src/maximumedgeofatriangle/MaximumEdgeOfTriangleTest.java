package maximumedgeofatriangle;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumEdgeOfTriangleTest {

    private MaximumEdgeOfTriangle maximumEdgeOfTriangle;

    @BeforeEach
    public void setup(){
        maximumEdgeOfTriangle = new MaximumEdgeOfTriangle();
    }

    @Test
    public void nothing(){

    }

    @Test
    public void givenZeroAndZero_returnZero(){
        int thirdEdge = maximumEdgeOfTriangle.findTheThirdMaximEdgeOfTriangle(0, 0);
        assertEquals(0, thirdEdge);
    }

    @Test
    public void givenZeroAndOne_returnZero(){
        int thirdEdge = maximumEdgeOfTriangle.findTheThirdMaximEdgeOfTriangle(0, 1);
        assertEquals(0, thirdEdge);
    }

    @Test
    public void givenOneAndTwo_returnTwo(){
        int thirdEdge = maximumEdgeOfTriangle.findTheThirdMaximEdgeOfTriangle(1, 2);
        assertEquals(2, thirdEdge);
    }

    @Test
    public void givenOneAndOne_returnOne(){
        int thirdEdge = maximumEdgeOfTriangle.findTheThirdMaximEdgeOfTriangle(1, 1);
        assertEquals(1, thirdEdge);
    }

    @Test
    public void given8And10_return17(){
        int thirdEdge = maximumEdgeOfTriangle.findTheThirdMaximEdgeOfTriangle(8, 10);
        assertEquals(17, thirdEdge);
    }

    @Test
    public void given5And7_return11(){
        int thirdEdge = maximumEdgeOfTriangle.findTheThirdMaximEdgeOfTriangle(5, 7);
        assertEquals(11, thirdEdge);
    }

    @Test
    public void given9And2_return10(){
        int thirdEdge = maximumEdgeOfTriangle.findTheThirdMaximEdgeOfTriangle(9, 2);
        assertEquals(10, thirdEdge);
    }
}
