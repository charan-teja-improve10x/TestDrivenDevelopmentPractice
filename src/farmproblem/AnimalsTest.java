package farmproblem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnimalsTest {

    private Animal animal;

    @BeforeEach
    public void setup(){
        animal = new Animal();
    }

    @Test
    public void nothing(){
    }

    @Test
    public void givenAllZeros_returnZero(){
        int totalLegs = animal.totalLegsCount(0, 0, 0);
        assertEquals(0, totalLegs);
    }

    @Test
    public void givenOneZeroZero_return2(){
        int totalLegs = animal.totalLegsCount(1, 0, 0);
        assertEquals(2, totalLegs);
    }

    @Test
    public void givenOneZeroOne_return6(){
        int totalLegs = animal.totalLegsCount(1, 0, 1);
        assertEquals(6, totalLegs);
    }

    @Test
    public void givenAllOnes_return10(){
        int totalLegs = animal.totalLegsCount(1, 1, 1);
        assertEquals(10, totalLegs);
    }

    @Test
    public void givenOneTwoFour_return26(){
        int totalLegs = animal.totalLegsCount(1, 2, 4);
        assertEquals(26, totalLegs);
    }
}
