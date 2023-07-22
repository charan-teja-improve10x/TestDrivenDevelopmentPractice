package templerun;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class SpikePitTest {

    @Test
    public void givenMinusOne_throwsInvalidSpikePitWidthException(){
        assertThrows(SpikePit.InvalidSpikePitException.class,
                () -> new SpikePit(-1),
                "SpikePit Width should be between 0 to 100");
    }

}
