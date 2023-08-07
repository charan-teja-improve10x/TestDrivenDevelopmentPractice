package unionarray;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class UnionTest {

    private Union union;

    @BeforeEach
    public void setup(){
        union = new Union();
    }
    @Test
    public void nothing(){}

    @Test
    public void givenNull_returnEmptyList(){
        ArrayList<Integer> unionArray = union.findUnion(null, null);
        assertEquals(new ArrayList<>(), unionArray);
    }

    @Test
    public void givenEmpty_returnEmptyList(){
        ArrayList<Integer> unionArray = union.findUnion(new Integer[]{}, new Integer[]{});
        assertEquals(new ArrayList<>(), unionArray);
    }

    @Test
    public void givenNullANd0_return0(){
        ArrayList<Integer> unionArray = union.findUnion(  new Integer[]{}, new Integer[]{0});
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(0);
        assertEquals(expected, unionArray);
    }

    @Test
    public void given0ANd0_return0(){
        ArrayList<Integer> unionArray = union.findUnion(  new Integer[]{0}, new Integer[]{0});
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(0);
        assertEquals(expected, unionArray);
    }

    @Test
    public void given0000ANd0000_return0(){
        ArrayList<Integer> unionArray = union.findUnion(  new Integer[]{0, 0, 0, 0}, new Integer[]{0, 0, 0, 0});
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(0);
        assertEquals(expected, unionArray);
    }

    @Test
    public void given012ANd0234_return0(){
        ArrayList<Integer> unionArray = union.findUnion(  new Integer[]{0, 1, 2}, new Integer[]{0, 2, 3, 4});
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(0);
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        assertEquals(expected, unionArray);
    }

    @Test
    public void given012345ANd0234_return012345(){
        Union union = new Union();
        List<Integer> unionArray = union.findUnion(  new Integer[]{0, 1, 2, 3, 4, 5}, new Integer[]{0, 1, 2, 3, 4, 5});
        assertEquals(Arrays.asList(0, 1, 2, 3, 4, 5), unionArray);
    }
}
