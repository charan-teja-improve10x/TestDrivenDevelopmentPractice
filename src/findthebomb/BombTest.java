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
        String result = bomb.findBomb("");
        assertEquals("", result);
    }

    @Test
    public void givenC_returnRelaxThereIsNoBomb(){
        String result = bomb.findBomb("C");
        assertEquals("Relax, There is no Bomb.", result);
    }

    @Test
    public void givenCharan_returnRelaxThereIsNoBomb(){
        String result = bomb.findBomb("Charan");
        assertEquals("Relax, There is no Bomb.", result);
    }

    @Test
    public void givenBomb_returnBomb(){
        String result = bomb.findBomb("BOMB");
        assertEquals("DUCK!", result);
    }

    @Test
    public void givenABomb_returnBomb(){
        String result = bomb.findBomb("Suresh throws a bomb");
        assertEquals("DUCK!", result);
    }
}
