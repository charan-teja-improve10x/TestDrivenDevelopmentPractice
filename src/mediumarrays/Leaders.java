package mediumarrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Leaders {
    public ArrayList<Integer> getLeaders(int[] numbers, int n) {
        if (numbers == null|| numbers.length == 0){
            return new ArrayList<>();
        }else {
            ArrayList<Integer> integers = new ArrayList<>();
            integers.add(numbers[0]);
            return integers;
        }
    }
}
