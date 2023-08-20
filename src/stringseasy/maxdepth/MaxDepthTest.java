package stringseasy.maxdepth;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxDepthTest {

    private static final MaxDepth maxDepth = new MaxDepth();

    @Test
    public void nothing(){}

    @Test
    public void givenNull_returnZero(){
        int depth = maxDepth.countMaxDepth(null);
        assertEquals(0, depth);
    }

    @Test
    public void givenEmpty_returnZero(){
        int depth = maxDepth.countMaxDepth("");
        assertEquals(0, depth);
    }

    @Test
    public void givenC_returnZero(){
        int depth = maxDepth.countMaxDepth("C");
        assertEquals(0, depth);
    }

    @Test
    public void givenCInPeranthais_return1(){
        int depth = maxDepth.countMaxDepth("(C)");
        assertEquals(1, depth);
    }

    @Test
    public void givenSomeRandomInput_return4(){
        int depth = maxDepth.countMaxDepth("(3*(4*(5*(6))))");
        assertEquals(4, depth);
    }

    @Test
    public void givenSomeRandomInput_return5(){
        int depth = maxDepth.countMaxDepth("(((((5))))) ");
        assertEquals(5, depth);
    }
}
