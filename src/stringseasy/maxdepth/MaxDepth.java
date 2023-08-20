package stringseasy.maxdepth;

public class MaxDepth {
    public int countMaxDepth(String word) {
        if (word == null || word.isEmpty()) {
            return 0;
        }else {
            int maxNestingDepth = 0;
            int currentDepth = 0;
            String name = word.trim();
            for (char c : name.toCharArray()) {
                if (c == '('){
                    currentDepth ++;
                    maxNestingDepth = Math.max(maxNestingDepth, currentDepth);
                } else if (c == ')') {
                    currentDepth--;
                }
            }
            return maxNestingDepth;
        }
    }
}
