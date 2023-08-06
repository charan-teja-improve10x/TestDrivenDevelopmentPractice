package missingnumber;

public class MissingNumberArray {
    public int findTheMissingNumber(int[] numbers, int n) {
        if (numbers == null || numbers.length == 0) {
            return 0;
        }
        n = numbers.length;
        if (n == 1) {
            return numbers[0];
        } else {
            int sum = (n * (n + 1)) / 2;
            int sumTwo = 0;
            for (int i = 0; i < n -1; i++) {
                sumTwo += numbers[i];
            }
            int missedNUmber = sum - sumTwo;
            return missedNUmber;
        }
    }
}
