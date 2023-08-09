package mediumarrays;

import java.util.Arrays;

public class SortingZerosOnesTwos {
    public  int[] sorting(int[] num) {
        if (num == null || num.length == 0){
            return new int[]{};
        }else {
            Arrays.sort(num);
            return num;
        }
    }
}
