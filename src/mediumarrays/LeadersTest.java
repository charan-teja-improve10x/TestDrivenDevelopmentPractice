package mediumarrays;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeadersTest {

    @Test
    public void noting(){}

    @Test
    public void givenNull_returnEmptyList(){
        Leaders leaders = new Leaders();
        ArrayList<Integer> list = leaders.getLeaders(null, 0);
        assertEquals(new ArrayList<>(), list);
    }

    @Test
    public void givenEmpty_returnEmptyList(){
        Leaders leaders = new Leaders();
        ArrayList<Integer> list = leaders.getLeaders(new int[]{}, 0);
        assertEquals(new ArrayList<>(), list);
    }

    @Test
    public void givenOneElement_returnOneList(){
        Leaders leaders = new Leaders();
        ArrayList<Integer> list = leaders.getLeaders(new int[]{0}, 1);
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(0);
        assertEquals(expected, list);
    }

    @Test
    public void givenZeroOne_returnOneList(){
        Leaders leaders = new Leaders();
        ArrayList<Integer> list = leaders.getLeaders(new int[]{0, 1}, 2);
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(1);
        assertEquals(expected, list);
    }

    @Test
    public void givenZeroOne2345_return3List(){
        Leaders leaders = new Leaders();
        ArrayList<Integer> list = leaders.getLeaders(new int[]{0, 1, 2, 3}, 6);
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(3);
        assertEquals(expected, list);
    }

    @Test
    public void given3210_return5List(){
        Leaders leaders = new Leaders();
        ArrayList<Integer> list = leaders.getLeaders(new int[]{3, 2, 1, 0}, 4);
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(3);
        expected.add(2);
        expected.add(1);
        expected.add(0);
        assertEquals(expected, list);
    }

    @Test
    public void given13012_return5List(){
        Leaders leaders = new Leaders();
        ArrayList<Integer> list = leaders.getLeaders(new int[]{1, 3, 0, 1, 2}, 5);
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(3);
        expected.add(2);
        assertEquals(expected, list);
    }
}
