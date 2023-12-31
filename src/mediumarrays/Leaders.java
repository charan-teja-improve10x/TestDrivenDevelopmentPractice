package mediumarrays;

import java.util.ArrayList;

public class Leaders {
    public ArrayList<Integer> getLeaders(int[] numbers, int n) {
        if (numbers == null || numbers.length == 0) {
            return new ArrayList<>();
        } else {
            ArrayList<Integer> integers = new ArrayList<>();
            n = numbers.length;
            for (int i = 0; i < n; i++) {
                boolean leader = true;
                for (int j = i + 1; j < n; j++) {
                    if (numbers[j] > numbers[i]) {
                        leader = false;
                        break;
                    }
                }
                if (leader) {
                    integers.add(numbers[i]);
                }
            }
            return integers;
        }
    }
}
