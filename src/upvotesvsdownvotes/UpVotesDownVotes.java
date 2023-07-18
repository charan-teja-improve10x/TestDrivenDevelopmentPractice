package upvotesvsdownvotes;

public class UpVotesDownVotes {

    public static void main(String[] args) {
        System.out.println(getVoteCount(-33, 33));
    }

    public static int getVoteCount(int upVotes, int downVotes) {
        int result = 0;
        result = upVotes - downVotes;
        return result;
    }
}
