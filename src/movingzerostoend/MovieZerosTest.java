package movingzerostoend;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MovieZerosTest {

    @Test
    public void nothing(){}

    @Test
    public void givenNull_returnEmpty(){
        MovieZeros movieZeros = new MovieZeros();
        int[] result = movieZeros.movingTheZerosToEnd(null, 0);
        assertArrayEquals(new int[]{}, result);
    }

    @Test
    public void givenEmpty_returnEmpty(){
        MovieZeros movieZeros = new MovieZeros();
        int[] result = movieZeros.movingTheZerosToEnd(new int[]{}, 0);
        assertArrayEquals(new int[]{}, result);
    }

    @Test
    public void givenOneElement_returnOneElement(){
        MovieZeros movieZeros = new MovieZeros();
        int[] result = movieZeros.movingTheZerosToEnd(new int[]{0}, 1);
        assertArrayEquals(new int[]{0}, result);
    }
}
