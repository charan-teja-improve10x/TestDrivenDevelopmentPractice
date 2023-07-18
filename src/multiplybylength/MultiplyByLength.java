package multiplybylength;

import java.util.Arrays;
public class MultiplyByLength {

    public int[] multipleTheElementsWithLength(int[] numbers) {
        if (numbers.length == 0){
            return new int[]{};
        }else {
            for (int i = 0; i < numbers.length; i++){
                numbers[i] *= numbers.length;
            }
            return numbers;
        }
    }
}
