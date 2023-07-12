package scoringsystem;

import java.util.Arrays;

public class Score {

    public static void main(String[] args) {
        Score score = new Score();
        int[] scores = score.calculateScores("AAABBBCCC");
        System.out.println(Arrays.toString(scores));
    }
    public int[] calculateScores(String score) {
        int[] scores = new int[3];
        if (score != null) {
            for (int i = 0; i < score.length(); i++) {
                char c = score.charAt(i);
                if (c == 'A') {
                    scores[0]++;
                } else if (c == 'B') {
                    scores[1]++;
                } else if (c == 'C') {
                    scores[2]++;
                }
            }
        }
        return scores;
    }
}
