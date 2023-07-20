package findthebomb;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BombTest {

    private Bomb bomb;

    @BeforeEach
    public void setup(){
        bomb = new Bomb();
    }

    @Test
    public void nothing(){}

    @Test
    public void givenNull_returnEmpty(){
        String result = bomb.findBomb(null);
        assertEquals("", result);
    }
    @Test
    public void givenEmpty_returnEmpty(){
        String result = bomb.findBomb(null);
        assertEquals("", result);
    }
}
