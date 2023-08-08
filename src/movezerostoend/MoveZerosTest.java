package movezerostoend;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MoveZerosTest {

    @Test
    public void nothing(){}

    @Test
    public void givenNull_returnEmpty(){
        MoveZeros moveZeros = new MoveZeros();
        int[] endArray = moveZeros.moveZerosToTheEnd(null, 0);
        assertArrayEquals(new int[]{}, endArray);
    }

    @Test
    public void givenEmpty_returnEmpty(){
        MoveZeros moveZeros = new MoveZeros();
        int[] endArray = moveZeros.moveZerosToTheEnd(new int[]{}, 0);
        assertArrayEquals(new int[]{}, endArray);
    }

    @Test
    public void givenOneElement_returnOneElement(){
        MoveZeros moveZeros = new MoveZeros();
        int[] endArray = moveZeros.moveZerosToTheEnd(new int[]{0}, 1);
        assertArrayEquals(new int[]{0}, endArray);
    }

    @Test
    public void givenOne_returnOne(){
        MoveZeros moveZeros = new MoveZeros();
        int[] endArray = moveZeros.moveZerosToTheEnd(new int[]{1}, 1);
        assertArrayEquals(new int[]{1}, endArray);
    }

    @Test
    public void givenZeroOne_returnOneZero(){
        MoveZeros moveZeros = new MoveZeros();
        int[] endArray = moveZeros.moveZerosToTheEnd(new int[]{0, 1}, 2);
        assertArrayEquals(new int[]{1, 0}, endArray);
    }

    @Test
    public void givenZeroZero_returnZeroZero(){
        MoveZeros moveZeros = new MoveZeros();
        int[] endArray = moveZeros.moveZerosToTheEnd(new int[]{0, 0}, 2);
        assertArrayEquals(new int[]{0, 0}, endArray);
    }

    @Test
    public void givenZeroOneZero_returnOneZeroZero(){
        MoveZeros moveZeros = new MoveZeros();
        int[] endArray = moveZeros.moveZerosToTheEnd(new int[]{0, 1, 0}, 3);
        assertArrayEquals(new int[]{1, 0, 0}, endArray);
    }

    @Test
    public void given010101_return111000(){
        MoveZeros moveZeros = new MoveZeros();
        int[] endArray = moveZeros.moveZerosToTheEnd(new int[]{0, 1, 0, 1, 0, 1}, 6);
        assertArrayEquals(new int[]{1, 1, 1, 0, 0, 0}, endArray);
    }
}
