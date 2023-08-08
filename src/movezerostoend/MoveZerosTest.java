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
}
