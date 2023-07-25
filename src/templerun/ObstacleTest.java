package templerun;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ObstacleTest {

    @Test
    public void nothing() {
    }

    @Test
    public void givenNameNull_whenGetNameCalled_thenReturnEmpty() throws Obstacle.InvalidObstacleDamageException {
        Obstacle obstacle = new Obstacle(null, 30);
        assertEquals("", obstacle.getName());
    }

    @Test
    public void givenNameEmpty_whenGetNameCalled_thenReturnEmpty() throws Obstacle.InvalidObstacleDamageException {
        Obstacle obstacle = new Obstacle("", 20);
        assertEquals("", obstacle.getName());
    }

    @Test
    public void givenFireBall_whenGetNameCalled_thenReturnFireBall() throws Obstacle.InvalidObstacleDamageException {
        Obstacle obstacle = new Obstacle("FireBall", 0);
        assertEquals("FireBall", obstacle.getName());
    }

    @Test
    public void givenFireBallWithSpaces_whenGetNameCalled_thenReturnFireBall() throws Obstacle.InvalidObstacleDamageException {
        Obstacle obstacle = new Obstacle("  FireBall ", 20);
        assertEquals("FireBall", obstacle.getName());
    }

    @Test
    public void givenDamageMinusOne_thenThrowsInvalidObstacleDamageException() {
        assertThrows(Obstacle.InvalidObstacleDamageException.class, () -> new Obstacle("Om", -1),
                "Obstacle damage should be 0 to 100");
    }

    @Test
    public void givenDamage101_thenThrowsInvalidObstacleDamageException() {
        assertThrows(Obstacle.InvalidObstacleDamageException.class, () -> new Obstacle("Om", 101),
                "Obstacle damage should be 0 to 100");
    }

    @Test
    public void givenDamage10_whenGetDamageCalled_thenReturn10() throws Obstacle.InvalidObstacleDamageException {
        Obstacle obstacle = new Obstacle("SpikePit", 10);
        assertEquals(10, obstacle.getDamage());
    }

    @Test
    public void whenCollideCalled_thenDamageHealth() throws Obstacle.InvalidObstacleDamageException, Player.InvalidHealthException {
        Obstacle obstacle = new Obstacle("Fireball", 30);
        Player player = new Player("Name");
        obstacle.collide(player);
        assertEquals(70, player.getHealth());
    }
}
