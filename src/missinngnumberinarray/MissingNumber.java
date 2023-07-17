package missinngnumberinarray;

public class MissingNumber {

    public static int findTheMissingNumberInAnArray(int[] numbers) {
        int total = 55;
        int sum = 0;
        for (int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }
        total = total- sum;
        return total;
    }
}
