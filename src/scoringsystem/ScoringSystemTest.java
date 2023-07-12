package scoringsystem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ScoringSystemTest {

    private Score score;

    @BeforeEach
    public void setup(){
        score = new Score();
    }

    @Test
    public void nothing() {

    }

    @Test
    public void givenNull_allZeros() {
        int[] allZeros = score.calculateScores(null);
        Assertions.assertArrayEquals(new int[3], allZeros);
    }

    @Test
    public void givenA_returnOneZeroZero() {
        int[] onlyA = score.calculateScores("A");
        Assertions.assertArrayEquals(new int[]{1, 0 ,0}, onlyA);
    }

    @Test
    public void givenB_returnZeroOneZero() {
        int[] onlyB = score.calculateScores("B");
        Assertions.assertArrayEquals(new int[] { 0, 1, 0}, onlyB);
    }

    @Test
    public void givenC_returnZeroZeroOne() {
        int[] onlyC = score.calculateScores("C");
        Assertions.assertArrayEquals(new int[] {0, 0, 1}, onlyC);
    }

    @Test
    public void givenABC_returnAllOnes() {
        int[] allValues = score.calculateScores("ABC");
        Assertions.assertArrayEquals(new int[] {1, 1, 1}, allValues);
    }

    @Test
    public void givenAABC_returnTwoOneOne() {
        int[] aabcScores = score.calculateScores("AABC");
        Assertions.assertArrayEquals(new int[] {2, 1, 1}, aabcScores);
    }

    @Test
    public void givenAABBBC_returnTwoThreeOne() {
        int[] allValues = score.calculateScores("AABBBC");
        Assertions.assertArrayEquals(new int[] {2, 3, 1}, allValues);
    }

    @Test
    public void givenABCCCCC_returnOneOneFive() {
        int[] allValues = score.calculateScores("ABCCCCC");
        Assertions.assertArrayEquals(new int[] {1, 1, 5}, allValues);
    }
}
