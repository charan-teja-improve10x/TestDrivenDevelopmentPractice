package unionarray;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UnionTest {

    @Test
    public void nothing(){}

    @Test
    public void givenNull_returnEmptyList(){
        Union union = new Union();
        ArrayList<Integer> unionArray = union.findUnion(null, null);
        assertEquals(new ArrayList<>(), unionArray);
    }

    @Test
    public void givenEmpty_returnEmptyList(){
        Union union = new Union();
        ArrayList<Integer> unionArray = union.findUnion(new Integer[]{}, new Integer[]{});
        assertEquals(new ArrayList<>(), unionArray);
    }

    @Test
    public void givenOneNUllAndOneEmpty_returnEmptyList(){
        Union union = new Union();
        ArrayList<Integer> unionArray = union.findUnion(null, new Integer[]{});
        assertEquals(new ArrayList<>(), unionArray);
    }

    @Test
    public void givenOneEmptyOneNull_returnEmptyList(){
        Union union = new Union();
        ArrayList<Integer> unionArray = union.findUnion( new Integer[]{}, null);
        assertEquals(new ArrayList<>(), unionArray);
    }
}
