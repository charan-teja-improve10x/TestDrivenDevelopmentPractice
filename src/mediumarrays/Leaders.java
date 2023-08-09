package mediumarrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Leaders {
    public ArrayList<Integer> getLeaders(int[] numbers, int n) {
        if (numbers == null|| numbers.length == 0){
            return new ArrayList<>();
        }else if (numbers.length == 1){
            ArrayList<Integer> integers = new ArrayList<>();
            integers.add(numbers[0]);
            return integers;
        }else{
            ArrayList<Integer> integers = new ArrayList<>();
             n = numbers.length;
            for (int i = 0; i < n; i++){
                boolean leader = true;
                for (int j = i + 1; j< n; j++){
                    if (numbers[j] > numbers[i]){
                        leader = false;
                        break;
                    }
                }
                if (leader){
                    integers.add(numbers[i]);
                }
            }
            return integers;
        }
    }
}
