package templerun;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerTest {

    private ByteArrayOutputStream outputStream;

    @BeforeEach
    public void setup() {
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    public void givenNameNull_whenGetNameCalled_returnsEmpty() {
        Player player = new Player(null);
        assertEquals("", player.getName());
    }

    @Test
    public void givenNameEmpty_whenGetNameCalled_returnsEmpty() {
        Player player = new Player("");
        assertEquals("", player.getName());
    }

    @Disabled
    @Test
    public void givenNameExplorer_whenGetNameCalled_returnsExplorer() {
        Player player = new Player("Explorer");
        assertEquals("Explorer", player.getName());
    }

    @Disabled
    @Test
    public void givenNameExplorerWIthSpaces_whenGetNameCalled_returnsExplorerTrimmed() {
        Player player = new Player(" Explorer  ");
        assertEquals("Explorer", player.getName());
    }

    @Disabled
    @Test
    public void givenNoHealth_whenGetHealthCalled_returns100() {
        Player player = new Player("Name");
        assertEquals(100, player.getHealth());
    }

}
