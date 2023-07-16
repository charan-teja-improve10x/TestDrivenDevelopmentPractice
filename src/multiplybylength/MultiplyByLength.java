package multiplybylength;

import java.util.Arrays;

public class MultiplyByLength {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(multipleTheElementsWithLength(new int[] {0, 0, 0})));
    }
    public static int[] multipleTheElementsWithLength(int[] numbers) {
        for (int i = 0; i < numbers.length; i++){
            numbers[i] *= numbers.length;
        }
        return numbers;
    }
}
