package upvotesvsdownvotes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UpVotesDownVotesTest {

    private UpVotesDownVotes upVotesDownVotes;

    @BeforeEach
    public void setup() {
        upVotesDownVotes = new UpVotesDownVotes();
    }

    @Test
    public void nothing() {
    }

    @Test
    public void givenTwoZeros_returnZero() {
        int returnZero = upVotesDownVotes.getVoteCount(0, 0);
        assertEquals(0, returnZero);
    }

    @Test
    public void givenMinus33AndMinus22_returnMinus11() {
        int returnMinus11 = upVotesDownVotes.getVoteCount(-33, -22);
        assertEquals(-11, returnMinus11);
    }

    @Test
    public void givenOneZero_returnOne() {
        int returnOne = upVotesDownVotes.getVoteCount(1, 0);
        assertEquals(1, returnOne);
    }

    @Test
    public void givenTwoNumbers_returnZero() {
        int returnOne = upVotesDownVotes.getVoteCount(1, 12);
        assertEquals(-11, returnOne);
    }


    @Test
    public void given56And44_return100() {
        int return12 = upVotesDownVotes.getVoteCount(56, 44);
        assertEquals(12, return12);
    }

    @Test
    public void givenTwoSameNumbers_return0() {
        int return0 = upVotesDownVotes.getVoteCount(56, 56);
        assertEquals(0, return0);
    }
}
