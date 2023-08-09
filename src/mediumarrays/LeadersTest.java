package mediumarrays;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeadersTest {

    @Test
    public void noting(){}

    @Test
    public void givenNull_returnEmptyList(){
        Leaders leaders = new Leaders();
        ArrayList<Integer> list = leaders.getLeaders(null, 0);
        assertEquals(new ArrayList<>(), list);
    }
}
