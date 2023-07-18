package missinngnumberinarray;

public class MissingNumber {



    public int findTheMissingNumberInAnArray(int[] numbers) {
        int total = 55;
        int sum = 0;
        if (numbers.length == 0) {
            return 0;
        } else {
            total = getMissingNumber(numbers, total, sum);
        }
        return total;
    }

    private static int getMissingNumber(int[] numbers, int total, int sum) {
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        total = total - sum;
        return total;
    }

}
