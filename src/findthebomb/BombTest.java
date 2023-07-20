package findthebomb;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BombTest {

    @Test
    public void nothing(){}

    @Test
    public void givenNull_returnEmpty(){
        Bomb bomb = new Bomb();
        String result = bomb.findBomb(null);
        assertEquals("", result);
    }
    @Test
    public void givenEmpty_returnEmpty(){
        Bomb bomb = new Bomb();
        String result = bomb.findBomb(null);
        assertEquals("", result);
    }
}
