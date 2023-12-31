package bowling;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameTest {

    private Game game;

    private void rollMany(int totalRolls, int pins) {
        for (int i = 0; i < totalRolls; i++){
            game.roll(pins);
        }
    }
    @BeforeEach
    public void setup(){
        game = new Game();
    }

    @Test
    public void nothing(){}

    @Test
    public void canRoll(){
        game.roll(1);
    }

    @Test
    public void gutterGame(){
        rollMany(20, 0);
        assertEquals(0, game.score());
    }

    @Test
    public void allOnes(){
        rollMany(20, 1);
        assertEquals(20, game.score());
    }

    @Test
    public void oneSpare(){
        game.roll(5);
        game.roll(5);
        game.roll(4);
        rollMany(17,0);
        assertEquals(18,game.score());
    }

    @Test
    public void oneStrike(){
        game.roll(10);
        game.roll(4);
        game.roll(2);
        rollMany(16,0);
        assertEquals(22,game.score());
    }

    @Test
    public void scoreBoard(){
        game.roll(7);
        game.roll(2);
        game.roll(10);
        game.roll(6);
        game.roll(4);
        game.roll(2);
        game.roll(5);
        game.roll(8);
        game.roll(1);
        game.roll(2);
        game.roll(2);
        game.roll(5);
        game.roll(5);
        game.roll(3);
        game.roll(3);
        game.roll(4);
        game.roll(2);
        game.roll(5);
        game.roll(5);
        game.roll(2);
        assertEquals(98, game.score());
    }

    @Test
    public void otherScoreBoard(){
        game.roll(7);
        game.roll(2);
        game.roll(10);
        game.roll(6);
        game.roll(4);
        game.roll(2);
        game.roll(5);
        game.roll(8);
        game.roll(1);
        game.roll(10);
        game.roll(5);
        game.roll(5);
        game.roll(3);
        game.roll(3);
        game.roll(4);
        game.roll(2);
        game.roll(5);
        game.roll(5);
        game.roll(2);
        assertEquals(114, game.score());
    }

    @Test
    public void charanScoreBoard(){
        game.roll(7);
        game.roll(2);
        game.roll(10);
        game.roll(6);
        game.roll(3);
        game.roll(2);
        game.roll(5);
        game.roll(8);
        game.roll(1);
        game.roll(4);
        game.roll(5);
        game.roll(6);
        game.roll(4);
        game.roll(7);
        game.roll(2);
        game.roll(4);
        game.roll(2);
        game.roll(5);
        game.roll(5);
        game.roll(2);
        assertEquals(106, game.score());
    }
}
